package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to show composite design pattern.
 * Here Product and catalogue are Composed together
 * to form a single catalogue
 */
public class ProductCatalogue extends Catalogue {
    private List<Catalogue> items = new ArrayList<>();
    private String name;

    public ProductCatalogue(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Catalogue catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(Catalogue catalogComponent) {
        if(!items.isEmpty())
            items.remove(catalogComponent);
    }

    @Override
    public void print() {
        for(Catalogue catalogue: items)
            catalogue.print();

    }
}
