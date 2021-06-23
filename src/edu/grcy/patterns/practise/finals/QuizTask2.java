package edu.grcy.patterns.practise.finals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QuizTask2 {
    public static void main(String[] args) {
        List<String> listA = new LinkedList<>();
        listA.add("E");
        listA.add("B");

        //pod nazwą listB trzymaj to samo co listA
        //bo nie ma tu nigdzie new
        //final List<String> listB = listA;
        final List<String> listB = new LinkedList<>(listA);
        Collections.sort(listA);

        listB.add("C");

        System.out.print(listA + " ");
        System.out.print(listB + " ");

        String max = Collections.max(listB);
        System.out.println(max);
    }
}
