package pl.AniaJava;

public class Canary extends Animal implements PlantEater{

    Canary(String name){
        this.name = name;
        animal = "canary";
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