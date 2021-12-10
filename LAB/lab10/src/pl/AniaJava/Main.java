package pl.AniaJava;

// Celem dzisiejszych zajęć jest napisanie prostej "gry"
// Na początku program powinien przyjąć od użytkownika dwie wartości:
// - rozmiar planszy (liczba większa od 3, jeśli użytkownik poda mniejszą powinien polecieć wyjątek(np. TooSmallGameSizeException) nastepnie zostac zlapany i wyswietlona informacja uzytkownikowi "Podano zbyt mały rozmiar, spróbuj ponownie")
// - prawdopodobienstwo wystapienia wody( wieksze od 0, analogiczna sytuacja do rozmiaru)
// Na postawie tych wartości należy stworzyć kwadratową planszą (tablice tablic, lub listę list). Następnie należy ją wypełnić znakami:
// - znak W -> woda z prawdopodobienstwem podanym przez uzytkownika
// - znak S -> skarb, jeden na całą planszę
// - znak G -> gracz, jeden na całą planszę
// - pozostałe pola wypelnic znakiem *
// Potem nalezy ja wyswietlic
// Nastepnie program powinien zaczac zbierac opcje od uzytkownika:
// - l -> gracz porusza sie w lewo
// - p -> gracz porusza sie w prawo
// - g -> gracz porusza sie w gore
// - d -> gracz porusza sie w dol
// Po wybraniu opcji plansza powinna przerysowac sie na nowo
// Gra powinna obsługiwać wyjątki takie jak:
// - wejscie w wodę -> powinien poleciec wyjatek -> gra konczy sie napisem "Wszedłeś w wodę, koniec gry"
// - nierozpoznanie opcji -> CommandNotRecognisedException
// - wejscie w pole skarbu -> powinien poleciec wyjatek -> gra konczy sie napisem "Wygrałeś!!!"
// Wejscie w pole skarbu lub wody konczy wykonywanie programu

import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        try{

            System.out.print("Podaj rozmiar: ");
            int size = scanner.nextInt();

            if(size <= 3){
                throw new TooSmallGameSizeException(size);
            }

            System.out.print("Podaj prawdopodobienstwo: ");
            double probability = scanner.nextDouble();

            if(probability <= 0 || probability >= 1) {
                throw new BadProbabilityException(probability);
            }

            Board board = new Board(size, probability);

            board.setBoard();
            board.printBoard();

            System.out.println();
            for(Options o: Options.values()) {
                System.out.println(o);
            }
            System.out.println();

            String ch = "";
            while(board.stillPlaying() && !ch.equals("q")) {

                System.out.print("Podaj znak: ");
                ch = scanner.next();
                if(!ch.equals(Options.LEFT.getCh()) && !ch.equals(Options.RIGHT.getCh())
                        && !ch.equals(Options.UP.getCh()) && !ch.equals(Options.DOWN.getCh()) && !ch.equals(Options.END.getCh())) {
                    throw new CommandNotRecognisedException(ch);
                }
                board.makeMove(ch);
                board.printBoard();
            }

        } catch (TooSmallGameSizeException | BadProbabilityException | CommandNotRecognisedException | WinnerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other error occured");
        }

    }
}
