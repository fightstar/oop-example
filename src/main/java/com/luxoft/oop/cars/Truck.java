package com.luxoft.oop.cars;

import com.luxoft.oop.Car;

/**
 * Created by Vlad on 17.02.14.
 */
public class Truck extends Car {   // Это наследование

    private int capacity;



    public void setCapacity(int capacity)  {
        this.capacity = capacity;
    }
    @Override
    public void setColor(String color) {

    }

    @Override
    public void setNumber(int number) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void drive() {
        System.out.println("drive Truck");
    }
}
