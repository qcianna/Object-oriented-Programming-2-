package pl.AniaJava;

public class TooSmallGameSizeException extends Exception{

    private int size;

    TooSmallGameSizeException(int size){
        this.size = size;
    }

    public String toString(){
        return "Rozmiar jest za maly: " + size + ". Ma byc wiekszy od 3";
    }
}