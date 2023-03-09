package com.ata;

import java.util.Scanner;

/**
 * Menu class is responsible for greeting the user, showing a menu
 * to the user for interaction with the application.
 * The class maintains a String[] array of menu options, which it
 * uses for printing the menu to standard out.
 * The class maintains a Shop instance, which it uses for
 * interactions with the shop.
 * The class is also responsible for responding to user interaction
 * with respect to its menu.
 */
public class Menu {
    private Shop shop;
    private Cart cart;
    private Scanner scanner;

    /**
     * Class constructor, which expects a Shop object, a Cart object,
     * and a Scanner object. All 3 parameters allow the user to configure
     * them outside this class for basic inversion of control.
     * @param shop Shop object to initialize the menu with
     * @param cart Cart object to initialize the menu with
     * @param scanner Scanner object to initialize the menu with
     */
    public Menu(Shop shop, Cart cart, Scanner scanner) {
        this.shop = shop;
        this.cart = cart;
        this.scanner = scanner;
    }

    /**
     * Prints the menu to standard output, using the class's menuOptions array.
     * It accepts user input using the encapsulated Scanner instance.
     * All output is printed to standard out.
     * All input is collected from standard in.
     */
    public void executeMenu() {
        printMenu();
        MenuOption optionSelected = getNextOptionFromUser();

        while (optionSelected != MenuOption.EXIT) {
            handleShopperMenuOptionSelection(optionSelected);
            printMenu();
            optionSelected = getNextOptionFromUser();
        }

        exit();
    }

    /**
     * Performs operations based on the menu option passed in.
     * @param option value denoting menu option selected by shopper
     */
    private void handleShopperMenuOptionSelection(MenuOption option) {
        if (option == MenuOption.LIST_PRODUCTS) {
            shop.printProducts();
        } else if (option == MenuOption.BUY_PRODUCT) {
            addToCart();
        } else if (option == MenuOption.FIND_PRODUCT) {
            findProduct();
        } else if (option == MenuOption.SHOW_CART) {
            cart.showDetails();
        } else if (option == MenuOption.CHECKOUT) {
            if (cart.checkout()) {
                System.out.println(String.format("Thank you for shopping at %s.", shop.getName()));
            }
        } else {
            System.out.println(String.format("Option %s was selected. Not yet implemented.", option.getId()));
        }
    }

    /**
     * Asks the user to enter their name.
     * After the user provides their name, it outputs a greeting to the user to standard out.
     */
    public void greet() {
        System.out.println("Hello. Please enter your name:");

        String name = scanner.nextLine();

        System.out.println(String.format("Welcome %s to %s", name, shop.getName()));
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

    /**
     * Attempts to find a product in the shop by its id.
     *
     * Prints statement asking user to enter item name to search for.
     * Takes in the item name from the user via standard in.
     *
     * Attempts to find the product in the shop.
     *
     * When a product is not found, prints a statement notifying user
     * of product not being found.
     *
     * When a product is found, prints the product id of the found product.
     */
    private void findProduct() {
        System.out.println("Enter the item to search for:");
        String itemToFind = getNextStringLineFromUser();
        int foundIndex = shop.findProduct(itemToFind);
        if (foundIndex == -1) {
            System.out.println("That product was not found.");
        } else {
            System.out.println(String.format("%s was found and its product id is %s", itemToFind, foundIndex));
        }
    }

    /**
     * Attempts to add a product to the cart by its id.
     *
     * Prints statement asking user to enter id of product to add to cart.
     *
     * Attempts to get the product from the shop by its id.
     *
     * When a product is not found, prints a statement notifying user of the same.
     *
     * When a product is found, adds it to the cart.
     */
    private void addToCart() {
        System.out.println("Please enter the ID of the product you would like to purchase:");
        int id = getNextIntFromUser();
        Product p = shop.getProductById(id);
        if (p != null) {
            cart.addItem(p);
        } else {
            System.out.println("That item ID is invalid and could not be added to the cart.");
        }
    }

    /**
     * Prints the menu header and menu options.
     */
    private void printMenu() {
        StringBuilder menuSb = new StringBuilder().append(
            String.format(
                "%n%s%n%s%n%n",
                "--Main Menu--",
                "Select an option using one of the numbers shown"
            )
        );

        for (MenuOption option : MenuOption.values()) {
            menuSb.append(String.format("%d: %s%n", option.getId(), option.getDisplayValue()));
        }

        System.out.print(menuSb);
    }

    /**
     * Returns the next user selected option.
     * Internally requires an int selection by the user, representing the option id and
     * delegates to MenuOption to convert from the id to the associated MenuOption.
     *
     * @return the menu option from the option id
     */
    private MenuOption getNextOptionFromUser() {
        return MenuOption.fromOptionId(getNextIntFromUser());
    }

    /**
     * Collects next user-entered int from the scanner's input stream.
     * @return integer value denoting the user selection
     */
    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    /**
     * Prints an exit statement and closes the scanner object.
     */
    private void exit() {
        System.out.println("Exiting now. Goodbye.");
        scanner.close();
    }
}
