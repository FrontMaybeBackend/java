package device;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super(producer, model, yearOfProduction, fuelType, color);
    }

    @Override
    public void refuel() {

    }
}
