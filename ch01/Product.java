package ch01;

import java.time.LocalDate;

public class Product {
    private String number;
    private String name;
    private int price;
    private LocalDate date;
    private boolean stack;

    public Product(String number, String name, int price, LocalDate date, boolean stack) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stack = stack;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isStack() {
        return stack;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStack(boolean stack) {
        this.stack = stack;
    }

}
