
package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {

    // Método principal donde empieza la ejecución del programa
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/inmobiliaria";
        String usuario = "root";
        String contraseña = ""; 

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver MySQL cargado con éxito.");

            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado con éxito a la base de datos.");

            Statement statement = conexion.createStatement();
            String consultaSQL = "SELECT nombre FROM empleados";

            ResultSet resultado = statement.executeQuery(consultaSQL);

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                System.out.println("Nombre: " + nombre);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}