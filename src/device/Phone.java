package device;

import java.net.URL;
import java.util.List;

public class Phone extends Device  {

    public static final  String DEFAULT_SERVER_ADDRESS = "https://JAKIESTAM/APPS";
    public  static final String DEFAULT_SERVER_PROTOCOL = "https";
    public static final String DEFAULT_SERVER_VERSION = "default";
    public Double screenSize;
    public  String Os;
    private String nameApp;
    private String version;

    public Phone(String model, Double screenSize, String os, String producer) {
        super("xiaomi", "2018", "xiaomi");
        this.screenSize = screenSize;
        this.Os = os;

    }

    @Override
    public String toString() {
        return "device.Phone{" +
                "screenSize=" + screenSize +
                ", Os='" + Os + '\'' +
                '}';
    }


    public  void turnOn() {
        System.out.println("Wciskam przycisk");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Działa");
    }

    public  void installAnApp(List<String> apps) {
        for (String appName : apps) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_SERVER_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("pobieram");
        System.out.println("sprawdzam miejsce");
        System.out.println("sprawdzam kontrole rodzicielską");
        System.out.println("ups, nie możesz zainstalować");
        //wypisanie co dokładnie instaluje

        System.out.println(appName);
        System.out.println(version);
        System.out.println(server);

    }



}