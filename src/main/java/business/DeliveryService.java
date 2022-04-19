package business;

import business.Admin;
import business.BaseProduct;
import business.Client;
import business.Container;
import data.FileWriterr;
import data.Serializator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeliveryService extends Observable implements Serializable {

    private Container container;

    public DeliveryService()
    {
        this.container = null;
        this.container = Serializator.deserializare();
        if(this.container == null)
            this.container = new Container();
        this.container.addObserver(Manag.getObse());
    }

    public void serializare()
    {
        Serializator.serializare(this.container);
    }

    public void raport1(int hour1,int hour2) throws IOException {
        assert hour1>0;
        assert hour2>0;

        List<Order> g = this.container.getOrders().stream()
                .filter(l->l.getD().getHours()>=hour1 && l.getD().getHours()<=hour2)
                .collect(Collectors.toList());

        FileWriterr.rap1(g);
    }
    public void raport2(int times) throws IOException {

        assert times>0;

        List<MenuItem> g = container.getMenuItems().stream()
                .filter(s->s.getCom()>times)
                .collect(Collectors.toList());

        FileWriterr.rap2(g);
    }
    public void addAdmin(String name,String password,int age,String mail) throws Except {
        assert name!="";
        assert password!="";
        assert age>0;
        assert mail!="";

        for(Admin i: container.getAdmins())
        {
            if(i.getName().equals(name)==true || i.getMail().equals(mail)==true)
            {
                throw new Except("Numele sau mail-ul exista");

            }
        }
        this.container.addAdmin(name,password,mail,age);
    }
    public void addClient(String name,String password,int age,String mail) throws Except {
        assert name!="";
        assert password!="";
        assert age>0;
        assert mail!="";

        for(Client i: container.getClients())
        {
            if(i.getName().equals(name)==true || i.getMail().equals(mail)==true)
            {
                throw new Except("Numele sau mail-ul exista");

            }
        }
        this.container.addClient(name,password,mail,age);
    }
    public void addEmployee(String name,String password,int age,String mail) throws Except {
        for(Employee i: container.getEmployees())
        {
            if(i.getName().equals(name)==true || i.getMail().equals(mail)==true)
            {
                throw new Except("Numele sau mail-ul exista");
            }
        }
        this.container.addEmployee(name,password,mail,age);
    }


    public void addBaseProduct(String title,float rating,int calories,int protein,int fat,int sodium,int price)
    {
        assert title!="";
        assert rating>0;
        assert calories>0;
        assert protein>0;
        assert fat>0;
        assert sodium>0;
        assert price>0;
        this.container.addMenuItem1(title,rating,calories,protein,fat,sodium,price);
    }
    public void addCompusProduct(String title, int price, ArrayList<BaseProduct> products)
    {
        this.container.addMenuItem2(title,price,products);
    }
    public void addOrder(int price,ArrayList<MenuItem> products)
    {
        assert price>0;

        this.container.addOrder(price,products);
    }
    public Client getCli(int id)
    {
        assert id>0;

        for(Client i: container.getClients())
        {
            if(i.getID() == id)
                return i;
        }
        return null;
    }
    public void raport3(int ord) throws IOException {
        assert ord>0;

        List<Client> g = container.getClients().stream()
                .filter(s->s.getOrd()>ord)
                .collect(Collectors.toList());

        FileWriterr.rap3(g);
    }
    public void raport4(int day) throws IOException {
        assert day>0;

        List<Order> g = container.getOrders().stream()
                .filter(f->f.getD().getDay() == day)
                .collect(Collectors.toList());

        HashSet<MenuItem> s = new HashSet<>();

        for(Order i : g)
        {
            for(MenuItem o: i.getMenuItems())
            {
                s.add(o);
            }
        }

        FileWriterr.rap4(s);
    }
    public Identificator logProtocol(String name, String pass)
    {
        for(Admin i : container.getAdmins())
        {
            if(i.getName().equals(name) && i.getPassword().equals(pass))
            {
                return new Identificator(i.getID(),0);
            }
        }
        for(Client i: container.getClients())
        {
            if(i.getName().equals(name) && i.getPassword().equals(pass))
            {
                return new Identificator(i.getID(),1);
            }
        }
        for(Employee i: container.getEmployees())
        {
            if(i.getName().equals(name) && i.getPassword().equals(pass))
            {
                return new Identificator(i.getID(),2);
            }
        }

        return new Identificator();
    }
    public BaseProduct bsProd(String tit)
    {
        for(MenuItem i : container.getMenuItems())
        {
            if(i.getTitle().equals(tit))
                return (BaseProduct) i;
        }
        return null;
    }

    public void modify(String name,String title,float rating,int calories,int protein,int fat,int sodium,int price)
    {
        for(MenuItem i: container.getMenuItems())
        {
            if (i.getTitle().equals(name) != true) {
            } else {
                i.setTitle(title);
                i.setRating(rating);
                i.setCalories(calories);
                i.setProtein(protein);
                i.setFat(fat);
                i.setSodium(sodium);
                i.setPrice(price);
            }
        }
    }

    public void del(String name)
    {
        for(MenuItem i: container.getMenuItems())
        {
            if(i.getTitle().equals(name)==true)
            {
                container.delProd(i);
                break;
            }
        }
        System.out.println(container.getMenuItems().size());
    }

    public void importProd() throws IOException {
        String poit = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\products.CSV";
        try (Stream<String> lmno = Files.lines(Paths.get(poit))
                .skip(1))
        {
            List<List<String>> vlbz = lmno.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            for(int i=0;i<vlbz.size();i++)
            {
                container.addMenuItem1(vlbz.get(i).get(0),Float.parseFloat(vlbz.get(i).get(1)),Integer.parseInt(vlbz.get(i).get(2)),
                        Integer.parseInt(vlbz.get(i).get(3)),Integer.parseInt(vlbz.get(i).get(4)),Integer.parseInt(vlbz.get(i).get(5)),
                        Integer.parseInt(vlbz.get(i).get(6)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashSet<MenuItem> getMen()
    {
        return container.getMenuItems();
    }

    public void serc(String title,float rating,int calories,int protein,int fat,int sodium,int price)
    {
        List<MenuItem> vb = container.getMenuItems().stream()
                .filter(l->l.getTitle().equals(title) == true)
                .filter(l->l.getRating() == rating)
                .filter(l->l.getCalories() == calories)
                .filter(l->l.getProtein() == protein)
                .filter(l->l.getFat() == fat)
                .filter(l->l.getSodium() == sodium)
                .filter(l->l.getPrice() == price)
                .collect(Collectors.toList());

        HashSet<MenuItem> vb2 = new HashSet<>();
        vb2.addAll(vb);

        try {
            FileWriterr.show(vb2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MenuItem getPro(String title)
    {
        for(MenuItem i: container.getMenuItems())
        {
            if (!i.getTitle().equals(title)) {
            } else {
                return i;
            }
        }
        return null;
    }


}
