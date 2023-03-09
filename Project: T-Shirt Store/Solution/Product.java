package com.ata;

/**
 * Product class maintains the concept of a product in the application.
 * It encapsulates a the product's name, and its price.
 */

public class Product {
    private int id;
    private String name;
    private double price;

    /**
     * Class constructor setting the id, name, and price of the instance.
     * @param id The id of the product
     * @param name The name of the product
     * @param price The price of the product
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the encapsulated product name.
     * @return the encapsulated product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the encapsulated product price.
     * @return the encapsulated product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the encapsulated id.
     * @return the encapsulated id.
     */
    public int getID() {
        return id;
    }
}
