package cafe;

public class Beverage {
    String name;
    int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
