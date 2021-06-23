package edu.grcy.solid.ocp.fixed;

public class ConsoleClientLoggerApp {
    public static void main(String[] args) {

        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaaa");
            logger.log("bbbb");
        } catch (Exception e) {
            //never ever tak nie zostawiajcie
        }
    }
}
