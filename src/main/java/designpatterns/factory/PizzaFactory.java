package designpatterns.factory;

public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Vegie":
                pizza = new VegiePizza();
                break;
            default:
                throw new IllegalArgumentException("No such pizza");
        }
        pizza.addIngrediants();
        pizza.bakePizza();
        return pizza;
    }
}
