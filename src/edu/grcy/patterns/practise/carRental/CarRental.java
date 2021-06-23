package edu.grcy.patterns.practise.carRental;

import edu.grcy.patterns.practise.carRental.car.Car;
import edu.grcy.patterns.practise.carRental.client.Client;
import edu.grcy.patterns.practise.carRental.rent.Rent;
import edu.grcy.patterns.practise.carRental.rent.RentStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRental {
    private List<Client> clients;
    private List<Car> cars;

    private List<Rent> carRents;

    public CarRental() {
        clients = new ArrayList<>();
        cars = new ArrayList<>();
        carRents = new ArrayList<>();
    }

    public boolean addClient(Client client) {
        return clients.add(client);
    }

    public boolean addCar(Car car) {
        return cars.add(car);
    }

    public boolean rentCar(Car car, Client client, int days) {

        if(isCarCurrentlyRent(car)) {
            return false;
        }
        //wypożyczenie
        BigDecimal rentPrice  = car.getDayRentPrice().multiply(BigDecimal.valueOf(days));
        Rent currentRent = new Rent(client, car, RentStatus.RENT, rentPrice);
        currentRent.updateRentStatus(RentStatus.RENT);
        carRents.add(currentRent);

        return true;
    }

    private boolean isCarCurrentlyRent(Car car) {
        /*czy samochód już jest wypożyczony (na liście carRents, z odpowiednim statusem)*/
        Optional<Rent> checkRent = carRents.stream()
                .filter(x -> car.equals(x.getCar()))
                .filter(x -> RentStatus.RENT.equals(x.getRentStatus()))
                .findFirst();
        return checkRent.isPresent();

    }
}
