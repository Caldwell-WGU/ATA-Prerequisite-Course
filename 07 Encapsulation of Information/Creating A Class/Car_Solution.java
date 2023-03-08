package com.ata;

public class Car {

    private Printer printer;
    private String color;
    private String make;
    private String model;

    /*
    * Initializes a new instance of the car class.
    *
    * @param color the color of the car.
    * @param make the make of the car.
    * @param model the model of the car.
    * */
    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
        printer = new Printer();
    }

    /*
    * Getter for color.
    * */
    public String getColor() {
        return color;
    }

    /*
    * Getter for make.
    * */
    public String getMake() {
        return make;
    }

    /*
    * Getter for model.
    * */
    public String getModel() {
        return model;
    }

    /*
    * Method to print out "Starting " and the car info.
    * */
    public void start() {
        printer.print("Starting", color, make, model);
    }

    /*
    * Method to print out "Stopping car".
    * */
    public void stop() {
        printer.print("Stopping", color, make, model);
    }
}
