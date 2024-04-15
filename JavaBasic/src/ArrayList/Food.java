package ArrayList;

public class Food {
    private String name;
    private  double price;
    private  String desc;

    public Food(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
