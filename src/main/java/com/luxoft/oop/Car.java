package com.luxoft.oop;

/**
 * Created by Vlad on 17.02.14.
 */
public abstract class Car implements IVehicle {

    private int number;
    private String color;
    private String name;



    @Override
    public void drive() {
        System.out.println("drive Car");

    }
}
