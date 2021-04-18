package designpatterns.abstractfactory;

public class VegiePizza extends Pizza {
    private BaseToppingFactory baseToppingFactory;

    public VegiePizza(BaseToppingFactory baseToppingFactory) {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngrediants() {
        System.out.println("Preparing ingredients for VegiePizza");
        baseToppingFactory.createSauce();
        baseToppingFactory.createCheese();
    }
}
