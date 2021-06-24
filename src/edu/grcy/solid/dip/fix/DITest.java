package edu.grcy.solid.dip.fix;

public class DITest {
    public static void main(String[] args) {

        Repository repository1 = new FileRepository();
        TaskService service = new TaskService(repository1);

        service.addTask("Cos");
        service.removeTask("Cos innego");

        //=======================

        System.out.println("Klient miał FileRepository a teraz zmienia zdanie");

        service.setRepository(new DatabaseRepository());
        service.addTask("Znowu cos");
    }
}
