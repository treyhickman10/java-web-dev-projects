package org.launchcode;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private LocalDate today = LocalDate.of(2015, 1,1);
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded = LocalDate.now();
    private boolean isNew = dateAdded.equals(today);

    public MenuItem(double p, String d, String c) {
        this.price = p;
        this.description = d;
        this.category = c;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return
                "price= " + price +
                ", description = '" + description + '\'' +
                ", category = '" + category + '\'' +
                ", Is new = " + isNew +
                '\n';
    }
}

