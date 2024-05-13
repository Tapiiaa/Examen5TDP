package Ejercicio3.mediator;

import java.util.HashMap;
import java.util.Map;
import Ejercicio3.command.Command;

public class ConcreteMediator implements Mediator {
    private Map<String, Command> components = new HashMap<>();

    @Override
    public void registerComponent(String name, Command command) {
        components.put(name, command);
    }

    @Override
    public void executeCommand(String name) {
        if (components.containsKey(name)) {
            components.get(name).execute();
        } else {
            System.out.println("Acción no reconocida: " + name);
        }
    }
}