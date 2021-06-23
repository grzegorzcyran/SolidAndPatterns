package edu.grcy.patterns.practise.finals.xyz;

import edu.grcy.patterns.practise.finals.xyz.p.X;
import edu.grcy.patterns.practise.finals.xyz.p.Y;

public class Main {
    public static void main(String[] args) {
        X z = new Y();
        //z jest obiektem klasy Y więc wywołuje metodę a() z klasy Y
        z.a();
    }
}
