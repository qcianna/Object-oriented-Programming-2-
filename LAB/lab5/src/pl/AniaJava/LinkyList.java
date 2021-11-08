package pl.AniaJava;

public class LinkyList {

    private Node head;

    static class Node{

        private int n;
        private Node next;

        Node(){}

        Node(int n){
            this.n = n;
            this.next = null;
        }
    }

    LinkyList(){}

    LinkyList(int[] arr){

        if(arr != null){
            for(int i: arr){
                add(i);
            }
        }
    }

    public void add(int number){

        Node newNode = new Node(number);
        if(head == null){
            head = newNode;
        }
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void display(){

        Node node = head;
        while(node != null){
            System.out.println(node.n);
            node = node.next;
        }
    }

    public void remove(){

        Node node = head;
        head = node.next;
    }

    public void clear(){

        Node node = head;
        while(node != null){
            head = null;
            node = node.next;
        }
    }

    public void merge(LinkyList other){

        Node node = other.head;
        while(node != null){
            add(node.n);
            node = node.next;
        }
    }

    public boolean contains(int number){

        Node node = head;
        while(node != null){
            if(node.n == number){
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
