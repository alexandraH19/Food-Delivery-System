package business;

import java.util.ArrayList;

public interface IDeliveryService {

    /**
     * @pre hour1>0
     * @pre hour2>0
     * @param hour1
     * @param hour2
     */
    void raport1(int hour1,int hour2);

    /**
     * @pre times>0
     * @param times
     */
    void raport2(int times);

    /**
     * @pre name != ""
     * @pre password != ""
     * @pre age>0
     * @pre mail!= ""
     * @param name
     * @param password
     * @param age
     * @param mail
     */
    void addAdmin(String name,String password,int age,String mail);

    /**
     * @pre name != ""
     * @pre password != ""
     * @pre age>0
     * @pre mail != ""
     * @param name
     * @param password
     * @param age
     * @param mail
     */
    void addClient(String name,String password,int age,String mail);

    /**
     * @pre name!=""
     * @pre password!=""
     * @pre age >0
     * @pre mail!=""
     * @param name
     * @param password
     * @param age
     * @param mail
     */
    void addEmployee(String name,String password,int age,String mail);

    /**
     * @pre title!=""
     * @pre rating>0
     * @pre calories>0
     * @pre protein>0
     * @pre fat>0
     * @pre sodium>0
     * @pre price>0
     * @param title
     * @param rating
     * @param calories
     * @param protein
     * @param fat
     * @param sodium
     * @param price
     */
    void addBaseProduct(String title,float rating,int calories,int protein,int fat,int sodium,int price);
    void addCompusProduct(String title, int price, ArrayList<BaseProduct> products);
    void addOrder(int price,ArrayList<MenuItem> products);

    /**
     * @pre id>0
     * @param id
     * @return
     */
    Client getCli(int id);

    /**
     * @pre ord>0
     * @param ord
     */
    void raport3(int ord);

    /**
     * @pre day>0
     * @param day
     */
    void raport4(int day);
    Identificator logProtocol(String name, String pass);
    BaseProduct bsProd(String tit);

    /**
     * @pre name!=""
     * @pre title!=""
     * @pre rating>0
     * @pre calories>0
     * @pre protein>0
     * @pre fat>0
     * @pre sodium>0
     * @pre price>0
     * @param name
     * @param title
     * @param rating
     * @param calories
     * @param protein
     * @param fat
     * @param sodium
     * @param price
     */
    void edit(String name,String title,float rating,int calories,int protein,int fat,int sodium,int price);
    void del(String name);

    /**
     * @pre rating>0
     * @pre calories>0
     * @pre prtein>0
     * @pre fat>0
     * @pre sodium>0
     * @pre price>0
     * @param title
     * @param rating
     * @param calories
     * @param protein
     * @param fat
     * @param sodium
     * @param price
     */
    void serc(String title,float rating,int calories,int protein,int fat,int sodium,int price);
    MenuItem getPro(String title);

}
