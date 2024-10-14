
import Controllers.LoginController;
import models.LoginModel;
import view.LoginView;
public class InmobiliariaN {

    public static void main(String[] args) {
        LoginModel model = new LoginModel();
        LoginView view = new LoginView();
        new LoginController(model, view);
        view.setVisible(true);
    }
}
