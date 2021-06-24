package edu.grcy.solid.srp.fixed;

import java.util.List;

public class SrpDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Niepomucen", "Kowalski");
        Person person2 = new Person("Adrianna", "Maria", "Zdebel");
        Person person3 = new Person("Piotr", "Zbigniew", "Jachima");
        Person person4 = new Person("Anna", "Zofia", "Jędrys");
        person1.setAge(15);
        person2.setAge(22);
        person3.setAge(33);
        person4.setAge(41);

        if(DrivingLicenseRules.canGetDrivingLicense(person1)) {
            System.out.println("Person 1 może mieć prawo jazdy" );
        } else {
            System.out.println("Person 1 jest jeszcze niewystarczająco dorosły");
        }

        List<Person> people = List.of(person1, person2, person3, person4);
        System.out.println("Drukujemy tych którzy mogą mieć prawo jazdy");
        people.stream() // tu mamy Stream(Person)
                /**
                 * Operator :: to tzw. referencja
                 * Możliwa do użycia w strumieniach, lambdach, funkcjach
                 * Wtedy i tylko wtedy gdy do metody która jest wywołana
                 * przez referencję przekazujemy obiekt który mamy na wejściu
                 * bez żadnych przekszałceń
                 */
                .filter(DrivingLicenseRules::canGetDrivingLicense) // na wyjściu nadal mamy Stream(Person), co najwyżej mniej elementów - czasem 0
                /**
                 * Na wejściu forEach mamy Stream(Person)
                 * Wywołanie System.out.println(Person) jest możliwe
                 * bo zawołany zostanie wtedy toString klasy Person
                 * czyli mamy Person na wejściu i Person przekazujemy do metody println
                 * bez przekształceń, co pozwala na użycie referencji
                 */
                //.forEach(System.out::println);
                .forEach(x -> System.out.println(x));

        System.out.println("\nA teraz tylko Ci którzy prawa jazdy nie mogą mieć\n");
        people.stream()
                .filter(x -> !DrivingLicenseRules.canGetDrivingLicense(x))
                .map(Person::getPersonInfo)
                .forEach(System.out::println); //tu na wejściu mamy Stream(String) bo wyżej map zamieniło Person na String


    }
}
