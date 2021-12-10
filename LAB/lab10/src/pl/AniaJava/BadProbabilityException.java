package pl.AniaJava;

public class BadProbabilityException extends Exception{

    private final double probability;

    BadProbabilityException(double probability){
        this.probability = probability;
    }

    public String toString(){
        return "Zla wartosc " +  probability + ". Powinna byc w zakresie (0,1)";
    }
}