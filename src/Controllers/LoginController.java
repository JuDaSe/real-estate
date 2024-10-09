package Controllers;

import models.LoginModel;   
import models.UserModel;
import view.InicioApp;
import view.Login;

public class LoginController {
    private LoginModel model;
    private Login view;
    
    
    public LoginController(LoginModel model, Login view){
        this.model = model;
        this.view = view;
        
        view.getLoginButton().addActionListener(e -> authUser());
    }
    
    public void authUser(){
        UserModel user = view.getAccount();
        String emailUser = user.getEmail(); // Accede al correo electrónico
        String passwordUser = user.getPassword(); // Accede a la contraseña
        
        if(model.auth(emailUser, passwordUser)){
            view.setMensaje("Login exitoso");
            new InicioApp();
            InicioApp inicio = new InicioApp();
            inicio.setVisible(true);
            view.dispose();
        } else {
            view.setMensaje("Credenciales incorrectas");
        }
    }    
}