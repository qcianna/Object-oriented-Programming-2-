package pl.AniaJava;

public enum Colours{
    RED("czerwony"),
    GREEN("zielony"),
    YELLOW("zolty"),
    BLUE("niebieski");

    private String polishName;

    Colours(String polishName){
        this.polishName = polishName;
    }

    public String getPolishName(){
        return polishName;
    }
}