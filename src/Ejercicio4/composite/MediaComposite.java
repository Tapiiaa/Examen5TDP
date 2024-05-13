package Ejercicio4.composite;
import java.util.ArrayList;
import java.util.List;

public class MediaComposite implements MediaComponent {
    private List<MediaComponent> children = new ArrayList<>();
    private String name;

    public MediaComposite(String name) {
        this.name = name;
    }

    public void add(MediaComponent component) {
        children.add(component);
    }

    public void remove(MediaComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        children.forEach(MediaComponent::display);
    }

    @Override
    public String getName() {
        return name;
    }

    public MediaComponent[] getChildren() {
        return children.toArray(new MediaComponent[0]);
    }
}
