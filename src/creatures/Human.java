package creatures;

import device.Car;
import device.Phone;

import java.time.LocalDateTime;

public class Human  extends Animal {
    String firstName;
    String lastName;
   private Car car;
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

    public Car getCar() {
        return car;
    }



    public void setCar(Car newCar){
         if(salary >= newCar.getValue()) {
             System.out.println("Udało się kupić auto za gotówkę!");
             this.car = newCar;
         } else if (salary > newCar.getValue()/12) {
             System.out.println("Udało się kupic auto na kredyt!");
             this.car=newCar;
             
         }else{
             System.out.println("uzapisz się na studia i znajdź nową robotę albo idź po \n" +
                     "podwyżkę ");
         }


    }
}
