package pl.AniaJava;

public class Lodka extends Pojazd implements PojazdPlywajacy{

    Lodka(String name){
        super(name);
    }

    public void plyn(){
        if(getMode() == true){
            System.out.println("lodka plynie");
        } else {
            System.out.println("lodka nie moze plynac bo nie jest wlaczona");
        }
    }

    public String toString(){
        return "lodka";
    }
}
