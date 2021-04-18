package designpatterns.abstractfactory;

/**
 * An interface to represent abstract factory pattern
 */
public interface BaseToppingFactory {
    Cheese createCheese();
    Sauce createSauce();
}
