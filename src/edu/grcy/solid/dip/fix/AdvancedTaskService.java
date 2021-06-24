package edu.grcy.solid.dip.fix;

public class AdvancedTaskService extends TaskService {

    String reason;
    //dziedziczenie - obiekt klasy AdvancedTaskService
    //dziedziczy po TaskService - ma swoje pola i metody i
    //pola i metody klasy TaskService
    public AdvancedTaskService(Repository repository) {
        super(repository);
    }

    public void extraAction() {
        System.out.println("Some extra action");
    }

    @Override
    public void setRepository(Repository repository) {
        System.out.println("Nadpisana definicja settera");
        super.setRepository(repository);
    }
}
