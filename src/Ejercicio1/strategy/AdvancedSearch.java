package Ejercicio1.strategy;
public class AdvancedSearch implements SearchStrategy {
    @Override
    public void search(String query) {
        System.out.println("Búsqueda avanzada para: " + query);
    }
}