package creatures;

import java.sql.SQLOutput;

public abstract class Animal implements  Feedable {
  public  String species;
    public String name;
     public Double weight;
    public Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.weight = 0.0;
        this.alive = true;
    }
    public void feed(){
        if(this.alive == true) {
            this.weight += 0.5;
            System.out.println(this.name + " zostal nakarmiony jego aktualna waga to: " + this.weight);
        }
        else{
            System.out.println("nie mozesz nakarmic martwego zwierzecia");
        }

    }
    public void takeForAWalk(){
        if(this.alive == true) {

            this.weight -= 0.3;//

        System.out.println(this.name +" zostal zabrany na spacer jego aktualna waga to: " + this.weight);
            if (this.weight <= 0)
            {
                System.out.println("twój kot umarl");
                this.alive = false;
            }
    }
        else{
            System.out.println("nie mozesz wyjsc na spacer z martwym zwierzeciem");
        }

    }




}
