//        Szyfr Cezara
//
//        Napisz program który będzie obsługiwał dwa tryby oraz przesunięcie w alfabecie niezbędne do zakodowania słowa w szyfr cezara
//
//        (tryb oraz przesunięcie przekazane jako argumenty programu):
//
//        1. Input z pliku zostaje zaszyfrowany i zapisany do pliku o tej samej nazwie + _coded_{przesuniecie}.txt (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//        2. Input z pliku zostaje odszyfrowany i zapisany do pliku o tej samej nazwie + _decoded_{przesuniecie}.txt. (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//
//        3. Argumenty programu przekazane jako:
//        java lab2 code 2 test.txt
//        java lab2 decode 2 test.txt
//
//                test.txt zawiera słowo TEST
//
//        4. Przykładowy wynik:
//                (To wypisujemy na konsole)
//        Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        Dla pliku z zawartoscia: TEST
//        Przesunięcia: 2
//        Trybu: code
//        Wynik: VGUV
//
//                (To trafia do pliku o nazwie test_coded_2.txt)
//                VGUV
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13 {

    public static String code(String txt, int n, String a){

        StringBuilder coded = new StringBuilder();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                coded.append(txt.charAt(i));
            }
            else{
                int index = (26 + a.indexOf(txt.charAt(i)) + n) % 26;
                coded.append(a.charAt(index));
            }
        }

        return coded.toString();
    }

    public static String decode(String txt, int n, String a){

        StringBuilder decoded = new StringBuilder();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                decoded.append(txt.charAt(i));
            }
            else{
                int index = (26 + a.indexOf(txt.charAt(i)) - n) % 26;
                decoded.append(a.charAt(index));
            }
        }

        return decoded.toString();
    }

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int move = Integer.parseInt(args[1]);
        String fileName = args[2];
        String name = fileName.split("\\.")[0];
        String mode = args[0];

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            String txt = scanner.nextLine();
            scanner.close();

            if(mode.equals("code")){
                String coded = code(txt, move, alphabet);
                PrintWriter codedFile = new PrintWriter(name + "_coded_" + move + ".txt");
                codedFile.println(coded);
                codedFile.close();
            }

            else if(mode.equals("decode")){
                Scanner codedFileScanner = new Scanner(new File(name + "_coded_" + move + ".txt"));
                String codedTxt = codedFileScanner.nextLine();
                String decoded = decode(codedTxt, move, alphabet);
                PrintWriter decodedFile = new PrintWriter(name + "_decoded_" + move + ".txt");
                decodedFile.println(decoded);
                decodedFile.close();
            }

            else {
                System.out.println("Wrong instruction");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
