package com.example.practice6.java8practice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PracticeJava8Features {

    private PracticeJava8Features() {
    }

    // Practice with Stream API
    // sort by client Name and outputs cars
    public static List<Car> sortedByCarName(List<Car> cars) {
        return cars.stream().sorted(comparing(Car::getName)).collect(toList());
    }

    // sort by client Name and output their names
    public static List<String> sortedByCarNameGetName(List<Car> cars) {
        return cars.stream().sorted(comparing(Car::getName)).map(Car::getName).collect(toList());
    }

    //filter cars by price that costs more than 10000000
    public static List<Car> filterByCarPrice(List<Car> cars) {
        return cars.stream().filter(pr -> pr.getPrice() > 10000000).sorted(comparing(Car::getPrice)).collect(toList());
    }

    //find the sum of all cars
    public static Integer findSumOfCars (List<Car> cars) {
        return cars.stream().map(Car::getPrice).reduce(0,Integer::sum);
    }

    // Practice with Optional
    // find the most expensive car and output it
    public static Optional<Integer> findMostExpensiveCarPrice (List<Car> cars) {
        return cars.stream().map(Car::getPrice).reduce(Integer::max);
    }

    //find the cars that doesn't have insurance
    public static Optional<Car> checkInsurance (List<Car> cars) {
        return cars.stream().filter(c -> !c.hasInsurance).findAny();
    }

    // Practice with LocalData
    // Return if there are any cars older than 2010
    public static boolean isCarYearOlderThan2010 (List<Car> cars) {
        return cars.stream().anyMatch(year ->year.getDateOfProduction().getYear() < 2010);
    }

    // sorts the list of cars by the year of production
    public static List<Car> sortedByCarYear (List<Car> cars) {
        return cars.stream().sorted(comparing(Car::getDateOfProduction)).collect(Collectors.toList());
    }

    //find the newest car
    public static String findNewestCar (List<Car> cars) {
        return cars.stream().sorted(comparing(Car::getDateOfProduction).reversed()).limit(1).map(Car::getName).collect(joining());

    }


}
