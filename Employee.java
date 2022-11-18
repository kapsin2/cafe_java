package cafe;

public class Employee {
    private int sail_amount;

    public Employee(int sail_amount) {
        this.sail_amount = sail_amount;
    }

    public void makeCoffe(Beverage beverage) {
        this.sail_amount += beverage.price;
        System.out.println("주문하신 "+beverage.name+ "나왔습니다.");
    }

    public int getSail_amount() {
        return sail_amount;
    }
}
