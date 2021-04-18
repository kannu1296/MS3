package designpatterns.abstractfactory;

public class CheesePizza extends Pizza {
    private BaseToppingFactory baseToppingFactory;

    public CheesePizza(BaseToppingFactory baseToppingFactory) {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngrediants() {
        System.out.println("Preparing ingredients for Cheese Pizza");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}
