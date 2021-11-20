package pl.AniaJava;

public class SamochodOsobowy extends Pojazd implements PojazdJezdzacy{

    SamochodOsobowy(String name){
        super(name);
    }

    public void jedz(){
        if(getMode() == true){
            System.out.println("samochod jedzie");
        } else {
            System.out.println("samochod nie jedzie");
        }
    }

    public String toString(){
        return "samochod";
    }
}
