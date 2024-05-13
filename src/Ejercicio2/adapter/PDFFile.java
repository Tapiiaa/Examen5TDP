package Ejercicio2.adapter;
public class PDFFile implements AdvancedMediaFile {
    private String filename;

    public PDFFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void playFile() {
        System.out.println("Displaying PDF: " + filename);
    }
}