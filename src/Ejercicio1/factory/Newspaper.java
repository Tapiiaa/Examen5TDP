package Ejercicio1.factory;

public class Newspaper implements DigitalMedia {
    @Override
    public void display() {
        System.out.println("Mostrando un periódico.");
    }
}