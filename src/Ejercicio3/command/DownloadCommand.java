package Ejercicio3.command;
import Ejercicio3.model.Media;

public class DownloadCommand implements Command {
    private Media media;

    public DownloadCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        System.out.println("Descargando: " + media.getName());
        // Aquí agregaría la lógica real de descarga
    }
}