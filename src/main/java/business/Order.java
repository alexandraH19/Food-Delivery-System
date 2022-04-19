package business;

import business.MenuItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable {
    private int orderID;
    private int price;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date date;

    public Order(int orderID,int price,ArrayList<MenuItem> menuItems)
    {
        this.orderID = orderID;
        this.price = price;
        this.menuItems.addAll(menuItems);
        this.date = new Date();
    }
    public Date getD()
    {
        return this.date;
    }
    public int getOrderID()
    {
        return this.orderID;
    }
    public int getPrice()
    {
        return this.price;
    }
    public ArrayList<MenuItem> getMenuItems()
    {
        return this.menuItems;
    }

}
