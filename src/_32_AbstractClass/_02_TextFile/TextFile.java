package _32_AbstractClass._02_TextFile;

public class TextFile extends TextFileBase {
    @Override
    public void read() {
        System.out.println("Reading the text file...");
    }

    @Override
    public void write() {
        System.out.println("Writing to the text file...");
    }
}
