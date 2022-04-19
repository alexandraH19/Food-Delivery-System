package business;

import java.io.Serializable;

public class Except extends Exception implements Serializable {

    public Except(String a)
    {
        super(a);
    }
}
