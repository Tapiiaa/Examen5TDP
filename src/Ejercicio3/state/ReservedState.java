package Ejercicio3.state;
import Ejercicio3.model.Media;

public class ReservedState implements MediaState {
    @Override
    public void handleRequest(Media media) {
        System.out.println(media.getName() + " está reservado. No disponible para nuevos préstamos.");
    }
}
