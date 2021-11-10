package pl.AniaJava;

public class Parrot extends Animal implements PlantEater, Bird{

    Parrot(){
        animal = "parrot";
    }

    public void setName(String name){
        this.name = name;
    }

    public void createEgg(){
        System.out.println(animal + " lays eggs.");
    }

    public void eatPlant(){
        System.out.println(animal + " eats seeds.");
    }
}