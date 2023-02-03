package device;

public class LPG extends Car{

    public LPG(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super(producer, model, yearOfProduction, fuelType, color);
    }

    @Override
    public void refuel() {

    }
}
