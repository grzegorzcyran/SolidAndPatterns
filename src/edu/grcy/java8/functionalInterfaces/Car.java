package edu.grcy.java8.functionalInterfaces;

/**
 * Klasa Car to tzw. immutable class
 * bo po zdeklarowaniu obiektu nie można go już zmodyfikować
 *
 * Obiekty immutable są bezpieczne do używania w wielowątkowości
 * bo mamy gwarancję że w trakcie używania obiektu nie zostanie jego
 * zawartość zmieniona przez inny wątek
 */

public class Car {
    private String name;
    private String engine;

    public Car(String name, String engine) {
        System.out.println("Creating new car " + name + " with engine " + engine);
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }
}
