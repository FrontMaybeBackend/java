import  device.Device;
public class Car  extends Device{
    String color;

    String fuelType;
    Double millage;

    public Car(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super("Audi", " 2010 ", "vw");
        this.millage = 0.0;
        this.fuelType =  fuelType;
        this.color = color;



    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", millage=" + millage +
                '}';
    }
}
