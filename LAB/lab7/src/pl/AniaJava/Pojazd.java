package pl.AniaJava;

public abstract class Pojazd{

    protected String name;
    private boolean mode;

    Pojazd(){}

    Pojazd(String name){
        this.name = name;
        this.mode = false;
    }

    public String getName(){
        return name;
    }

    public void setMode(boolean mode){
        this.mode = mode;
    }

    public boolean getMode(){
        return mode;
    }

    abstract public String toString();
}
