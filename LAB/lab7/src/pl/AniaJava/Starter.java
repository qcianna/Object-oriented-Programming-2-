package pl.AniaJava;

public class Starter{

    public static void start(Pojazd pojazd){
        if(!pojazd.getMode()) {
            System.out.println(pojazd + " " + pojazd.getName() + " uruchamia silnik");
            pojazd.setMode(true);
            return;
        }
        System.out.println(pojazd + " " + pojazd.getName() + " zaczyna sie poruszac");
    }

    public static void stop(Pojazd pojazd){
        if(pojazd.getMode()) {
            System.out.println(pojazd + " " + pojazd.getName() + " zatrzymuje silnik");
            pojazd.setMode(false);
            return;
        }
        System.out.println(pojazd + " " + pojazd.getName() + " przestaje sie poruszac");
    }
}
