package carrental.model;

import carrental.util.Rentable;

public abstract class Car implements Rentable {

    private String brand;
    private double pricePerDay;
    private boolean available;

    public Car(String brand, double pricePerDay) {
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public String getBrand() {
        return brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        this.available = false;
    }

    public void returnCar() {
        this.available = true;
    }
}
