package pl.AniaJava;

public class Elephant extends Animal implements PlantEater{

    Elephant(String name, int weight, int age){
        super(name, weight, age);
        animal = "elephant";
    }

    public void eatPlant(){
        System.out.println(animal + " eats leaves.");
    }
}