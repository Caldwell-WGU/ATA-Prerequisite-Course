package com.ata;

public class Car {
    // TODO: Add attributes from UML diagram below
    private Printer printer;
    private String color;
    private String make;
    private String model;
    
    

    // TODO: Add constructor from UML diagram below
    public Car (String color, String make, String model){
        this.color = color;
        this.make = make;
        this.model = model;
        printer = new Printer();
    }

    // TODO: Add getter methods from UML diagram below
    public String getColor(){
        return color;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }

    // TODO: Add the start method from UML below
    public void start(){
        System.out.println(String.format("Starting %s %s %s", color, make, model));
    }    

    // TODO: Add the stop method from UML below
    public void stop(){
        System.out.println(String.format("Stopping %s %s %s", color, make, model));
    }
}
