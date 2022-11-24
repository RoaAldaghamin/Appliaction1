package Model;

public class FoodItems {
    private String name;
    private String cat;
    private double price;

    public FoodItems(String name, String cat, double price) {
        this.name = name;
        this.cat = cat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
