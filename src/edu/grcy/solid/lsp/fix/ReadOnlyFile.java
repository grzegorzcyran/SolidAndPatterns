package edu.grcy.solid.lsp.fix;

public class ReadOnlyFile implements FileReadable {

    /**
     * Nie mamy tu wywołania niepotrzebnych metod zapisu
     * Interfejs nie wymusza ich implementacji
     * więc jest bezpiecznie, nie ma "celowych" wyjątków
     * które zastępują normalne działanie metody
     */
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
