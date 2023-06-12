package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.type=type;
        this.seats=seats;
        this.isManual=isManual;
        this.gears=gears;
        currentGear=1;
    }

    public void changeGear(int newGear){
         currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
       super.move(newSpeed,newDirection);
       //only move(newSpeed,new Direction) can be called
        //only this.move(newSpeed,newDirection) can be called
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
