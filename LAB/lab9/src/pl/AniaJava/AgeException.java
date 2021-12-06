package pl.AniaJava;

public class AgeException extends Exception {

    private Person p;

    AgeException(Person p){
        this.p = p;
    }

    public String toString(){
       return p.toString();
    }
}
