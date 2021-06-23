package edu.grcy.patterns.practise.wolfpack;

public class AlfaWolf extends Wolf {

    //Alfa should be one in group, so let it be singleton
    private static final Wolf ALFA = new AlfaWolf();

    private AlfaWolf() {
        super("Alfa", WolfType.ALFA);
    }

    public static Wolf getALFA() {
        return ALFA;
    }

    @Override
    public String toString() {
        return "AlfaWolf{" +
                "boss=" + ALFA.getName() +
                ", rules the group" +
                '}';
    }
}
