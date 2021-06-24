package edu.grcy.solid.dip.fix;

public class FileRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Saving task for file " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Removing task for file " + task);
    }
}
