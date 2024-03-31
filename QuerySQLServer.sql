CREATE DATABASE FerreteriaDB
USE FerreteriaDB

--USUARIOS: Vendedor, Inventario--

CREATE TABLE tblCategorias(
	IDCategoria int identity primary key,
	NombreC varchar(15)
)

INSERT INTO tblCategorias
VALUES
('Manuales'),
('Eléctricas'),
('Edición'),
('Seguridad');

CREATE TABLE tblInventario(
	IDProducto int primary key,
	Descripcion varchar(20),
	ValorUnitario numeric,
	Stock int,
	IDCategoria int
	FOREIGN KEY(IDCategoria) REFERENCES tblCategorias(IDCategoria)
)

INSERT INTO tblInventario
VALUES
(1, 'Martillo', 20000, 50, 1),
(2, 'Taladro', 50000, 76, 2),
(3, 'Metro', 10000, 100, 3),
(4, 'Casco de seguridad', 50000, 72, 4),
(5, 'Llave inglesa', 15000, 120, 1),
(6, 'Alicates', 20000, 101, 1),
(7, 'Sierra circular', 80000, 30, 2),
(8, 'Nivel', 5000, 100, 3),
(9, 'Gafas de seguridad', 30000, 80, 4),
(10, 'Destornillador', 10000, 150, 1),
(11, 'Martillo demoledor', 100000, 80, 2),
(12, 'Cinta métrica', 20000, 100, 3),
(13, 'Guantes de seguridad', 20000, 120, 4),
(14, 'Llave fija', 20000, 120, 1),
(15, 'Cinta aislante', 10000, 150, 3),
(16, 'Botas de seguridad', 50000, 70, 4);

CREATE TABLE tblClientes(
	IDCliente int primary key,
	Nombre varchar(20),
	Apellidos varchar(20),
	Telefono varchar(15),
	Correo varchar(50)
)

INSERT INTO tblClientes
VALUES
(1, 'Juan', 'Perez', '3000000001', 'juan.perez@gmail.com'),
(2, 'Maria', 'Rodriguez', '3000000002', 'maria.rodriguez@gmail.com'),
(3, 'Pedro', 'Sanchez', '3000000003', 'pedro.sanchez@gmail.com'),
(4, 'Ana', 'Martinez', '3000000004', 'ana.martinez@gmail.com'),
(5, 'Luis', 'Gonzalez', '3000000005', 'luis.gonzalez@gmail.com'),
(6, 'Laura', 'Flores', '3000000006', 'laura.flores@gmail.com'),
(7, 'Daniel', 'Gomez', '3000000007', 'daniel.gomez@gmail.com'),
(8, 'Sofia', 'Torres', '3000000008', 'sofia.torres@gmail.com'),
(9, 'Carlos', 'Acosta', '3000000009', 'carlos.acosta@gmail.com'),
(10, 'Valentina', 'Muñoz', '3000000010', 'valentina.munoz@gmail.com'),
(11, 'Juan Pablo', 'Castro', '3000000011', 'juanpablo.castro@gmail.com'),
(12, 'Mariana', 'Lopez', '3000000012', 'mariana.lopez@gmail.com'),
(13, 'Pablo', 'Ruiz', '3000000013', 'pablo.ruiz@gmail.com'),
(14, 'Andrea', 'Diaz', '3000000014', 'andrea.diaz@gmail.com'),
(15, 'Diego', 'Martin', '3000000015', 'diego.martin@gmail.com'),
(16, 'Sofia', 'Pérez', '3000000016', 'sofia.perez@gmail.com'),
(17, 'Carlos', 'González', '3000000017', 'carlos.gonzalez@gmail.com');

CREATE TABLE tblFactura(
	IDFactura int identity primary key,
	Fecha date,
	IDCliente int,
	TotalFactura numeric,
	FOREIGN KEY (IDCliente) REFERENCES tblClientes(IDCliente)
)

CREATE TABLE tblDetalleFactura(
	IDDetalle int identity primary key,
	IDFactura int,
	IDProducto int,
	Cantidad int,
	FOREIGN KEY(IDFactura) REFERENCES tblFactura(IDFactura),
	FOREIGN KEY(IDProducto) REFERENCES tblInventario(IDProducto)
)

ALTER TABLE tblFactura
ADD CONSTRAINT [FK_IDClient_Fact] FOREIGN KEY ([IDCliente]) REFERENCES [dbo].[tblClientes]([IDCliente])

INSERT INTO tblFactura
VALUES('2023-03-17', 16, 0)


EXEC sp_DetalleVenta 4, 10
EXEC sp_DetalleVenta 12, 23
EXEC sp_DetalleVenta 3, 15
EXEC sp_DetalleVenta 2, 5
EXEC sp_DetalleVenta 12, 5


select * from tblFactura 
select * from tblDetalleFactura 
select * from tblInventario

--Calcular total factura--
GO
CREATE TRIGGER tr_TotalFactura
ON tblDetalleFactura
FOR INSERT
AS
DECLARE @TotalFactura numeric
DECLARE @IDProducto int
DECLARE @ValorUnitario numeric
SELECT @IDProducto = IDProducto FROM inserted
SELECT @ValorUnitario = ValorUnitario FROM tblInventario WHERE IDProducto = @IDProducto
SELECT @TotalFactura = SUM(Cantidad * @ValorUnitario) FROM inserted
UPDATE tblFactura
SET TotalFactura = @TotalFactura WHERE IDFactura = (SELECT IDFactura FROM inserted)

--Descontar producto de stock--
GO
CREATE TRIGGER tr_DescuentoStock
ON tblDetalleFactura
FOR INSERT
AS
DECLARE @IDProducto int
DECLARE @CantidadF int
DECLARE @CantidadS int
DECLARE @NCantidad int
SELECT @IDProducto = IDProducto FROM inserted
SELECT @CantidadS = Stock FROM tblInventario WHERE IDProducto = @IDProducto
SELECT @CantidadF = Cantidad FROM inserted WHERE IDProducto = @IDProducto
SET @NCantidad =  @CantidadS - @CantidadF
UPDATE tblInventario
SET Stock = @NCantidad WHERE IDProducto = @IDProducto

--Registro de categorias--
GO
CREATE PROCEDURE sp_IngresoCategorias
@NombreC varchar(15)
AS
INSERT INTO tblCategorias VALUES(@NombreC)
SELECT * FROM tblCategorias

--Registro de productos--
GO
CREATE PROCEDURE sp_IngresoProductos
@IDProducto int,
@Descripcion varchar(20),
@Valor numeric,
@Stock int,
@NombreC varchar(15)
AS
DECLARE @IDCategoria int
SELECT @IDCategoria=IDCategoria FROM tblCategorias WHERE NombreC LIKE(@NombreC)
INSERT INTO tblInventario VALUES(@IDProducto, @Descripcion, @Valor, @Stock, @IDCategoria)

--Ingreso de informacion de clientes--
GO
CREATE PROCEDURE sp_IngresoClientes
@IDCliente int,
@Nombre varchar(20),
@Apellidos varchar(20),
@Telefono int,
@Correo varchar(20)
AS
INSERT INTO tblClientes VALUES(@IDCliente, @Nombre, @Apellidos, @Telefono, @Correo)

--Registro de venta--
GO
CREATE PROCEDURE sp_Venta
@IDCliente int
AS
INSERT INTO tblFactura VALUES(GETDATE(), @IDCliente, 0)

--Registro detalle factura--
GO
CREATE PROCEDURE sp_DetalleVenta
@IDProducto int,
@Cantidad int
AS
DECLARE @IDFactura int
SELECT TOP 1 @IDFactura=IDFactura FROM tblFactura ORDER BY IDFactura DESC
INSERT INTO tblDetalleFactura VALUES(@IDFactura, @IDProducto, @Cantidad)

--Eliminar un producto--
GO
CREATE PROCEDURE sp_EliminarProducto
@IDProducto int
AS
DELETE FROM tblInventario WHERE IDProducto = @IDProducto

--Modificar un producto--
GO
CREATE PROCEDURE sp_ModificarProducto
@IDProducto int,
@Descripcion varchar(20),
@Valor numeric,
@Stock int
AS
UPDATE tblInventario
SET 
Descripcion = @Descripcion,
ValorUnitario = @Valor,
Stock = @Stock
WHERE IDProducto = @IDProducto

--Mostrar total factura--
GO
CREATE PROCEDURE sp_Totalizador
AS
SELECT TOP 1 TotalFactura FROM tblFactura ORDER BY TotalFactura DESC

SELECT * FROM tblFactura

/*BODEGA DE DATOS*/
USE master
CREATE DATABASE BodegaFerreteriaDB
USE BodegaFerreteriaDB

CREATE TABLE dimensionCategorias(
	IDCategoria int primary key,
	NombreC varchar(15)
)

CREATE TABLE dimensionInventario(
	IDProducto int primary key,
	Descripcion varchar(20),
	ValorUnitario numeric,
	Stock int,
)

CREATE TABLE dimensionClientes(
	IDCliente int primary key,
	Nombre varchar(20),
	Apellidos varchar(20),
	Telefono varchar(15),
	Correo varchar(50)
)

CREATE TABLE dimensionFactura(
	IDFactura int primary key,
	Fecha date,
	TotalFactura numeric
)

CREATE TABLE dimensionDetalleFactura(
	IDDetalle int primary key,
	Cantidad int,
)

CREATE TABLE HechosVentas(
	IDHecho int identity primary key,
	IDCategoria int,
	IDFactura int,
	IDDetalle int,
	IDCliente int,
	IDProducto int,
	FOREIGN KEY(IDCategoria) REFERENCES dimensionCategorias(IDCategoria),
	FOREIGN KEY(IDFactura) REFERENCES dimensionFactura(IDFactura),
	FOREIGN KEY(IDDetalle) REFERENCES dimensionDetalleFactura(IDDetalle),
	FOREIGN KEY(IDCliente) REFERENCES dimensionClientes(IDCliente),
	FOREIGN KEY(IDProducto) REFERENCES dimensionInventario(IDProducto)
)

--PROCEDURE: Migrar datos--
GO
CREATE PROCEDURE sp_ETL
@FechaI date,
@FechaF date
AS
/*Paso de datos a la dimensionCategorias*/
INSERT INTO BodegaFerreteriaDB.dbo.dimensionCategorias(IDCategoria, NombreC)
SELECT FerreteriaDB.dbo.tblCategorias.IDCategoria, FerreteriaDB.dbo.tblCategorias.NombreC
FROM FerreteriaDB.dbo.tblCategorias
LEFT OUTER JOIN BodegaFerreteriaDB.dbo.dimensionCategorias ON dimensionCategorias.IDCategoria = FerreteriaDB.dbo.tblCategorias.IDCategoria
WHERE dimensionCategorias.IDCategoria IS NULL
/*Paso de datos a la dimensionInventario*/
INSERT INTO BodegaFerreteriaDB.dbo.dimensionInventario(IDProducto, Descripcion, ValorUnitario, Stock)
SELECT FerreteriaDB.dbo.tblInventario.IDProducto, FerreteriaDB.dbo.tblInventario.Descripcion, FerreteriaDB.dbo.tblInventario.ValorUnitario, FerreteriaDB.dbo.tblInventario.Stock
FROM FerreteriaDB.dbo.tblInventario
LEFT OUTER JOIN BodegaFerreteriaDB.dbo.dimensionInventario ON dimensionInventario.IDProducto = FerreteriaDB.dbo.tblInventario.IDProducto
WHERE dimensionInventario.IDProducto IS NULL
/*Paso de datos a la dimensionClientes*/
INSERT INTO BodegaFerreteriaDB.dbo.dimensionClientes(IDCliente, Nombre, Apellidos, Telefono, Correo)
SELECT FerreteriaDB.dbo.tblClientes.IDCliente, FerreteriaDB.dbo.tblClientes.Nombre, FerreteriaDB.dbo.tblClientes.Apellidos, FerreteriaDB.dbo.tblClientes.Telefono, FerreteriaDB.dbo.tblClientes.Correo
FROM FerreteriaDB.dbo.tblClientes
LEFT OUTER JOIN BodegaFerreteriaDB.dbo.dimensionClientes ON dimensionClientes.IDCliente = FerreteriaDB.dbo.tblClientes.IDCliente
WHERE BodegaFerreteriaDB.dbo.dimensionClientes.IDCliente IS NULL
/*Paso de datos a la dimensionFactura*/
INSERT INTO BodegaFerreteriaDB.dbo.dimensionFactura(IDFactura, Fecha, TotalFactura)
SELECT FerreteriaDB.dbo.tblFactura.IDFactura, FerreteriaDB.dbo.tblFactura.Fecha, FerreteriaDB.dbo.tblFactura.TotalFactura
FROM FerreteriaDB.dbo.tblFactura
LEFT OUTER JOIN BodegaFerreteriaDB.dbo.dimensionFactura ON dimensionFactura.IDFactura = FerreteriaDB.dbo.tblFactura.IDFactura
WHERE dimensionFactura.IDFactura IS NULL
/*Paso de datos a la dimensionDetalleFactura*/
INSERT INTO BodegaFerreteriaDB.dbo.dimensionDetalleFactura(IDDetalle, Cantidad)
SELECT FerreteriaDB.dbo.tblDetalleFactura.IDDetalle, FerreteriaDB.dbo.tblDetalleFactura.Cantidad
FROM FerreteriaDB.dbo.tblDetalleFactura
LEFT OUTER JOIN BodegaFerreteriaDB.dbo.dimensionDetalleFactura ON dimensionDetalleFactura.IDDetalle = FerreteriaDB.dbo.tblDetalleFactura.IDDetalle
WHERE dimensionDetalleFactura.IDDetalle IS NULL
/*Paso de datos a la tabla de HechosVenta*/
INSERT INTO BodegaFerreteriaDB.dbo.HechosVentas(IDCategoria, IDFactura, IDDetalle, IDCliente, IDProducto)
SELECT FerreteriaDB.dbo.tblCategorias.IDCategoria, FerreteriaDB.dbo.tblFactura.IDFactura, FerreteriaDB.dbo.tblDetalleFactura.IDDetalle, FerreteriaDB.dbo.tblFactura.IDCliente, FerreteriaDB.dbo.tblDetalleFactura.IDProducto
FROM FerreteriaDB.dbo.tblCategorias INNER JOIN FerreteriaDB.dbo.tblInventario 
ON FerreteriaDB.dbo.tblCategorias.IDCategoria = FerreteriaDB.dbo.tblInventario.IDCategoria INNER JOIN FerreteriaDB.dbo.tblDetalleFactura
ON FerreteriaDB.dbo.tblInventario.IDProducto = FerreteriaDB.dbo.tblDetalleFactura.IDProducto INNER JOIN FerreteriaDB.dbo.tblFactura
ON FerreteriaDB.dbo.tblDetalleFactura.IDFactura = FerreteriaDB.dbo.tblFactura.IDFactura LEFT OUTER JOIN BodegaFerreteriaDB.dbo.HechosVentas
ON HechosVentas.IDFactura =FerreteriaDB.dbo.tblDetalleFactura.IDFactura
/*Condicional para paso de datos entre las fechas ingresadas*/
WHERE HechosVentas.IDFactura IS NULL AND (FerreteriaDB.dbo.tblFactura.Fecha >= @FechaI AND FerreteriaDB.dbo.tblFactura.Fecha <= @FechaF)

EXEC sp_ETL '2023-01-01', '2023-03-20'

SELECT * FROM dimensionCategorias
SELECT * FROM dimensionInventario
SELECT * FROM dimensionClientes
SELECT * FROM dimensionFactura
SELECT * FROM dimensionDetalleFactura

SELECT dimensionFactura.Fecha, dimensionClientes.Nombre, dimensionClientes.Apellidos, dimensionFactura.TotalFactura
from dimensionFactura inner join HechosVentas 
on dimensionFactura.IDFactura = HechosVentas.IDFactura inner join dimensionClientes
on HechosVentas.IDCliente = dimensionClientes.IDCliente

GO
CREATE PROCEDURE sp_BACKUP
@NombreDB varchar(50),
@Ruta varchar(500)
AS
DECLARE @Direccion varchar(600)
set @Direccion = @Ruta + '.bak'
BACKUP DATABASE @NombreDB TO DISK = @Direccion

GO
CREATE PROCEDURE sp_RESTORE
@NombreDB varchar(50),
@Ruta varchar(500)
AS
RESTORE DATABASE @NombreDB FROM DISK = @Ruta

EXEC sp_BACKUP 'BodegaFerreteriaDB', 'E:\Prueba'
EXEC sp_RESTORE 'BodegaFerreteriaDB', 'E:\PROYECTOS FINALES\BaseDeDatos234234.bak'

RESTORE DATABASE BodegaFerreteriaDB FROM DISK = 'E:\PROYECTOS FINALES\BaseDeDatos234234.bak'
RESTORE DATABASE BodegaFerreteriaDB FROM DISK = 'E:\CopiaBodega.bak'
CREATE DATABASE BodegaFerreteriaDB