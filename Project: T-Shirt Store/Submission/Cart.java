package com.ata;

import java.util.ArrayList;

public class Cart {
    
    private ArrayList<Product> items;
    private double total;
    private double taxRate;

    
    public Cart() {
        items = new ArrayList<Product>();
        total = 0.00;
        taxRate = 10.00;
    }
    
    public void empty() {
        if (items.isEmpty()) {
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
        } else {
            items.clear();
            System.out.println(String.format("Your total is $%.2f", total * (1 + (taxRate / 100))));
            System.out.println("Thank you for shopping at T-Shirt Mart.");
            total = 0.00;  
        }                          
    }
    
    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
        total += product.getPrice();
    }
    
    public void showDetails() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        } else {
            System.out.println("--Cart--");
            System.out.println("Item Count: " + items.size());
            System.out.println("Items:");
            items.forEach(product -> System.out.println(String.format("%s: $%.2f", 
                                                                      product.getName(), product.getPrice())));
            System.out.println(String.format("\nPre-Tax Total: $%.2f", total));
            double taxTotal = total * (1 + (taxRate / 100));
            System.out.print(String.format("Post-Tax Total (%.2f%% Tax): $%.2f\n", taxRate, taxTotal));  
        }
    }
    
    // Did not use method. Instruction didn't clear state what method should be used for.
    public boolean checkout() {
        return true;
    }
    
}
