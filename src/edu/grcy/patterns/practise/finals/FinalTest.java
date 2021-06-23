package edu.grcy.patterns.practise.finals;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {
    public static void main(String[] args) {
        final List<String> finalList = new ArrayList<>();
        //jak lista jest final to można do niej dodawać / z niej usuwać elementy
        finalList.add("Sth");
        finalList.add("Sth else");
        finalList.forEach(System.out::println);

        //przypisanie nowej listy do finalnej zmiennej
        //to poniżej się nie skompliluje
        //finalList = new LinkedList<>();
    }
}
