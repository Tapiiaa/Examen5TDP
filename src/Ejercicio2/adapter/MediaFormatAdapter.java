package Ejercicio2.adapter;
import Ejercicio2.composite.MediaComponent;

public class MediaFormatAdapter implements MediaComponent {
    private AdvancedMediaFile media;

    public MediaFormatAdapter(AdvancedMediaFile media) {
        this.media = media;
    }

    @Override
    public void display() {
        media.playFile();
    }
}