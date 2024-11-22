
package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    
    private static final String direccion = "jdbc:mysql://localhost:3306/inmobiliaria";
    private static final String usuario = "root";
    private static final String contraseña = ""; 

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos:");
            e.printStackTrace();
        }    
    }

 public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(direccion, usuario, contraseña);
    }
}