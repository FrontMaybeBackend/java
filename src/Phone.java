import  device.Device;

public class Phone extends Device  {


    public Double screenSize;
    public  String Os;

    public Phone(String model, Double screenSize, String os, String producer) {
        super("xiaomi", "2018", "xiaomi");
        this.screenSize = screenSize;
        this.Os = os;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", Os='" + Os + '\'' +
                '}';
    }
}
