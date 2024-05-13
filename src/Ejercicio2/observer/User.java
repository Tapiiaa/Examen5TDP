package Ejercicio2.observer;
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " notified.");
    }
}