package edu.grcy.solid.lsp.fix;

@FunctionalInterface
public interface FileWriteable {
    void write(byte[] content);

    /**
     * Interfejs funkcyjny musi mieć dokładnie jedną metodę abstrakcyjną
     *
     * Wszelkie inne metody muszą być albo default albo static albo private
     * i wszystkie one będą od razu w interfejsie mieć implementację
     */

    default void writeString(String content) {
        System.out.println("Metoda domyślna musi mieć ciało " + content);
    }
}
