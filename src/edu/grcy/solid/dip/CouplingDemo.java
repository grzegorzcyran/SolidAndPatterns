package edu.grcy.solid.dip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CouplingDemo {
    public static void main(String[] args) {

        //Loose coupling - słabe wiązanie
        //Po lewej stronie interfejs, po prawej klasa
        List<String> stringList = new ArrayList<>();

        //High coupling - silne wiązanie
        //po obu stronach mamy KLASĘ
        ArrayList<String> anotherList = new ArrayList<>();

        //...

        stringList = new LinkedList<>();

        //anotherList = new LinkedList<>();

        listPerform(stringList);
        listPerform(anotherList);
        //błąd: arrayListPerform(stringList); //wrzucamy LinkedList to krzyczy że wymaga ArrayList
        arrayListPerform(anotherList);
    }

    public static void listPerform(List<String> list) {
        System.out.println("Some operations on list");
    }

    public static void arrayListPerform(ArrayList<String> list) {
        System.out.println("Some operations on list");
    }
}
