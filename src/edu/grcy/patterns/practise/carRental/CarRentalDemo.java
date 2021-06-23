package edu.grcy.patterns.practise.carRental;

import edu.grcy.patterns.practise.carRental.car.Car;
import edu.grcy.patterns.practise.carRental.car.CarKind;
import edu.grcy.patterns.practise.carRental.client.Client;

import java.math.BigDecimal;

public class CarRentalDemo {
    public static void main(String[] args) {
        Client client = new Client("Jan", "Kowalski", 33, true);

        Car car = new Car("Volvo", "V40", 2015, CarKind.CAR);

        CarRental carRental = new CarRental();
        carRental.addCar(car);
        carRental.addClient(client);
        car.setDayRentPrice(BigDecimal.TEN);

        boolean isRent = carRental.rentCar(car, client, 10);
        System.out.println(isRent);
        System.out.println(carRental.rentCar(car, client, 20));
    }
}
