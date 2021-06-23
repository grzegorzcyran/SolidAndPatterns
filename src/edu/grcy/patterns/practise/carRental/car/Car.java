package edu.grcy.patterns.practise.carRental.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;
    private CarKind kind;
    private BigDecimal dayRentPrice;

    public Car(String brand, String model, int year, CarKind kind) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.kind = kind;
        dayRentPrice = BigDecimal.TEN;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public CarKind getKind() {
        return kind;
    }

    public BigDecimal getDayRentPrice() {
        return dayRentPrice;
    }

    public String getCarInfo() {
        return new StringBuilder("Car : ")
                .append(brand)
                .append("; model=")
                .append(model)
                .append("; year=")
                .append(year)
                .append("; ")
                .append(kind.getInfo())
                .toString();
    }

    public void setDayRentPrice(BigDecimal dayRentPrice) {
        this.dayRentPrice = dayRentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }
}
