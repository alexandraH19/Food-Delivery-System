package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MenuItem implements Serializable {
    private String title;
    private float rating;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int price;
    private int com;

    private List<BaseProduct> products = new ArrayList<>();

    public MenuItem(String title,float rating,int calories,int protein,int fat,int sodium,int price)
    {
        this.title = title.trim();
        this.rating = rating;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.price = price;
        this.com = 0;
    }

    public void com()
    {
        this.com++;
    }

    public int getCom(){return this.com;}

    public MenuItem(String title,int price,ArrayList<BaseProduct> products)
    {
        this.title = title;
        this.price = price;
        this.products.addAll(products);
        for(int i=0;i<products.size();i++)
        {
            this.rating += products.get(i).getRating();
            this.calories+=products.get(i).getCalories();
            this.protein+=products.get(i).getProtein();
            this.fat+=products.get(i).getFat();
            this.sodium+=products.get(i).getSodium();
            this.price=products.get(i).getPrice();
        }
        this.rating/=this.rating/products.size();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Float.compare(menuItem.rating, rating) == 0 && calories == menuItem.calories && protein == menuItem.protein && fat == menuItem.fat && sodium == menuItem.sodium && price == menuItem.price && Objects.equals(title, menuItem.title) && Objects.equals(products, menuItem.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, calories, protein, fat, sodium, price, products);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
