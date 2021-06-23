package edu.grcy.solid.ocp.fixed;

public class FileClientLoggerApp {
    public static void main(String[] args) {
        /**
         * W danej wersji aplikacji będzie jedno konkretne ustawienie loggera
         * raz będzie to FileLogger, u innego klienta ConsoleLogger
         *
         * Tak naprawdę w rzeczywistych aplikacjach robi się to np.
         * plikami kofiguracyjnymi (XML, YAML, JSON)
         * odczytywanymi np. przez Springa (będzie niedługo)
         */
        MessageLogger messageLogger = new FileLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("xxxxx");
            logger.log("yyyy");
            logger.log("zzz");
        } catch (Exception e) {
            //obsługa błędów niech je obsługuje a nie "połyka" i ignoruje
            System.out.println("Exception occured");
            System.out.println(e.getStackTrace());
        }
    }
}
