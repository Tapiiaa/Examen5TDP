package Ejercicio1.builder;

import Ejercicio1.factory.DigitalMedia;
import java.util.ArrayList;
import java.util.List;

public class MediaBundle {
    private List<DigitalMedia> items = new ArrayList<>();

    public void addItem(DigitalMedia item) {
        items.add(item);
    }

    public void showItems() {
        for (DigitalMedia item : items) {
            item.display();
        }
    }
}