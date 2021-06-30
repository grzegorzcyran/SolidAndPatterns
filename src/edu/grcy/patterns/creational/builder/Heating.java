package edu.grcy.patterns.creational.builder;

public class Heating {
    private String heatingType;

    public Heating(String heatingType) {
        this.heatingType = heatingType;
    }

    public String getHeatingType() {
        return heatingType;
    }
}
