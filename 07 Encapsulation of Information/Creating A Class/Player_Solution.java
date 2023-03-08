package com.ata;

public class Player {

    private Car car;

    /*
    * Initialize new instance of the Player class.
    *
    * @param car a instance of the Car class.
    * */
    public Player(Car car) {
        this.car = car;
    }

    /*
    * Method to call the Car class start method.
    * */
    public void startGame() {
        car.start();
    }

    /*
    * Method to call the Car class stop method.
    * */
    public void stopGame() {
        car.stop();
    }
}
