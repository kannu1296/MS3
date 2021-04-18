package designpatterns.abstractfactory;

import designpatterns.abstractfactory.impl.GourmetToppingFactory;

public class GourmetPizzaFactory implements BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
        switch (type){
            case "Cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "Vegie":
                pizza = new VegiePizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza");
        }
        pizza.addIngrediants();
        pizza.bakePizza();
        return pizza;
    }
}
