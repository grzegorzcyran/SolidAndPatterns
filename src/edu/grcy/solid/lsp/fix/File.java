package edu.grcy.solid.lsp.fix;

public class File implements FileReadable, FileWriteable {
    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] content) {
        System.out.println("Write to file" + content);
    }
}
