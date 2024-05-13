package Ejercicio2.adapter;

public class MP4File implements AdvancedMediaFile {
    private String filename;

    public MP4File(String filename) {
        this.filename = filename;
    }

    @Override
    public void playFile() {
        System.out.println("Playing MP4 file: " + filename);
    }
}
