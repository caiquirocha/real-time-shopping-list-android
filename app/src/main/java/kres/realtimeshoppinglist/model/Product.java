package kres.realtimeshoppinglist.model;

public class Product {

    private String name;
    private int quantity;
    private boolean bought;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.bought = false;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isBought() {
        return bought;
    }
}