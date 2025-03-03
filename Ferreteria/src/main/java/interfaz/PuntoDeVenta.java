package interfaz;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PuntoDeVenta extends javax.swing.JFrame {

    static String user;
    static String pass;
    public DefaultTableModel datos = new DefaultTableModel();

    public PuntoDeVenta(String User, String Pass) {
        this.user = User;
        this.pass = Pass;
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        initComponents();
        tblFacturacion.setModel(datos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FCliente = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IDCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NombreC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ApellidoC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TelefonoC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInsertarC = new javax.swing.JButton();
        CorreoC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDClienteV = new javax.swing.JTextField();
        btnCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        IDProductoV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CantidadV = new javax.swing.JTextField();
        AgregarDetalleVenta = new javax.swing.JButton();
        btnInsertarJ3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturacion = new javax.swing.JTable();
        txtTotal = new javax.swing.JLabel();
        txtTotal1 = new javax.swing.JLabel();
        btnCliente1 = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();

        FCliente.setMinimumSize(new java.awt.Dimension(300, 600));
        FCliente.setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Datos Cliente");

        IDCliente.setBackground(new java.awt.Color(255, 255, 255));
        IDCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDCliente.setForeground(new java.awt.Color(0, 0, 0));
        IDCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Nombres");

        NombreC.setBackground(new java.awt.Color(255, 255, 255));
        NombreC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreC.setForeground(new java.awt.Color(0, 0, 0));
        NombreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Apellidos");

        ApellidoC.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ApellidoC.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Telefono");

        TelefonoC.setBackground(new java.awt.Color(255, 255, 255));
        TelefonoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelefonoC.setForeground(new java.awt.Color(0, 0, 0));
        TelefonoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("Correo");

        btnInsertarC.setBackground(new java.awt.Color(0, 153, 51));
        btnInsertarC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertarC.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarC.setText("INSERTAR");
        btnInsertarC.setBorder(null);
        btnInsertarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCActionPerformed(evt);
            }
        });

        CorreoC.setBackground(new java.awt.Color(255, 255, 255));
        CorreoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CorreoC.setForeground(new java.awt.Color(0, 0, 0));
        CorreoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 51));
        jLabel13.setText("N° Identificación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInsertarC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(TelefonoC, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(IDCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(NombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(ApellidoC, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(CorreoC, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnInsertarC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout FClienteLayout = new javax.swing.GroupLayout(FCliente.getContentPane());
        FCliente.getContentPane().setLayout(FClienteLayout);
        FClienteLayout.setHorizontalGroup(
            FClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FClienteLayout.setVerticalGroup(
            FClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Punto de Venta");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("ID Cliente");

        IDClienteV.setBackground(new java.awt.Color(255, 255, 255));
        IDClienteV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDClienteV.setForeground(new java.awt.Color(0, 0, 0));
        IDClienteV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        btnCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("REGISTRAR CLIENTE");
        btnCliente.setBorder(null);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("ID Producto");

        IDProductoV.setBackground(new java.awt.Color(255, 255, 255));
        IDProductoV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDProductoV.setForeground(new java.awt.Color(0, 0, 0));
        IDProductoV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Cantidad");

        CantidadV.setBackground(new java.awt.Color(255, 255, 255));
        CantidadV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantidadV.setForeground(new java.awt.Color(0, 0, 0));
        CantidadV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        AgregarDetalleVenta.setBackground(new java.awt.Color(51, 51, 255));
        AgregarDetalleVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgregarDetalleVenta.setForeground(new java.awt.Color(255, 255, 255));
        AgregarDetalleVenta.setText("AGREGAR");
        AgregarDetalleVenta.setBorder(null);
        AgregarDetalleVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDetalleVentaActionPerformed(evt);
            }
        });

        btnInsertarJ3.setBackground(new java.awt.Color(51, 51, 255));
        btnInsertarJ3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertarJ3.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarJ3.setText("FINALIZAR");
        btnInsertarJ3.setBorder(null);
        btnInsertarJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarJ3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 51));
        jLabel12.setText("TOTAL");

        tblFacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacturacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacturacion);

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("------------");

        txtTotal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal1.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AgregarDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertarJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantidadV)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotal)
                    .addComponent(txtTotal1))
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnCliente1.setBackground(new java.awt.Color(51, 51, 255));
        btnCliente1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente1.setText("CONFIRMAR ID");
        btnCliente1.setBorder(null);
        btnCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente1ActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 102, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(204, 0, 0));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("INVENTARIO");
        btnInventario.setBorder(null);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(btnInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        FCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void AgregarDetalleVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDetalleVentaActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query = "EXEC sp_DetalleVenta " + IDProductoV.getText() + ", " + CantidadV.getText();
            Statement st = con.conectar.createStatement();
            st.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String query2 = "SELECT * from tblInventario where IDProducto = " + IDProductoV.getText();
            Statement st = con.conectar.createStatement();

            PreparedStatement ps = con.conectar.prepareStatement(query2);
            ResultSetMetaData meta = ps.getMetaData();

            int nColumnas = meta.getColumnCount();

            Vector<String> ids = new Vector<>();

            for (int i = 1; i <= nColumnas; i++) {
                ids.add(meta.getColumnName(i));
            }

            ids.add("Cantidad");
            ids.add("Total");
            datos.setColumnIdentifiers(ids);

            float totalP = 0;

            ResultSet res = st.executeQuery(query2);

            while (res.next()) {
                Vector<String> Fila = new Vector<>();
                for (int i = 1; i <= nColumnas; i++) {
                    if (i == 3) {
                        totalP = res.getFloat(i) * Float.parseFloat(String.valueOf(CantidadV.getText()));
                    }
                    Fila.add(res.getString(i));

                }
                Fila.add(CantidadV.getText());
                Fila.add(String.valueOf(totalP));
                datos.addRow(Fila);
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_AgregarDetalleVentaActionPerformed

    private void btnInsertarJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarJ3ActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query = "EXEC sp_Totalizador ";
            Statement st = con.conectar.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                txtTotal.setText(String.valueOf(rs.getObject("TotalFactura")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInsertarJ3ActionPerformed

    private void btnInsertarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query1 = "SELECT * from tblClientes where IDCliente = " + IDCliente.getText();
            Statement st = con.conectar.createStatement();

            ResultSet rs = st.executeQuery(query1);

            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "El cliente ya se encuentra registrado (revise si el numero de identificación es correcto)");
            } else {
                String query = "EXEC sp_IngresoClientes " + IDCliente.getText() + ", '" + NombreC.getText() + "', '" + ApellidoC.getText() + "', " + TelefonoC.getText() + ", '" + CorreoC.getText() + "'";
                st.execute(query);
                JOptionPane.showMessageDialog(this, "El cliente " + NombreC.getText() + " ha sido agregado correctamente");
                IDCliente.setText("");
                NombreC.setText("");
                ApellidoC.setText("");
                TelefonoC.setText("");
                CorreoC.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInsertarCActionPerformed

    private void btnCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente1ActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query = "EXEC sp_Venta " + IDClienteV.getText();
            Statement st = con.conectar.createStatement();
            st.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCliente1ActionPerformed

    private void tblFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturacionMouseClicked

    }//GEN-LAST:event_tblFacturacionMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        InicioSesion ventana = new InicioSesion();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        JInventario ventana = new JInventario(user, pass);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoDeVenta(user, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDetalleVenta;
    public javax.swing.JTextField ApellidoC;
    public javax.swing.JTextField CantidadV;
    public javax.swing.JTextField CorreoC;
    private javax.swing.JFrame FCliente;
    public javax.swing.JTextField IDCliente;
    public javax.swing.JTextField IDClienteV;
    public javax.swing.JTextField IDProductoV;
    public javax.swing.JTextField NombreC;
    public javax.swing.JTextField TelefonoC;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente1;
    private javax.swing.JButton btnInsertarC;
    private javax.swing.JButton btnInsertarJ3;
    private javax.swing.JButton btnInventario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFacturacion;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotal1;
    // End of variables declaration//GEN-END:variables
}
