
package models;

public class PropertyModel {
    
    int id;
    double price;
    String description;
    int size;
    String owner;
    String location;

    public PropertyModel(double price, String description, int size, String owner, String location) {
        this.price = price;
        this.description = description;
        this.size = size;
        this.owner = owner;
        this.location = location;
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
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    
}
