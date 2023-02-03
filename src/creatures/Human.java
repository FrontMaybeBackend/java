package creatures;

import device.Car;
import device.Phone;
import device.Saleable;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class Human extends Animal implements Saleable {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;

    private Double salary;
    public Double cash;
    private Human owner;
    private String name;

    private Car[] garage;
    private double value;

    public Human(String firstName, Double cash) {
        super("homo sapiens");
        this.salary = 0.0;
        this.firstName = firstName;
        this.weight = 70.0;
        this.cash = cash;
        this.garage = new Car[1];
    }

    public Human(String firstName, Double cash, int garageSize) {
        super("homo sapiens");
        this.salary = 0.0;
        this.firstName = firstName;
        this.weight = 70.0;
        this.cash = cash;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println("Data pobrania wynagrodzenia:" + LocalDateTime.now());
        System.out.println("Wartość wynagrodzenia przed zwróceniem " + salary);
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary < 0) {
            throw new IllegalArgumentException("Wynagrodzenie nie może być ujemne");
        }
        System.out.println("Nowe dane wynagrodzenia zostały wysłane do systemu księgowego");
        System.out.println("Konieczne odebranie aneksu do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wynagrodzenia, nie ma sensu ukrywać dochodu");
        this.salary = newSalary;
    }

    public Car getCar(int parkingSpot) {
        return garage[parkingSpot];
    }

    public void setCar(int parkingSpot, Car car) {
        garage[parkingSpot] = car;
    }

    public Double valueOfCars() {
        double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortCarsByYear() {
        Arrays.sort(garage, (a, b) -> {
            if (a != null && b != null) {
                return Integer.compare(a.year, b.year);
            } else if (a == null) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    public void sell(Human buyer, Double price) throws Exception {
        if (price > this.value) {
            throw new Exception("Sprzedający nie posiada samochodu");
        }
        int freeSpot = -1;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Double getCash() {
        return this.cash;
    }
}