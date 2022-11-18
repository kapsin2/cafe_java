package cafe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Customer customer1 = new Customer("손님1",500);
        Employee employee = new Employee(0);

        customer1.orderCoffe(menu.americano);

    }
}
