package Ejercicio4.controller;



import Ejercicio4.model.MediaModel;
import Ejercicio4.view.MediaView;

public class MediaController {
    private MediaModel model;
    private MediaView view;

    public MediaController(MediaModel model, MediaView view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        view.setMediaTree(model.getAllMedia());
        view.show();
    }
}

