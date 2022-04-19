package business;

import java.io.Serializable;

public class Identificator implements Serializable {
    private int ID;
    private int typo;

    public Identificator()
    {
        this.ID = -1;
        this.typo = -1;
    }

    public Identificator(int ID,int typo)
    {
        this.ID=ID;
        this.typo=typo;
    }

    public int getID()
    {
        return this.ID;
    }
    public int getTypo()
    {
        return this.typo;
    }
}
