package carrental.model;

public class ElectricCar extends Car {

    public ElectricCar(String brand, double pricePerDay) {
        super(brand, pricePerDay);
    }

    @Override
    public double calculateRentalFee(int days) {
        return days * getPricePerDay();
    }
}
