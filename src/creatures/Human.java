package creatures;

import device.Car;
import device.Phone;

public class Human  extends Animal {
    String firstName;
    String lastName;
   public Car car;
    Phone phone;
    Animal pet;

    Double salary;
    public Double cash;

     public Human (String firstName){
         super("homo sapiens");
         this.salary  =0.0;
         this.firstName = firstName;
         this.weight = 70.0;
     }



}
