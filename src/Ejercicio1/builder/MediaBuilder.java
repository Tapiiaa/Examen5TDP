package Ejercicio1.builder;


public interface MediaBuilder {
    void addBook();
    void addMagazine();
    void addNewspaper();
    MediaBundle build();
}