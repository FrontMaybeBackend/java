package creatures;

import device.Car;
import device.Phone;

import java.time.LocalDateTime;

public class Human  extends Animal {
    String firstName;
    String lastName;
   public Car car;
    Phone phone;
    Animal pet;

   private Double salary;
    public Double cash;

     public Human (String firstName){
         super("homo sapiens");
         this.salary  =0.0;
         this.firstName = firstName;
         this.weight = 70.0;
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


}
