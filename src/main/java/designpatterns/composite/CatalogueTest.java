package designpatterns.composite;

public class CatalogueTest {
    public static void main(String[] args) {
        Catalogue maleJeans = new Product("M:32 MaleJeans", 2000.0);
        Catalogue maleTshirt = new Product("M:40 MaleTshirt", 1500);

        //Create Female catalogue
        Catalogue femaleCatalogue = new ProductCatalogue("Female Catalogue");
        Catalogue femaleJeans = new Product("M:32 FemaleJeans", 2000.0);
        Catalogue femaleTshirt = new Product("M:40 FemaleTshirt", 1500);
        femaleCatalogue.add(femaleJeans);
        femaleCatalogue.add(femaleTshirt);

        //Create Kid catalogue
        Catalogue kidCatalogue = new ProductCatalogue("Female Catalogue");
        Catalogue kidJeans = new Product("M:32 KidJeans", 2000.0);
        Catalogue kidTshirt = new Product("M:40 KidTshirt", 1500);
        femaleCatalogue.add(kidJeans);
        femaleCatalogue.add(kidTshirt);

        //Create combined catalogue
        Catalogue mainCatalogue = new ProductCatalogue("Main Catalogue");
        mainCatalogue.add(maleJeans);
        mainCatalogue.add(maleTshirt);
        mainCatalogue.add(femaleCatalogue);
        mainCatalogue.add(kidCatalogue);

        //Print Catalogue
        mainCatalogue.print();
    }
}
