package com.example.practice6.java8practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

class PracticeJava8FeaturesTest {

    @Test
    void testSortedByCarName() {
        List<Car> result = PracticeJava8Features.sortedByCarName(Arrays.<Car>asList(new Car("Mercedes", 34444, LocalDate.of(2021, Month.NOVEMBER, 11), true),
                new Car("Audi", 1456600, LocalDate.of(2021, Month.NOVEMBER, 11), true)));
        Assertions.assertEquals(Arrays.<Car>asList(new Car("Audi", 1456600, LocalDate.of(2021, Month.NOVEMBER, 11), true),
                new Car("Mercedes", 34444, LocalDate.of(2021, Month.NOVEMBER, 11), true)), result);
    }

    @Test
    void testSortedByCarNameGetName() {
        List<String> result = PracticeJava8Features.sortedByCarNameGetName(Arrays.<Car>asList(new Car("Mercedes", 34444, LocalDate.of(2021, Month.NOVEMBER, 11), true),
                new Car("Audi", 1456600, LocalDate.of(2021, Month.NOVEMBER, 11), true)));
        Assertions.assertEquals(Arrays.<String>asList("Audi", "Mercedes"), result);
    }

    @Test
    void testFilterByCarPrice() {
        List<Car> result = PracticeJava8Features.filterByCarPrice(Arrays.<Car>asList(new Car("Raxon", 9000000, LocalDate.of(2019, Month.NOVEMBER, 11), true),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 11), true)));
        Assertions.assertEquals(Arrays.<Car>asList(new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 11), true)), result);
    }


    @Test
    void testFindSumOfCars() {
        Integer result = PracticeJava8Features.findSumOfCars(Arrays.<Car>asList(new Car("car1", 100, LocalDate.of(2021, Month.NOVEMBER, 11), true),
                new Car("car2", 34, LocalDate.of(2020, Month.DECEMBER, 21), false)));
        Assertions.assertEquals(Integer.valueOf(134), result);
    }

    @Test
    void testFindMostExpensiveCar() {
        Optional<Integer> result = PracticeJava8Features.findMostExpensiveCarPrice(Arrays.<Car>asList(new Car("Raxon", 9000000, LocalDate.of(2019, Month.NOVEMBER, 11), true),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 11), true)));

        Assertions.assertEquals(33000000, result.get());
    }

    //find the cars that doesn't have insurance
    public static Optional<Car> checkInsurance(List<Car> cars) {
        return cars.stream().filter(c -> !c.hasInsurance).findAny();
    }

    @Test
    void testCheckInsurance() {
        Optional<Car> result = PracticeJava8Features.checkInsurance(Arrays.<Car>asList(new Car("Raxon", 9000000, LocalDate.of(2019, Month.NOVEMBER, 11), false),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 11), true)));
        Assertions.assertEquals(new Car("Raxon", 9000000, LocalDate.of(2019, Month.NOVEMBER, 11), false), result.get());
    }

    @Test
    void testIsCarYearOlderThan2015() {
        boolean result = PracticeJava8Features.isCarYearOlderThan2010(Arrays.<Car>asList(new Car("Audi", 5000000, LocalDate.of(2009, Month.MAY, 23), true),
                new Car("Raxon", 9000000, LocalDate.of(2017, Month.JUNE, 1), false),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 21), true)));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testSortedByCarYear() {
        List<Car> result = PracticeJava8Features.sortedByCarYear(Arrays.<Car>asList(new Car("Audi", 5000000, LocalDate.of(2017, Month.MAY, 23), true),
                new Car("Ravon", 9000000, LocalDate.of(2009, Month.JUNE, 1), false),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 21), true)));
        Assertions.assertEquals(Arrays.<Car>asList(new Car("Ravon", 9000000, LocalDate.of(2009, Month.JUNE, 1), false),
                new Car("Audi", 5000000, LocalDate.of(2017, Month.MAY, 23), true),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 21), true)), result);
    }

    @Test
    void testFindNewestCar() {
        String result = PracticeJava8Features.findNewestCar(Arrays.<Car>asList(new Car("Audi", 5000000, LocalDate.of(2017, Month.MAY, 23), true),
                new Car("Ravon", 9000000, LocalDate.of(2009, Month.JUNE, 1), false),
                new Car("Lexus", 33000000, LocalDate.of(2020, Month.DECEMBER, 21), true)));
        Assertions.assertEquals("Lexus", result);
    }

}

