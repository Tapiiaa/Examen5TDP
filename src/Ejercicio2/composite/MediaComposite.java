package Ejercicio2.composite;

import java.util.ArrayList;
import java.util.List;

public class MediaComposite implements MediaComponent {
    private List<MediaComponent> children = new ArrayList<>();

    public void add(MediaComponent component) {
        children.add(component);
    }

    public void remove(MediaComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        for (MediaComponent component : children) {
            component.display();
        }
    }
}