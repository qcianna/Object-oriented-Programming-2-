package pl.AniaJava;

/*
Lab 2.
    Szyfr Cezara
        Napisz program który będzie obsługiwał dwa tryby oraz przesunięcie w alfabecie niezbędne do zakodowania słowa w szyfr cezara
        (tryb oraz przesunięcie przekazane jako argumenty programu):
        1. Input od użytkownika zostaje zaszyfrowany i wypisany na konsole. (4pkt za obsługę pojedyńczych wyrazów + 1 pkt za obsługe całych
        zdań ze spacjami)
        2. Input od użytkownika zostaje odszyfrowany i wypisany na konsole. (4pkt za obsługę pojedyńczych wyrazów + 1 pkt za obsługe całych
        zdań ze spacjami)

    Argumenty programu przekazane jako:

        java lab2 code 2
        java lab2 decode 2

    Przykładowy wynik:

        Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
        Dla słowa: TEST
        Przesunięcia: 2
        Trybu: code

        Wynik: VGUV

        Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
        Dla słowa: VGUV
        Przesunięcia: 2
        Trybu: decode

        Wynik: TEST
*/

public class Main{

    public static String code(String txt, int n){

        String coded = new String();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                coded += txt.charAt(i);
            }
            else{
                coded += (char)(((65 + txt.charAt(i) + n)%26) + 65);
            }
        }

        return coded;
    }

    public static String decode(String txt, int n){

        String decoded = new String();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                decoded += txt.charAt(i);
            }
            else{
                decoded += (char)(((65 + txt.charAt(i) - n)%26) + 65);
            }
        }

        return decoded;
    }

    public static void main(String[] args){

        // coding
        String txt = new String();
        for (int i=0; i<args.length-2; i++) {
            txt += args[i];
            txt += ' ';
        }

        Integer move = Integer.parseInt(args[args.length-1]);
        System.out.println(txt);
        System.out.println(args[args.length-2]);
        if(args[args.length-2].equals("code")){
            String coded = code(txt, move);
            System.out.println("CODED: " + coded);
        }

        //decoding
        else if(args[args.length-2].equals("decode")){
            String decoded = decode(txt, move);
            System.out.println("DECODED: " + decoded);
        }

        else {
            System.out.println("Wrong instruction");
        }
    }
}
