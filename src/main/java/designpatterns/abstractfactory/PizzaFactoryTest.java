package designpatterns.abstractfactory;

public class PizzaFactoryTest {
    public static void main(String[] args) {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("Cheese");
        Pizza vegiePizza = pizzaFactory.createPizza("Vegie");
    }
}
