package edu.grcy.patterns.creational.singleton;

public class SingletonUsage {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        //EagerSingleton eagerSingleton2 = new EagerSingleton(); konstruktor prywatny, nie da się

        System.out.println(eagerSingleton.getOtherField());

        System.out.println(EagerSingleton.getInstance().getOtherField());

        EagerSingleton anotherSingleton = EagerSingleton.getInstance();
        System.out.println(anotherSingleton.getOtherField());

        EagerSingleton.getInstance().setOtherField("yyyuuu");
        System.out.println("\nUstawienie other field na 1 instancji\n");
        System.out.println(EagerSingleton.getInstance().getOtherField());
        System.out.println(eagerSingleton.getOtherField());
        System.out.println(anotherSingleton.getOtherField());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        /**
         * Double lock singleton - LAZY ale z podwójnym sprawdzaniem, nadaje się do wątków
         * Enum - obecnie częściej spotykany typ singletona
         */
    }
}
