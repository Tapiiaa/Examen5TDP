package Ejercicio2.composite;

public class MediaLeaf implements MediaComponent {
    private String title;

    public MediaLeaf(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + title);
    }
}