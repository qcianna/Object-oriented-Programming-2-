package pl.AniaJava;

public class PersonPrinter {

    Operation sum = (a, b) -> {return a+b;};
    Operation multiply = (a, b) -> {return a*b;};

    public static void print(Person... people) {

        for(Person p: people){
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public void printOperation(Person p1, Person p2, Operation operation) {
        System.out.println(operation.calculate(p1.getAge(), p2.getAge()));
    }

    public static void checkIfCanDrinkWithExceptionCatch(Person person) {
        try{
            if(person.getAge() >= 18){
                System.out.println(person + " Can drink");
            }
            else{
                throw new AgeException(person);
            }
        } catch (AgeException e){
            System.out.println(e + " Cannot drink alcohol");
        }
    }
}
