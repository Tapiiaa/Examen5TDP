package Ejercicio3.model;


import Ejercicio3.state.MediaState;
import Ejercicio3.state.AvailableState;

public class Media {
    private String name;
    private MediaState state;

    public Media(String name) {
        this.name = name;
        this.state = new AvailableState();
    }

    public String getName() {
        return name;
    }

    public void setState(MediaState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}
