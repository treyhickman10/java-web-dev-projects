package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item){
        items.add(item);
    }

    public void removeMenuItem(MenuItem item){
        items.remove(item);

    }

    @Override
    public String toString() {
        return "Menu updated on " + lastUpdated +
                " items= " + items
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(items, menu.items);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(items);
    }
}


