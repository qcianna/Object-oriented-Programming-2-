package pl.AniaJava;

public class Amfibia extends Pojazd implements PojazdPlywajacy, PojazdJezdzacy{

    Amfibia(String name){
        super(name);
    }

    public void jedz(){
        if(getMode() == true){
            System.out.println("amfibia jedzie");
        } else {
            System.out.println("amfibia nie jedzie");
        }
    }

    public void plyn(){
        if(getMode() == true){
            System.out.println("amfibia plynie");
        } else {
            System.out.println("amfibia nie plynie");
        }
    }

    public String toString(){
        return "amfibia";
    }
}
