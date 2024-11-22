
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PropertyModel {
    
    private int id;
    private double price;
    private String description;
    private int size;
    private String owner;
    private String location;
    private boolean isRental;
    private boolean isSale;
    private String type;
    private byte[] images;
    
    
     public PropertyModel(Double precio, String descripcion, int id, String locacion, boolean enRenta, boolean enVenta, String tipo, String dueño, byte[] imageBytes) {
        this.id = id;
        cargarDatosBD(id);
    }

    public boolean isIsRental() {
        return isRental;
    }

    public boolean isIsSale() {
        return isSale;
    }

    public String getType() {
        return type;
    }

    public byte[] getImages() {
        return images;
    }
     
     

    public void setIsRental(boolean isRental) {
        this.isRental = isRental;
    }

    public void setIsSale(boolean isSale) {
        this.isSale = isSale;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }
     
     
     
    public int getId() {
        return id;  // Solo devuelve el ID, sin cargar datos
    }
            // Getters
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }
    
    // Setters
    public void setPrice(double price) {
        if(price >= 0){
        this.price = price;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(int size) {
        if(size > 0){
        this.size = size;
        } else {
        throw new IllegalAccessError("El tamaño debe ser mayor a cero");
        }
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PropertyModel{" + "id=" + id + ", price=" + price + ", description=" + description + ", size=" + size + ", owner=" + owner + ", location=" + location + '}';
    }
    
    public void guardarBaseDatos(){
        String sql = "INSERT INTO property(ID, price, description, size, location, isRental, isSale, type, agent, images) VALUES (?, ?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = ConnectMySQL.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                     
            pstmt.setInt(1, this.id);
            pstmt.setDouble(2, this.price);
            pstmt.setString(3, this.description);
            pstmt.setInt(4, this.size);
            pstmt.setString(5, this.location);
            pstmt.setBoolean(6, this.isRental);
            pstmt.setBoolean(7, this.isSale);
            pstmt.setString(8, this.type);
            pstmt.setString(9, this.owner);
            pstmt.setBytes(10, this.images);
            pstmt.executeUpdate();
            
            System.out.println("Propiedad guardada en la base de datos");
            
        } catch(SQLException e) {
            System.err.println("Error al guardad la propiedad: " + e.getMessage());
        }
    }
    
    // precio, descripcion, tamaño, locacion, enRenta, enVenta, tipo, dueño, imageBytes
    public void actualizarDatos(double precio, String descripcion, int tamaño, String locacion, boolean enRenta, boolean enVenta, String tipo,String dueño,byte[] imageBytes, int idProperty){
        String sql = "UPDATE property SET price = ?, description = ?, size = ?, location = ?, isRental = ?, isSale = ?, type = ?, agent = ?, images = ? WHERE id = ?";
        
        try (Connection conn = ConnectMySQL.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
           
            pstmt.setDouble(1, precio);
            pstmt.setString(2, descripcion);
            pstmt.setInt(3, tamaño);
            pstmt.setString(4, locacion);
            pstmt.setInt(5, enRenta ? 1 : 0);
            pstmt.setInt(6, enVenta ? 1 : 0);
            pstmt.setString(7, tipo);
            pstmt.setString(8, dueño);
            pstmt.setBytes(9, imageBytes);
            pstmt.setInt(10, idProperty);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Propiedad actualizada en la base de datos!");
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la propiedad: " + e.getMessage());
            System.err.println(e);
        }
    }
    
    public void borrarDatos(int idProperty){
        String sql = "DELETE FROM property WHERE id = ?";
        
        try (Connection conn = ConnectMySQL.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idProperty);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Propiedad borrada de la base de datos!");
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al borrar la propiedad: " + e.getMessage());
            System.err.println(e);
        }
    }
        private void cargarDatosBD(int id) {
          String sql = "SELECT * FROM property WHERE ID = ?";

          try (Connection conn = ConnectMySQL.getConnection();
               PreparedStatement pstmt = conn.prepareStatement(sql)) {

              pstmt.setInt(1, id);
              ResultSet rs = pstmt.executeQuery();

              if (rs.next()) {
                  this.price = rs.getDouble("price");
                  this.description = rs.getString("description");
                  this.size = rs.getInt("size");
                  this.location = rs.getString("location");
                  this.isRental = rs.getBoolean("isRental");
                  this.isSale = rs.getBoolean("isSale");
                  this.type = rs.getString("type");
                  this.owner = rs.getString("agent");
                  this.images = rs.getBytes("images");
                  JOptionPane.showConfirmDialog(null, "Propiedad cargada desde la base de datos");
              } else {
                  JOptionPane.showConfirmDialog(null, "Propiedad con ID " + id + " no encontrada.");
              }

          } catch (SQLException e) {
              JOptionPane.showConfirmDialog(null, "Error al cargar la propiedad: " + e.getMessage());
          }
      }
        
        public PropertyModel(){
            
        }
        
        public PropertyModel(int id, String location,byte[] images){
            this.id = id;
            this.location = location;
            this.images = images;
        }
        
        public PropertyModel(double price, String description, int size,
            String location, boolean isRental, boolean isSale, String type, String owner,byte[] images, int id) {
        this.price = price;
        this.description = description;
        this.size = size;
        this.location = location;
        this.isRental = isRental;
        this.isSale = isSale;
        this.type = type;
        this.owner = owner;
        this.images = images;
        this.id = id;
        
        guardarBaseDatos();
    }     
        
        public PropertyModel(double price, String description, int size,
            String location, boolean isRental, boolean isSale, String type, String owner,byte[] images) {
        this.price = price;
        this.description = description;
        this.size = size;
        this.location = location;
        this.isRental = isRental;
        this.isSale = isSale;
        this.type = type;
        this.owner = owner;
        this.images = images;
        
        guardarBaseDatos();
    }       
        
}
