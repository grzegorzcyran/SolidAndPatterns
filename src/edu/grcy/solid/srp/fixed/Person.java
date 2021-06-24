package edu.grcy.solid.srp.fixed;

public class Person {
    private String name;
    private String secondName;
    private String surname;
    private int age;

    public Person(String name, String secondName, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPersonInfo() {
        return new StringBuilder(surname)
                .append(" ")
                .append(name)
                .toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
