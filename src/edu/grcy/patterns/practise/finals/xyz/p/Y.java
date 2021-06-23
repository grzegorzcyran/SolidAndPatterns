package edu.grcy.patterns.practise.finals.xyz.p;

public class Y extends X {
    public Y() {
        //domyślnie zaczyna od konstruktora nadklasy czyli woła X();
        System.out.print("Y:C ");
    }

    @Override
    public void a() {
        System.out.print("Y:A");
    }
}
