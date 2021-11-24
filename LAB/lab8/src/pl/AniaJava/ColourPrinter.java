package pl.AniaJava;

public class ColourPrinter{

    static public void printColours(){
        Colours[] colours = Colours.values();
        for(Colours c: colours){
            System.out.println("Kolor " + c.name() + " po polsku " + c.getPolishName());
        }
    }

    static public void printGetNameColours(){
        Colours[] colours = Colours.values();
        for(Colours c: colours){
            System.out.println(c.getPolishName());
        }
    }

    static public void printSaySomethingColours(){
        Colours[] colours = Colours.values();
        for(Colours c: colours){
            System.out.println("Kolor to " + c.getPolishName());
        }
    }
}
