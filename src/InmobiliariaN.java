
import Controllers.LoginController;
import models.LoginModel;
import view.Login;
public class InmobiliariaN {

    public static void main(String[] args) {
        LoginModel model = new LoginModel(); // Suponiendo que tienes este modelo
        Login view = new Login(); // Crea la instancia de Login
        new LoginController(model, view); // Pasa la vista al controlador
        view.setVisible(true);
    }
    
}
