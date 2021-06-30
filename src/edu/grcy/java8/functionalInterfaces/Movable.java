package edu.grcy.java8.functionalInterfaces;

@FunctionalInterface
public interface Movable {

    String move();

    default String moveWith(String partner) {
        return move() + " with " + partner;
    }

    default String moveAlone(String reason) {
        return move() + " alone because of " + reason;
    }
}
