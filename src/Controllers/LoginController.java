package Controllers;

import models.LoginModel;   
import models.UserModel;
import view.InicioView;
import view.LoginView;

public class LoginController {
    private LoginModel model;
    private LoginView view;
    
    
    public LoginController(LoginModel model, LoginView view){
        this.model = model;
        this.view = view;
        
        view.getLoginButton().addActionListener(e -> authUser());
    }
    
    public void authUser(){
        UserModel user = view.getAccount();
        String emailUser = user.getEmail();
        String passwordUser = user.getPassword();
        
        if(model.auth(emailUser, passwordUser)){
            view.setMensaje("Login exitoso");
            new InicioView();
            InicioView inicio = new InicioView();
            inicio.setVisible(true);
            view.dispose();
        } else {
            view.setMensaje("Credenciales incorrectas");
        }
    }    
}