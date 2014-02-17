package com.luxoft.oop;

/**
 * Created by Vlad on 17.02.14.
 */
public class Car implements IVehicle {
    private int speed;      // пример инкапсуляции
    private int capacity;
    private int number;

    private String name;

    public Car() {
    }

    public Car(int speed, int capacity, int number) {
        this.speed = speed;
        this.capacity = capacity;
        this.number = number;
    }

    public Car(int speed, int capacity, int number, String name) {
        this.speed = speed;
        this.capacity = capacity;
        this.number = number;
        this.name = name;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
