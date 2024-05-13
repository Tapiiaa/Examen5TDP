package Ejercicio3.mediator;
import Ejercicio3.command.Command;

public interface Mediator {
    void registerComponent(String name, Command command);
    void executeCommand(String name);
}
