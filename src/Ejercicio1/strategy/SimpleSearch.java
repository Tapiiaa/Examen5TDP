package Ejercicio1.strategy;
public class SimpleSearch implements SearchStrategy {
    @Override
    public void search(String query) {
        System.out.println("Búsqueda simple para: " + query);
    }
}