
package models;

import models.ConnectMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    
    public void saveToDataBase(){
        String sql = "INSERT INTO property(ID, price, description, size, location, isRental, isSale, type, owner) VALUES (?,?,?,?,?,?,?,?,?)";
        
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
            pstmt.executeUpdate();
            
            System.out.println("Propiedad guardada en la base de datos");
            
        } catch(SQLException e) {
            System.err.println("Error al guardad la propiedad: " + e.getMessage());
        }
    }
    
        public PropertyModel(double price, String description, int size,
            String location, boolean isRental, boolean isSale, String type, String owner) {
        this.price = price;
        this.description = description;
        this.size = size;
        this.location = location;
        this.isRental = isRental;
        this.isSale = isSale;
        this.type = type;
        this.owner = owner;
        
        saveToDataBase();
    }
    
    
    
    
}
