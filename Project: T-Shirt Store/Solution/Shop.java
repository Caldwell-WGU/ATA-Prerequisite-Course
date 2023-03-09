package com.ata;

import java.util.ArrayList;

/**
 * Shop class maintains the shop's information.
 * It encapsulates its name.
 * It also encapsulates a list of products.
 * It's responsible for printing products to standard out, when requested.
 * It also is able to find a product by its name, when requested.
 */
public class Shop {
    private String name;
    private ArrayList<Product> products;

    /**
     * Class constructor initializes the store with its name and products.
     * @param name shop name
     * @param products ArrayList of Products sold in the shop
     */
    public Shop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    /**
     * Prints a label for the Products available in the shop
     * Prints each product with its ID
     * in the internal products ArrayList.
     */
    public void printProducts() {
        StringBuilder productsString = new StringBuilder();
        productsString.append(String.format("--Products--%n"));

        for (Product p : products) {
            productsString.append(
                String.format(
                    "ID %d: %s - $%.2f%n",
                    p.getID(),
                    p.getName(),
                    p.getPrice()
                )
            );
        }

        System.out.print(productsString);
    }

    /**
     * Attempts to find a product by exact match in the internal products array
     * based on the passed in searchText.
     * @param searchText the exact product name to search for
     * @return -1 if product is not found by exact match, or product index in product array otherwise
     */
    public int findProduct(String searchText) {
        for (Product p : products) {
            if (p.getName().equals(searchText)) {
                return p.getID();
            }
        }
        return -1;
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }
}
