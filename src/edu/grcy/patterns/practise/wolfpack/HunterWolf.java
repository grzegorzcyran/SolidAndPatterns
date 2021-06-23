package edu.grcy.patterns.practise.wolfpack;

public class HunterWolf extends Wolf {
    private int age;
    private int noAnimalsKilled;

    public HunterWolf(String name) {
        super(name, WolfType.HUNTER);
        age = 3;
        noAnimalsKilled = 0;
    }

    public int passYear() {
        return age++;
    }

    public int hunt() {
        return noAnimalsKilled++;
    }

    @Override
    public String toString() {
        return "HunterWolf{" +
                "name=" + getName() +
                ", age=" + age +
                ", noAnimalsKilled=" + noAnimalsKilled +
                '}';
    }
}
