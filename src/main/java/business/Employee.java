package business;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private int ID;
    private String name;
    private String password;
    private String mail;
    private int age;


    public Employee(int ID,String name,String password,String mail,int age)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(password, employee.password) && Objects.equals(mail, employee.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, password, mail, age);
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
    public String toString()
    {
        return ("Domnul/a: "+this.name +" Mail: "+this.mail + " Varsta: "+this.age +" Rol: Angajat");
    }
}
