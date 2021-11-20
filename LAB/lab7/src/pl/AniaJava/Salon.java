package pl.AniaJava;

import java.util.*;

public class Salon{

    private String name;
    private List<Pojazd> list = new ArrayList<>();

    Salon(){}

    Salon(String name){
        this.name = name;
    }

    Salon(Salon salon, String name){
        this.name = name;
        list.addAll(salon.list);
    }

    public void dodajPojazd(Pojazd pojazd){
        System.out.println("dodaje nowy pojazd");
        list.add(pojazd);
    }

    public void wypiszWszystkiePojazdy(){
        System.out.println("POJAZDY W SALONIE:");
        for(Pojazd p: list) {
            System.out.println(" - " + p);
        }
    }

    public void usunPojazd(Pojazd pojazd){
        System.out.println("usuwam " + pojazd + " " + pojazd.getName() + " z " + name);
        list.remove(pojazd);
    }

    public void zawieraPojazd(Pojazd pojazd){
        System.out.println(list.contains(pojazd));
    }
}
