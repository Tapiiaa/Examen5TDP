package Ejercicio4.composite;
public class MediaLeaf implements MediaComponent {
    private String name;

    public MediaLeaf(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(MediaComponent books) {

    }
}