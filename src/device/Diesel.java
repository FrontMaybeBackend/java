package device;

public class Diesel extends Car{

    public Diesel(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super(producer, model, yearOfProduction, fuelType, color);
    }

    @Override
    public void refuel() {

    }
}
