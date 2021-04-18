package designpatterns.factory;

public class PizzaFactoryTest {
    public static void main(String[] args) {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("Cheese");
        Pizza vegiePizza = pizzaFactory.createPizza("Vegie");
    }
}
