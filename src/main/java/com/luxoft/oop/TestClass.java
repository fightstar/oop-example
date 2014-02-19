package com.luxoft.oop;

import com.luxoft.oop.cars.FastCar;
import com.luxoft.oop.cars.Truck;

public class TestClass {


    public static void main(String[] args) {    //пример полиморфизма
        Truck truck = new Truck(120, "green", 12344, "Kamaz");

        FastCar fastCar = new FastCar(10, "red", 12333, "Ferrari");

        Car car;

        car = truck;
        car.drive();
        System.out.println("");
        car = fastCar;
        car.drive();


    }
}
