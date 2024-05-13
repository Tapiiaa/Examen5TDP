package Ejercicio1.builder;


import Ejercicio1.factory.Book;
import Ejercicio1.factory.Magazine;
import Ejercicio1.factory.Newspaper;

public class StandardMediaBundleBuilder implements MediaBuilder {
    private MediaBundle bundle = new MediaBundle();

    @Override
    public void addBook() {
        bundle.addItem(new Book());
    }

    @Override
    public void addMagazine() {
        bundle.addItem(new Magazine());
    }

    @Override
    public void addNewspaper() {
        bundle.addItem(new Newspaper());
    }

    @Override
    public MediaBundle build() {
        return bundle;
    }
}