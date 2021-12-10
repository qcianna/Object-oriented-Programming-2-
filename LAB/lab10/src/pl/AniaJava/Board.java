package pl.AniaJava;

import java.util.*;

public class Board {

    private int size;
    private double probability;
    private char[][] arr;
    private Player player;
    private boolean end;

    Board() {}

    Board(int size, double probability) {
        this.size = size;
        this.probability = probability;
        arr = new char[size][size];
        player = new Player(0, size-1);
        end = false;
    }

    public void setBoard() {

        Random rand = new Random();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i == 0 && j == size-1){
                    arr[i][j] = 'S';
                    continue;
                }
                if(i == player.getY() && j == player.getX()){
                    arr[i][j] = 'G';
                    continue;
                }
                if (rand.nextInt(10) < probability*10) {
                    arr[i][j] = 'W';
                } else {
                    arr[i][j] = '*';
                }
            }
        }
    }

    public void printBoard() {

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void makeMove(String direction) throws WinnerException{

        updateBoard(true);

        if(direction.equals(Options.LEFT.getCh())) {
            player.setX(Options.LEFT.getD().getX());
        }

        if(direction.equals(Options.RIGHT.getCh())) {
            player.setX(Options.RIGHT.getD().getX());
        }

        if(direction.equals(Options.UP.getCh())) {
            player.setY(Options.UP.getD().getY());
        }

        if(direction.equals(Options.DOWN.getCh())) {
            player.setY(Options.DOWN.getD().getY());
        }

        updateBoard(false);
    }

    public void updateBoard(boolean prev) throws WinnerException{

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){

                if(arr[i][j] == 'G' && prev) {
                    arr[i][j] = '*';
                }
                if(i == player.getY() && j == player.getX() && !prev){
                    if(arr[i][j] == 'W') {
                        end = true;
                    }
                    if(arr[i][j] == 'S') {
                        end = true;
                        throw new WinnerException();
                    }
                    arr[i][j] = 'G';
                }
            }
        }
    }

    public boolean stillPlaying() {

        if(end) {
            System.out.println("*** KONIEC GRY ***");
        }

        return !end;
    }

}