package Ejercicio3.command;

import Ejercicio3.model.Media;

public class ReadCommand implements Command {
    private Media media;

    public ReadCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        System.out.println("Leyendo: " + media.getName());
        // Aquí agregaría la lógica real para abrir y leer el medio
    }
}
