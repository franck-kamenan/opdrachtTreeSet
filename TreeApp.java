package be.intecbrussel.opdrachten.opdrachttreeapp;

import java.util.*;

public class TreeApp {

    public static void main(String[] args) {

        NavigableSet<Integer> intSet = new TreeSet<>();
        intSet.add(15);
        intSet.add(14);
        intSet.add(19);
        intSet.add(24);
        intSet.add(21);

        System.out.println(intSet.first());  //kleinste
        System.out.println(intSet.last());  //grootste

        System.out.println(intSet.floor(20));  //grootste getal onder of gelijk aan 20
    }
}
