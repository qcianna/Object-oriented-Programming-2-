package pl.AniaJava;

public class Main {

    public static String code(String txt, int n, String a){

        String coded = new String();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                coded += txt.charAt(i);
            }
            else{
                int index = (26 + a.indexOf(txt.charAt(i)) + n) % 26;
                coded += a.charAt(index);
            }
        }

        return coded;
    }

    public static String decode(String txt, int n, String a){

        String decoded = new String();
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) == ' '){
                decoded += txt.charAt(i);
            }
            else{
                int index = (26 + a.indexOf(txt.charAt(i)) - n) % 26;
                decoded += a.charAt(index);
            }
        }

        return decoded;
    }

    public static void main(String[] args) {

        String txt = new String();
        for (int i=0; i<args.length-2; i++) {
            txt += args[i];
            txt += ' ';
        }

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Integer move = Integer.parseInt(args[args.length-1]);
        System.out.println(txt);
        System.out.println(args[args.length-2]);

        if(args[args.length-2].equals("code")){
            String coded = code(txt, move, alphabet);
            System.out.println("CODED: " + coded);
        }

        //decoding
        else if(args[args.length-2].equals("decode")){
            String decoded = decode(txt, move, alphabet);
            System.out.println("DECODED: " + decoded);
        }

        else {
            System.out.println("Wrong instruction");
        }
    }
}
