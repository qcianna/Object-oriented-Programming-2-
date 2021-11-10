package pl.AniaJava;

public abstract class Animal{

    protected String animal;
    protected String name;
    protected int weight;
    protected int age;

    Animal(){
        this("no name", 0, 0);
        animal = "not specified";
    }

    Animal(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String toString(){
        return "\n-animal: " + animal + "\n-name: " + name + "\n-weight: " + weight + "\n-age: " + age;
    }

    public void eatPlant(){
        System.out.println(animal + " eats seeds.");
    }

    public int compare(Object animal){

        if(animal == null) return 1;
        else if (this == animal) return 1;

        Animal eater = (Animal) animal;
        if(eater.weight != weight) return 1;
        if(eater.age != age) return 1;
        if(!eater.name.equals(name)) return 1;
        return 0;
    }
}