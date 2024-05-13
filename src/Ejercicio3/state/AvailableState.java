package Ejercicio3.state;

import Ejercicio3.model.Media;

public class AvailableState implements MediaState {
    @Override
    public void handleRequest(Media media) {
        System.out.println(media.getName() + " está disponible para préstamo o reserva.");
    }
}

