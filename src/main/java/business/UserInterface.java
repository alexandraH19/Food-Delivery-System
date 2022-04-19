package business;

import java.io.Serializable;

public interface UserInterface extends Serializable {

    int getID();
    String getName();
    String getPassword();
    int getAge();
    String getMail();

}
