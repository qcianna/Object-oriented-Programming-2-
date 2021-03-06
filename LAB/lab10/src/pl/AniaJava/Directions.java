package pl.AniaJava;

public enum Directions {
    LEFT(-1, 0),
    RIGHT(1, 0),
    UP(0, -1),
    DOWN(0, 1);

    final private int x;
    final private int y;

    Directions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
