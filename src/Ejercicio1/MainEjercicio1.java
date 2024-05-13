package Ejercicio1;
import Ejercicio1.factory.ConcreteMediaFactory;
import Ejercicio1.factory.DigitalMedia;
import Ejercicio1.builder.StandardMediaBundleBuilder;
import Ejercicio1.builder.MediaBundle;
import Ejercicio1.strategy.SearchContext;
import Ejercicio1.strategy.SimpleSearch;
import Ejercicio1.strategy.AdvancedSearch;

public class MainEjercicio1 {
    public static void main(String[] args) {
        // Uso del Factory Method
        ConcreteMediaFactory mediaFactory = new ConcreteMediaFactory();
        DigitalMedia book = mediaFactory.createMedia("book");
        DigitalMedia magazine = mediaFactory.createMedia("magazine");
        DigitalMedia newspaper = mediaFactory.createMedia("newspaper");

        book.display();
        magazine.display();
        newspaper.display();

        // Uso del Builder
        StandardMediaBundleBuilder bundleBuilder = new StandardMediaBundleBuilder();
        bundleBuilder.addBook();
        bundleBuilder.addMagazine();
        bundleBuilder.addNewspaper();
        MediaBundle bundle = bundleBuilder.build();
        System.out.println("Mostrando los elementos del paquete de medios:");
        bundle.showItems();

        // Uso del Strategy
        SearchContext context = new SearchContext(new SimpleSearch());
        context.executeSearch("Historia");
        context.setStrategy(new AdvancedSearch());
        context.executeSearch("Tecnología");
    }
}
