package Ejercicio3.command;
import Ejercicio3.model.Media;

public class FavoriteCommand implements Command {
    private Media media;

    public FavoriteCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        System.out.println("Marcando como favorito: " + media.getName());
        // Aquí agregaría la lógica real para marcar el medio como favorito
    }
}