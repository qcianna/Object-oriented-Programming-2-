package pl.AniaJava;

public enum Options {
    LEFT("l", "lewo", Directions.LEFT),
    RIGHT("p", "prawo", Directions.RIGHT),
    UP("g", "gora", Directions.UP),
    DOWN("d", "dol", Directions.DOWN),
    END("q", "koniec", null);

    final private String ch;
    final private String option;
    final private Directions d;

    Options(String ch, String option, Directions d) {
        this.ch = ch;
        this.option = option;
        this.d = d;
    }

    public String getCh() {
        return ch;
    }

    public Directions getD() {
        return d;
    }

    public String toString() {
        return ch + " -> " + option;
    }
}
