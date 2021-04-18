package designpatterns.abstractfactory;

import designpatterns.abstractfactory.impl.MozzarellaCheese;
import designpatterns.abstractfactory.impl.TomatoSauce;

/**
 * An interface to represent example of factory design pattern
 */
public interface BasePizzaFactory {
    public Pizza createPizza(String type);
}
