package business;

import java.io.Serializable;
import java.util.Objects;

public class Admin implements Serializable{
    private int ID;
    private String name;
    private String password;
    private String mail;
    private int age;


    public Admin(int ID,String name,String password,String mail,int age)
    {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.age = age;
        this.mail = mail;

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


    public String getMail() {
        return this.mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Admin admin = (Admin) o;
        return ID == admin.ID && age == admin.age && Objects.equals(name, admin.name) && Objects.equals(password, admin.password) && Objects.equals(mail, admin.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, password, mail, age);
    }

    public String toString()
    {
        return ("Domnul/a: "+this.name +" Mail: "+this.mail + " Varsta: "+this.age +" Rol: business.Admin");
    }
}
