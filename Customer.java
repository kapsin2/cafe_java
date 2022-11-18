package cafe;

public class Customer {
    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void orderCoffe(Beverage beverage) {
        if (this.money < beverage.price) {
            System.out.println(beverage.name + "를 시키기에는 돈이부족합니다.");
        } else {
            this.money = this.money - beverage.price;
            System.out.println(this.name+"이 "+beverage.name + "를 주문하였습니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
