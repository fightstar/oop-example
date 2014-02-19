package com.luxoft.oop.cars;

import com.luxoft.oop.Car;

/**
 * Created by Vlad on 17.02.14.
 */
public class Truck extends Car {   // Это  наследование

    private int capacity;
    private String color;
    private int number;
    private String name;

    public Truck(int capacity, String color, int number, String name) {
        this.capacity = capacity;
        this.color = color;
        this.number = number;
        this.name = name;
    }

    public Truck() {
    }

    public void setCapacity(int capacity)  {
        this.capacity = capacity;
    }
    @Override
    public void setColor(String color) {
         this.color = color;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("drive Truck");
        System.out.println("Capasity is " + capacity);
        System.out.println("Color is " + color);
        System.out.println("Number is " + number);
        System.out.println("Name is " + name);
    }
}
