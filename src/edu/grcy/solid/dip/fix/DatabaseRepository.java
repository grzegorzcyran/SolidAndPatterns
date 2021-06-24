package edu.grcy.solid.dip.fix;

public class DatabaseRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Saving to DB " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Removing from DB " + task);
    }
}
