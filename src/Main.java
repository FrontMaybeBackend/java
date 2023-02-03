import creatures.Animal;
import creatures.Human;
import device.Car;
import device.Phone;

import java.net.URL;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("vw", "passat", 2001, "diesel", "blue") {
            @Override
            public void refuel() {

            }
        };
        audi.millage = 70000.0;

        System.out.println("Producent: " + audi.color);
        System.out.println("Typ Paliwa: " + audi.fuelType);
        System.out.println("Przebieg: " + audi.millage);



        Car fiat = new Car("fiat", "bravo", 2010, "diesel", "black") {
            @Override
            public void refuel() {

            }
        };
        fiat.millage = 312312.5;
        System.out.println();
        System.out.println("Producent: " + fiat.color);
        System.out.println("Typ Paliwa: " + fiat.fuelType);
        System.out.println("Przebieg: " + fiat.millage);



        Animal kot = new Animal("Ssak") {
            @Override
            public void feed(int foodWeight) {

            }
        };
        kot.name = "puszek";
        kot.weight = 1.5;
        kot.alive = true;

        System.out.println("gatunek: " + kot.species);
        System.out.println("imie: " + kot.name);
        System.out.println("waga: " + kot.weight);
        if(kot.alive == true)
        {
            System.out.println("czy zyje: tak");}
        else{
            System.out.println("czy zyje: nie");
        }
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();


        Human kacper = new Human("Kacper",2000.0);
        System.out.println(kacper.weight);
        System.out.println(kacper.species);

        Phone xiaomi  = new Phone("Xiaomi" , 2.0 , "android", "ada");


        System.out.println("ScreenSize: " + xiaomi.screenSize);
        System.out.println("System: " + xiaomi.Os);

        audi.turnOn();
        xiaomi.turnOn();

        Car bmw = new Car("bmw", "x5", 2020, "diesel", "blue") {
            @Override
            public void refuel() {

            }
        };
        Car porsche = new Car("audi", "b5", 2019, "gas", "black") {
            @Override
            public void refuel() {

            }
        };
        Car bmw2 = new Car("bmw", "x5", 2020, "diesel", "blue") {
            @Override
            public void refuel() {

            }
        };

         System.out.println("BMW VS BMW2" + bmw.equals(bmw2));

        Human seller = new Human("Marcin", 6000.0);
        Human buyer = new Human ("Kacper", 10000.0);
        Car FIATOS = new Car("bmw", "bmw", 2020, "diesel", "blue") {
            @Override
            public void refuel() {

            }
        };
        FIATOS.setOwner(seller);


          FIATOS.sell(seller,buyer,5000.0);
        System.out.println("Seller name: " + seller.getFirstName() + " cash: " + seller.getCash());
        System.out.println("Buyer name: " + buyer.getFirstName() + " cash: " + buyer.getCash());
        System.out.println("Car owner name: " + FIATOS.getOwner().getFirstName());



      Phone iphone = new Phone ("xiaomi", 2.0, "ios", "xiaomi");
      iphone.installAnApp("twitter","2", "https://twitter.com");



    }
}

