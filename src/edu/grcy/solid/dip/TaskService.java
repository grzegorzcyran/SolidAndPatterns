package edu.grcy.solid.dip;

/**
 * High coupling czyli silne wiązanie
 * występuje wtedy kiedy w jednej klasie mamy inicjowanie obiektów
 * innej klasy, bezpośrednio, nie przekazujemy tych obiektów z zewnątrz
 * (np. setterem czy konstruktorem)
 */
public class TaskService {
    private FileRepository repository = new FileRepository();

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }
}
