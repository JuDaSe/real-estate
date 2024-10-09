
package models;

public class UserModel {
    
    private String email;
    private String password;
    private String name;
    private String lastname;
    private boolean admin;
    
    public UserModel(String name,String lastname, String password, String email){
    
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
    }
    
    public UserModel(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public UserModel(boolean admin){
        this.admin = admin;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
