import  device.Device;

public class Phone extends Device  {
    String model;
    String producer;
    String screenSize;
    public  String Os;

    public Phone(String model, String screenSize, String os, String producer) {
        super("xiaomi", "2018", "xiaomi");
        this.screenSize = screenSize;
        Os = os;
        this.model = model;
this.producer = producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", Os='" + Os + '\'' +
                '}';
    }
}
