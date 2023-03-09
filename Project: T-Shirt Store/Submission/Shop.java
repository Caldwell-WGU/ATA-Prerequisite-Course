package com.ata;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Product> products;

    public Shop(){}
    
    public Shop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }
    
    public void printProducts() {
        System.out.println("--Products--");
        products.forEach(i -> System.out.println(
            String.format("ID %d: %s - $%.2f", i.getId(), i.getName(), i.getPrice())));
        
    }
    
    public int findProduct(String searchText) {
        for (int i = 0; i < products.size(); i++) {
            if (searchText.equals(products.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    
    /** 
     * Did not see a way to retrieve products (private attribute).
     * Did not see anything in the instruction stating to make my own method...
     * @param index for product array
     * @return product object
     */
    public Product getProduct(int index) {
        return products.get(index);
    }
    
    
    /**
    * Get the size of the ArrayList of Product type.
    * @return the number of products in shop
    */
    public int getSize() {
        return products.size();
    }
}
