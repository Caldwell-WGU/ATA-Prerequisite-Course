package com.ata;

public class Player {
    // TODO: Add attributes from UML diagram below
    private Car car;


    // TODO: Add constructor from UML diagram below
    public Player(Car car){
        this.car = car;
    }

    // TODO: Add method to call the Car class start method.
    public void startGame(){
        car.start();
    }

    // TODO: Add method to call the Car class stop method.
    public void stopGame(){
        car.stop();
    }
}
