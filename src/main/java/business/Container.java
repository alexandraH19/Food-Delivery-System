package business;

import data.FileWriterr;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;

public class Container extends Observable implements Serializable{
    private HashSet<Admin> admins = new HashSet<>();
    private HashSet<Client> clients = new HashSet<>();
    private HashSet<Employee> employees = new HashSet<>();
    private HashSet<MenuItem> menuItems = new HashSet<>();
    private HashSet<Order> orders = new HashSet<>();

    private int adminID;
    private int employeeID;
    private int clientID;
    private int orderID;
    private int menuItemID;

    public Container()
    {
        this.adminID = 0;
        this.employeeID = 0;
        this.clientID = 0;
        this.orderID = 0;
        this.menuItemID = 0;
    }

    public void addAdmin(String name,String password,String mail,int age)
    {
        this.adminID++;
        admins.add(new Admin(this.adminID,name,password,mail,age));
    }

    public void addEmployee(String name,String password,String mail,int age)
    {
        this.employeeID++;
        employees.add(new Employee(this.employeeID,name,password,mail,age));
    }
    public void addClient(String name,String password,String mail,int age)
    {
        this.clientID++;
        clients.add(new Client(this.clientID,name,password,mail,age));
    }
    public void addOrder(int price, ArrayList<MenuItem> menuItems)
    {
        this.orderID++;
        orders.add(new Order(this.orderID,price,menuItems));
        try {
            FileWriterr.bill(new Order(this.orderID,price,menuItems));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setChanged();
        notifyObservers();
    }
    public void addMenuItem1(String title,float rating,int calories,int protein,int fat,int sodium,int price)
    {
        this.menuItemID++;
        menuItems.add(new BaseProduct(title,rating,calories,protein,fat,sodium,price));
    }
    public void addMenuItem2(String title,int price,ArrayList<BaseProduct> products)
    {
        this.menuItemID++;
        menuItems.add(new CompusProduct(title,price,products));
    }

    public void delProd(MenuItem i)
    {
        menuItems.remove(i);
    }

    public HashSet<Admin> getAdmins() {
        return admins;
    }

    public HashSet<Client> getClients() {
        return clients;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public HashSet<MenuItem> getMenuItems() {
        return menuItems;
    }

    public HashSet<Order> getOrders() {
        return orders;
    }

    public int getAdminID() {
        return adminID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getClientID() {
        return clientID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getMenuItemID() {
        return menuItemID;
    }
}
