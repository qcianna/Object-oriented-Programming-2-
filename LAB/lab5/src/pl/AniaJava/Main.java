package pl.AniaJava;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2,3,5,1,8};
        LinkyList list = new LinkyList(arr);
        list.display();

        System.out.println();
        list.remove();
        list.display();

        System.out.println();
        int[] arr2 = {1,1,1,1};
        LinkyList list2 = new LinkyList(arr2);
        list.merge(list2);
        list.display();

        list2.clear();
        System.out.println();
        list2.display();

        System.out.println();
        System.out.println(list2.contains(1));
    }
}
