package Ejercicio4.model;


import Ejercicio4.composite.MediaComponent;
import Ejercicio4.composite.MediaComposite;
import Ejercicio4.composite.MediaLeaf;

public class MediaModel {
    private MediaComponent allMedia;

    public MediaModel() {
        allMedia = new MediaComposite("Media Library");

        // Ejemplo de estructura
        MediaComponent books = new MediaComposite("Books");
        ((MediaComposite) books).add(new MediaLeaf("1984"));
        ((MediaComposite) books).add(new MediaLeaf("Brave New World"));

        MediaComponent magazines = new MediaComposite("Magazines");
        ((MediaComposite) magazines).add(new MediaLeaf("National Geographic"));
        ((MediaComposite) magazines).add(new MediaLeaf("Time"));

        allMedia.add(books);
        allMedia.add(magazines);
    }

    public MediaComponent getAllMedia() {
        return allMedia;
    }
}
