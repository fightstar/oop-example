package com.luxoft.oop.cars;

import com.luxoft.oop.Car;

public class FastCar extends Car {
    private int acceleration;    //пример инкапсуляции
    private String color;
    private int number;
    private String name;

    public FastCar(int acceleration, String color, int number, String name) {
        this.acceleration = acceleration;
        this.color = color;
        this.number = number;
        this.name = name;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
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
        System.out.println("drive FastCar");
        System.out.println("Acceleration is " + acceleration);
        System.out.println("Color is " + color);
        System.out.println("Number is " + number);
        System.out.println("Name is " + name);
    }
}
