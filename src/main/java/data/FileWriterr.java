package data;

import business.Client;
import business.MenuItem;
import business.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class FileWriterr {

    public static void show(HashSet<MenuItem> sda) throws IOException {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\operations.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");
        for(MenuItem i: sda)
        {
            writer.write(i.getTitle() + " "+i.getRating()+" "+i.getCalories()+" "+i.getProtein()+" "+i.getFat()+" "+i.getSodium()+" "+i.getPrice()+"\n");

        }

        writer.close();
    }
    public static void rap1(List<Order> g) throws IOException
    {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\r1.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");

        for(Order i: g)
        {
            writer.write("ID: "+i.getOrderID() +" date: "+i.getD().getHours()+" price: "+i.getPrice()+"\n");
        }
        writer.close();
    }
    public static void rap2(List<MenuItem> g) throws IOException
    {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\r2.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");

        for(MenuItem i: g)
        {
            writer.write(i.getTitle()+" "+" times: "+i.getCom()+"\n");
        }

        writer.close();
    }
    public static void rap3(List<Client> g) throws IOException
    {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\r3.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");

        for(Client i: g)
        {
            writer.write("ID: "+i.getID()+" name: "+i.getName()+" times: "+i.getOrd()+"\n");
        }
        writer.close();
    }
    public static void rap4(HashSet<MenuItem> o) throws IOException
    {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\r4.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");

        for(MenuItem i: o)
        {
            writer.write(i.getTitle()+" times: "+i.getCom()+"\n");
        }
        writer.close();
    }

    public static void bill(Order ord) throws  IOException
    {
        String name = "C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\bill.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");

        writer.write("ID: "+ord.getOrderID()+" price: "+ord.getPrice()+" date: (day and hour) "+ord.getD().getDay()+" "+ord.getD().getHours()+"\n");
        writer.close();
    }
}