package Ejercicio2;
import Ejercicio2.composite.MediaComponent;
import Ejercicio2.composite.MediaLeaf;
import Ejercicio2.composite.MediaComposite;
import Ejercicio2.adapter.MediaFormatAdapter;
import Ejercicio2.adapter.MP4File;
import Ejercicio2.adapter.PDFFile;
import Ejercicio2.observer.MediaLibrary;
import Ejercicio2.observer.User;

public class MainEjercicio2 {
    public static void main(String[] args) {
        // Uso del Composite
        MediaComponent book = new MediaLeaf("1984 by George Orwell");
        MediaComponent magazine = new MediaLeaf("Time Magazine Issue #102");
        MediaComponent newspaper = new MediaLeaf("New York Times");

        MediaComposite library = new MediaComposite();
        library.add(book);
        library.add(magazine);
        library.add(newspaper);
        System.out.println("Mostrando todos los medios de la biblioteca:");
        library.display();

        // Uso del Adapter
        MP4File mp4 = new MP4File("video.mp4");
        PDFFile pdf = new PDFFile("file.pdf");
        MediaFormatAdapter mp4Adapter = new MediaFormatAdapter(mp4);
        MediaFormatAdapter pdfAdapter = new MediaFormatAdapter(pdf);

        library.add(mp4Adapter);
        library.add(pdfAdapter);
        System.out.println("Mostrando todos los medios incluyendo archivos adaptados:");
        library.display();

        // Uso del Observer
        MediaLibrary mediaLibrary = new MediaLibrary();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        mediaLibrary.attach(user1);
        mediaLibrary.attach(user2);

        mediaLibrary.setState("Nueva revista añadida");
        mediaLibrary.setState("Nuevo libro disponible");
    }
}
