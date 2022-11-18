package cafe;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu = new ArrayList<>();
    Beverage americano = new Beverage("아메리카노",1000);
    Beverage cafeLatte = new Beverage("카페라떼",2000);
    Beverage macciatto = new Beverage("카라멜마끼아또",2500);

    public Menu() {
        this.menu.add(americano.toString());
        this.menu.add(cafeLatte.toString());
        this.menu.add(macciatto.toString());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                '}';
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public Beverage getAmericano() {
        return americano;
    }

    public Beverage getCafeLatte() {
        return cafeLatte;
    }

    public Beverage getMacciatto() {
        return macciatto;
    }
}
