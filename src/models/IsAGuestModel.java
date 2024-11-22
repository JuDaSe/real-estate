
package models;

import models.UserModel;

public class IsAGuestModel extends UserModel {
    
    public IsAGuestModel(boolean admin) {
        super(admin);
        admin = false;
    }
    
}
