import device.Car;
import device.Phone;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("vw", "passat", 2001, "diesel", "blue");
        audi.millage = 70000.0;

        System.out.println("Producent: " + audi.color);
        System.out.println("Typ Paliwa: " + audi.fuelType);
        System.out.println("Przebieg: " + audi.millage);



        Car fiat = new Car("fiat","bravo",2010, "diesel", "black");
        fiat.millage = 312312.5;
        System.out.println();
        System.out.println("Producent: " + fiat.color);
        System.out.println("Typ Paliwa: " + fiat.fuelType);
        System.out.println("Przebieg: " + fiat.millage);



        Animal kot = new Animal("Ssak");
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


        Human kacper = new Human("Kacper");
        System.out.println(kacper.weight);
        System.out.println(kacper.species);

        Phone xiaomi  = new Phone("Xiaomi" , 2.0 , "android", "ada");


        System.out.println("ScreenSize: " + xiaomi.screenSize);
        System.out.println("System: " + xiaomi.Os);

        audi.turnOn();
        xiaomi.turnOn();

    }

}