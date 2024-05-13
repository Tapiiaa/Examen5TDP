package Ejercicio3.state;

import Ejercicio3.model.Media;

public class LoanedState implements MediaState {
    @Override
    public void handleRequest(Media media) {
        System.out.println(media.getName() + " está prestado. No disponible hasta su devolución.");
    }
}
