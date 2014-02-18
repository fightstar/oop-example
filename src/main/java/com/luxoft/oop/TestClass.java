package com.luxoft.oop;

import com.luxoft.oop.cars.FastCar;
import com.luxoft.oop.cars.Truck;

public class TestClass {



    public static void main(String[] args) {
        Car truck = new Truck(120,"green",12344,"Kamaz");
        truck.drive();

        Car fastCar  = new FastCar(10, "red", 12333,"Ferrari");
        fastCar.drive();
    }
}
