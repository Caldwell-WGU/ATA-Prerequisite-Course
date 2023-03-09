package com.ata;

import java.util.ArrayList;

public class PeriodicTable {

    /**
     * Translate an Element enum periodic symbol to the corresponding element string.
     *
     * @param element the Element enum, a single character symbol
     * @return the corresponding element string
     * */
    public String translateSymbol(Element element) {
        // TODO: Step 2: Add logic to return element string before return null;
        String returnElement = null;
        if (element == Element.C) {
            returnElement = "Carbon";
        } else if (element == Element.H) {
            returnElement = "Hydrogen";
        } else if (element == Element.O) {
            returnElement = "Oxygen";
        } else if (element == Element.N) {
            returnElement = "Nitrogen";
        } else if (element == Element.P) {
            returnElement = "Phosphorus";
        } else if (element == Element.S) {
            returnElement = "Sulfur";
        }
        return returnElement;
    }

    /**
     * Translate an Element enum periodic symbol to the corresponding element string.
     *
     * @param elementStr a single character string representing the symbol
     * @return the corresponding element string
     * */
    public String translateSymbol(String elementStr) {
        // TODO: Step 3: Replace return null with logic for overloaded translateSymbol.
        Element element = Element.valueOf(elementStr);
        return translateSymbol(element);
    }

    /**
     * Gets the element string for all the values in Element.
     *
     * @return An ArrayList of Strings
     * */
    public ArrayList<String> getElementsOfLife() {
        // TODO: Step 4: Replace return null with logic for getElementsOfLife
        ArrayList<String> result = new ArrayList<>();
        Element[] elements = Element.values();
        for (Element element: elements) {
            result.add(translateSymbol(element));
        }
        return result;
    }

}
