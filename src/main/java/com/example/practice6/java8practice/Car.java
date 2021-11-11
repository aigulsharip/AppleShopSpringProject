package com.example.practice6.java8practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    String name;
    int price;
    LocalDate dateOfProduction;
    boolean hasInsurance;

    // This static method have been used for testing purpose
    public static List<Car> getCars(){

        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setName("Mercedes");
        car.setPrice(8000000);
        car.setDateOfProduction(LocalDate.of(2014,01,01));
        car.setHasInsurance(true);

        cars.add(car);

        Car car2 = new Car();
        car2.setName("Lexus");
        car2.setPrice(34000000);
        car2.setDateOfProduction(LocalDate.of(2018,02,01));
        car2.setHasInsurance(false);

        cars.add(car2);

        Car car3 = new Car();
        car3.setName("BMV");
        car3.setPrice(6000000);
        car3.setDateOfProduction(LocalDate.of(2016,01,01));
        car3.setHasInsurance(true);
        cars.add(car3);

        Car car4= new Car();
        car4.setName("Ravon");
        car4.setPrice(4000000);
        car4.setDateOfProduction(LocalDate.of(2010,01,01));
        car4.setHasInsurance(true);
        cars.add(car4);

        Car car5 = new Car();
        car5.setName("Prada");
        car5.setPrice(30000000);
        car5.setDateOfProduction(LocalDate.of(2019,05,01));
        car5.setHasInsurance(true);
        cars.add(car5);

        Car car6 = new Car();
        car6.setName("Audi");
        car6.setPrice(7000000);
        car6.setDateOfProduction(LocalDate.of(2015,11,01));
        car6.setHasInsurance(true);
        cars.add(car6);
        return cars;

    }
}
