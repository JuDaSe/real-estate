
package models;

import models.ConnectMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserModel {
    
    private String email;
    private String password;
    private String name;
    private String lastname;
    private int CI;
    private String message;
    private boolean isadmin;
    
    public UserModel(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public UserModel(boolean admin){
        this.isadmin = admin;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public void saveToDataBase(){
        String sql = "INSERT INTO adminsitrator(name, lastname, passwrd, email, CI, isAdmin) VALUES ( ?, ?, ?, ?, ?, ?)";
        
        try( Connection conn = ConnectMySQL.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, this.CI);
            pstmt.setString(2, this.name);
            pstmt.setString(3,this.lastname);
            pstmt.setString(4, this.email);
            pstmt.setString(5, this.password);
            
            
            System.out.println("Usuario guardado en la base de datos");
        } catch(SQLException e){
            System.out.print( e.getMessage() + "Error al guardad la propeidad");
        }
        
        }
    
    public void cargarMensajes(){
        String sql = "SELECT * FROM administrator WHERE id = ?";
        
        try( Connection conn = ConnectMySQL.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, this.CI);
            pstmt.setString(2, this.name);
            pstmt.setString(3,this.lastname);
            pstmt.setString(4, this.email);
            pstmt.setString(5, this.password);
            
            
            System.out.println("Usuario guardado en la base de datos");
        } catch(SQLException e){
            System.out.print( e.getMessage() + "Error al guardad la propeidad");
        }
        
        }
    
    public UserModel(String name,String lastname, String password, String email, int CI, boolean isadmin){
    
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.CI = CI;
        this.isadmin = isadmin;
        
        saveToDataBase();
    }
}
