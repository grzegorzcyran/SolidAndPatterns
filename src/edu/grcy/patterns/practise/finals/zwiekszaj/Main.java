package edu.grcy.patterns.practise.finals.zwiekszaj;

public class Main {
    private static int zwiekszaj(int a) {
        if (a++ > 10) {
            throw new IllegalArgumentException("Za duża liczba!");
        }
        return a + 1;
    }

    public static void main(String[] args) {
        int x = 8;
        zwiekszaj(x);
        System.out.print(x + " ");
        int y = zwiekszaj(x);
        System.out.print(x + y + " ");
        zwiekszaj(y);
        System.out.print(y + " ");
        int z = zwiekszaj(y);
        System.out.print(y + z + " ");
        System.out.print(z);
    }
}