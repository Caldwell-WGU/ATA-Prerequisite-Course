package com.ata;

public class StringFormatUtil {

    /**
     * Formats a price so that different size values start with a dollar sign and
     * are right aligned.
     * 
     * @param price a value to be formatted
     * @return formatted string
     */
    public static String formatPriceLine(double price) {
        String priceLine = String.format("$%10.2f", price);
        return priceLine;
    }

    /**
     * Formats input so that a label is shown above a value and its respective
     * formatted form.
     * 
     * @param label a heading for the value to be formatted
     * @param value a number to be formatted
     * @return formatted string
     */
    public static String formatLabeledValue(String label, int value) {
        String labeledString = String.format("%s:%n%d -> %<(+,d", label, value);
        return labeledString;

    }

}
