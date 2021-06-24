package edu.grcy.solid.isp.fix;

import java.util.Collection;
//@FunctionalInterface
public interface ReadableLogger extends Logger {

    Collection<String> readMessages();

    /**
     * Na ReadableLogger nie możemy nałożyć anotacji @FunctionalInterface
     * bo ReadableLogger rozszerza interfejs Logger więc ma własną metodę
     * abstrakcyjną i tą drugą "odziedziczoną" po Logger
     */
}
