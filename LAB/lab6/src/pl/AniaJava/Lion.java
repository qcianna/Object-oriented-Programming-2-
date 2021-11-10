package pl.AniaJava;

public class Lion extends Animal implements MeatEater{

    private String type;

    Lion(String name, int weight, int age, String type){
        super(name, weight, age);
        this.type = type;
        animal = "lion";
    }

    public void eatMeat(){
        System.out.println(animal + " eats meat...");
    }

    public String toString(){

        String result = super.toString();
        return result + "\n-type: " + type;
    }
}