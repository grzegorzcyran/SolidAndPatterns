package edu.grcy.solid.dip.fix;

public class TaskService {
    Repository repository;

    //Kompozycja to składanie większego obiektu z mniejszych
    //czyli np np w klasie Person będziemy mieć obiekt klasy Adres, obiekt klasy DaneFinansowe, ...

    //Dziedziczenie mamy wtedy kiedy jedna klasa rozszerza działanie drugiej - czyli ma wszystie
    //możliwości klasy bazowej i jakies dodatkowe

    /**
     * Dependency Injection polega na tym że nie inicjujemy jednego obiektu
     * w drugim na sztywno tylko przekazujemy w konstruktorze lub setterze
     * Najlepiej jak zadeklarujemy interfejs (klasę abstrakcyjną) co spowoduje
     * że będzie uniwersalnie, będziemy mogli przekazać kilka różnych implementacji
     * nie zmieniając istniejącego kodu
     */
    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }

    /**
     * Setter też może inicjować obiekt
     * Dobrą praktyką jest zdecydowanie się na jeden rodzaj DependencyInjection
     * albo setterami, albo konstruktorami, mieszanie jest oczywiście możliwe
     * ale wprowadza niepotrzebny bałagan
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
