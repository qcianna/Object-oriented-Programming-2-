package pl.AniaJava;

public class CommandNotRecognisedException extends Exception{

    final private String command;

    CommandNotRecognisedException(String command){
        this.command = command;
    }

    public String toString(){
        return "Zla komenda: " +  command + ". Sprobuj l, p, g, d, q";
    }
}