package business;

import business.BaseProduct;

import java.io.Serializable;
import java.util.ArrayList;

public class CompusProduct extends MenuItem implements Serializable {

    public CompusProduct(String title, int price, ArrayList<BaseProduct> products)
    {
        super(title,price,products);
    }
}
