package edu.grcy.patterns.practise.carRental.rent;

import edu.grcy.patterns.practise.carRental.car.Car;
import edu.grcy.patterns.practise.carRental.client.Client;

import java.math.BigDecimal;

public class Rent {

    private Client client;
    private Car car;
    private RentStatus rentStatus;
    private BigDecimal rentPrice;
    private BigDecimal amountPaid;
    private PaidStatus paidStatus;

    public Rent(Client client, Car car, RentStatus rentStatus, BigDecimal rentPrice, BigDecimal amountPaid) {
        this.client = client;
        this.car = car;
        this.rentStatus = rentStatus;
        this.rentPrice = rentPrice;
        this.amountPaid = amountPaid;
        paidStatus = setByAmountPaid();
    }

    public Rent(Client client, Car car, RentStatus rentStatus, BigDecimal rentPrice) {
        this(client, car, rentStatus, rentPrice, BigDecimal.ZERO);
    }

    private PaidStatus setByAmountPaid() {
        if(BigDecimal.ZERO.equals(amountPaid)) {
            return PaidStatus.NOT_PAID;
        } else if(amountPaid.compareTo(rentPrice) == 0) {
            return PaidStatus.FULLY_PAID;
        }
        return PaidStatus.PARTIALLY_PAID;
    }

    public String getRentInfo() {
        return new StringBuilder(car.getCarInfo())
                .append(" rent for: ")
                .append(client.getFullName())
                .append("; status wypożyczenia=")
                .append(rentStatus)
                .append("; status płatności=")
                .append(paidStatus)
                .toString();
    }

    public void payForRent(BigDecimal amount) {
        amountPaid = amountPaid.add(amount);
        paidStatus = setByAmountPaid();
    }

    public void updateRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public Car getCar() {
        return car;
    }
}
