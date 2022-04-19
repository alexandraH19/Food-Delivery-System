package business;

import java.io.Serializable;
import java.util.Objects;

public class Client implements  Serializable {

    private int ID;
    private String name;
    private String password;
    private String mail;
    private int age;
    private int ord;

    public Client(int ID,String name,String password,String mail,int age)
    {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.age = age;
        this.mail = mail;
        this.ord=0;
    }

    public void ord()
    {
        this.ord++;
    }
    public int getOrd()
    {
        return this.ord;
    }


    public int getID() {
        return this.ID;
    }


    public String getName() {
        return this.name;
    }


    public String getPassword() {
        return this.password;
    }


    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return ID == client.ID && age == client.age && Objects.equals(name, client.name) && Objects.equals(password, client.password) && Objects.equals(mail, client.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, password, mail, age);
    }


    public String getMail() {
        return this.mail;
    }

    public String toString()
    {
        return ("Domnul/a: "+this.name +" Mail: "+this.mail + " Varsta: "+this.age +" Rol: business.Client");
    }

}
