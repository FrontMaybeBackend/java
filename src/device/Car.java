package device;

import creatures.Human;

public class Car  extends Device implements Saleable{
   public String color;

     public String fuelType;
     public Double millage;

     public Double value;
    private Human owner;

    public Car(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super("Audi", " 2010 ", "vw");
        this.millage = 0.0;
        this.fuelType =  fuelType;
        this.color = color;



    }

    @Override
    public String toString() {
        return "device.Car{" +
                "color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", millage=" + millage +
                '}';
    }


    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("Przekręcam kluczyk");
        System.out.println("Odpalam");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
            if (!seller.equals(this.owner)) {
                System.out.println("Sprzedający nie posiada tego samochodu.");
                return;
            }
            if (buyer.cash < price) {
                System.out.println("Kupujący nie ma wystarczającej ilości gotówki.");
                return;
            }
            if(seller instanceof  Human && !(buyer instanceof Human)){
                throw new IllegalArgumentException("Tylko zakup samochodu jest możliwy, w tym komisie nie handlujemy ludźmi");
            }
            buyer.cash -= price;
            seller.cash += price;
        this.owner = buyer;
        System.out.println("Transakcja przebiegła pomyślnie, nowy właściciel: " + buyer.getFirstName());
    }

    public Double getValue() {
        return value;
    }


    public Human getOwner() {
        return
                owner;
    }

    public void setOwner(Human seller) {
        this.owner = seller;
    }
}
