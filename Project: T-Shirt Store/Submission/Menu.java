package com.ata;

import java.util.Scanner;

/**
 * Menu class is responsible for greeting the user, showing a menu
 * to the user for interaction with the application.
 * The class maintains a String[] array of menu options, which it
 * uses for printing the menu to standard out.
 * The class is also responsible for responding to user interaction
 * with respect to its menu.
 */
public class Menu {
    private String[] menuOptions = {"Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"};
    private Scanner scanner;
    private Shop shop;
    //Initialize a Cart object. Instruction did not state to do so.
    private Cart cart = new Cart();

    /**
     * Class constructor, which expects a Scanner object
     * It allows for the user to specify how a Scanner is to
     * be configured outside this class and for basic inversion of control.
     * @param scanner takes in a Scanner object to initialize.
     * @param shop takes in a Shop object to initialize.
     */
    public Menu(Scanner scanner, Shop shop) {
        this.scanner = scanner;
        this.shop = shop;
        
    }


    
    /**
     * Prints the menu to standard output, using the class's menuOptions array.
     * It accepts user input using the encapsulated Scanner instance.
     * All output is printed to standard out.
     * All input is collected from standard in.
     */
    public void executeMenu() {
        printMenu();
        int choice = getNextIntFromUser();
        int searchResult;
        while (choice != 0) { 
            if (choice == 1) {
                shop.printProducts();
            } else if (choice == 2) {
                System.out.println("Please enter the ID of the product you would like to purchase:");
                searchResult = getNextIntFromUser();
                if (searchResult >= 0 && searchResult < shop.getSize()) {
                    cart.addItem(shop.getProduct(searchResult));
                } else {
                    System.out.println("That item ID is invalid and could not be added to the cart.");
                }
            } else if (choice == 3) {
                System.out.println("Enter the item to search for:");
                String itemToFind = getNextStringLineFromUser();
                searchResult = shop.findProduct(itemToFind);
                
                if (searchResult == -1) {
                    System.out.println("That product was not found.");
                } else {
                    System.out.println(String.format("%s was found and its product id is %d",
                                                     shop.getProduct(searchResult).getName(), searchResult));
                }
            } else if (choice == 4) {
                cart.showDetails();
            } else if (choice == 5) {
                cart.empty();
            }
            printMenu();
            choice = getNextIntFromUser();
        }
        exit();  
    }

    /**
     * Asks the user to enter their name.
     * After the user provides their name, 
     * it outputs a greeting to the user to standard out.
     */
    public void greet() {
        System.out.println("Hello. Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to " + "T-Shirt Mart");
    }

    /**
     * Prints the menu header and menu options.
     */
    private void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");
        System.out.println("Select an option using one of the numbers shown");
        System.out.println();

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.print(i + ": ");
            System.out.println(menuOptions[i]);
        }
    }

    /**
     * Prints an exit statement and closes the scanner object.
     */
    private void exit() {
        System.out.println("Exiting now. Goodbye.");
        scanner.close();
    }

    /**
     * Collects next user-entered int.
     * @return integer value denoting the user selection
     */
    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    /**
     * Skips a line of empty input from the scanner's input stream
     * and then returns the next available line.
     * @return string representing the line of input typed by the user
     */
    private String getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    } 
    
    private void addToCart(Product product) {
        cart.addItem(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }
}
