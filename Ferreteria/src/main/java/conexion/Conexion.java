package conexion;

import java.sql.*;

public class Conexion{
    public Connection conectar = null;
    
    String usuario;
    String password;
    String bd;
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + "/" + bd;
    
    public Conexion(String User, String Pass, String DB){
        this.usuario = User;
        this.password = Pass;
        this.bd = DB;
    }
    
    public Connection establecerConexion() {

        try {
            String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + bd+ ";TrustServerCertificate=True";
            conectar = DriverManager.getConnection(cadena, usuario, password);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conectar;
    }
}
