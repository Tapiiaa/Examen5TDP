package Ejercicio1.factory;

public class ConcreteMediaFactory extends MediaFactory {
    @Override
    public DigitalMedia createMedia(String type) {
        switch (type) {
            case "book":
                return new Book();
            case "magazine":
                return new Magazine();
            case "newspaper":
                return new Newspaper();
            default:
                throw new IllegalArgumentException("Unknown media type");
        }
    }
}