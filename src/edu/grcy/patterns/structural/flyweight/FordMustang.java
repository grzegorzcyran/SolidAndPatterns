package edu.grcy.patterns.structural.flyweight;

public class FordMustang {
    //część obiektu która ma skończoną liczbę kombinacji
    private FordMustangBase mustangBase;

    //pozostałe cechy obiektu są często zmienne, duża liczba kombinacji
    private String radio;

    public FordMustang(String color, String engine, String radio) {
        System.out.println(this.getClass() + " constructor");
        this.mustangBase = MustangBaseFactory.getMustangBase(color, engine);
        this.radio = radio;
    }

    public String carInfo() {
        return "Ford Mustang: kolor: " + mustangBase.getColor() +
                ", silnik: " + mustangBase.getEngine() +
                "radio: " +radio;
    }
}
