package Ejercicio4;
import Ejercicio4.model.MediaModel;
import Ejercicio4.view.MediaView;
import Ejercicio4.controller.MediaController;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MediaModel model = new MediaModel();
            MediaView view = new MediaView();
            new MediaController(model, view);
        });
    }
}
