package org.launchcode;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        MenuItem salad = new MenuItem(4.99, "Salad", "lunch");
        MenuItem eggs = new MenuItem(2.99, "Eggs", "Breakfast" );
        ArrayList<MenuItem> Items = new ArrayList<>();
        Menu menu = new Menu(Date.valueOf(LocalDate.now()), Items);
        menu.addMenuItem(salad);
        menu.addMenuItem(eggs);
        System.out.println(menu);
        System.out.println(eggs);
        menu.removeMenuItem(eggs);
        System.out.println(menu);
    }
}
