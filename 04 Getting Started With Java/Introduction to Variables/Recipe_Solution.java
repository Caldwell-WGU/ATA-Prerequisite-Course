package com.ata;

public class Recipe {
    // TODO: Add Step 1 and Step 2 variables below
    String title = "French Toast";
    String[] ingredients = { "bread", "milk", "eggs", "butter", "sugar", "cinnamon" };
    long id = 2345678901L;
    int numberOfIngredients;
    double servings = 4.5;
    char rating = 'B';
    boolean isDairyFree = false;
    // End of variables

    /**
     * This method should initialize the numberOfIngredients variable. It should use
     * the length of the ingredients array.
     */
    public void initializeVariable() {
        // TODO: Step 3.1 on the line below
        numberOfIngredients = ingredients.length;
    }

    /**
     * This method should print the title variable. It should use the System println
     * method provided.
     */
    public void printVariable() {
        // TODO: Step 3.2 on the line below
        System.out.println(title);
    }

    /**
     * This method should update an element value in the ingredients array variable.
     */
    public void updateVariable() {
        // TODO: Step 3.3 on the line below
        ingredients[5] = "nutmeg";
    }
    
}
