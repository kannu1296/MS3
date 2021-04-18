package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.BaseToppingFactory;
import designpatterns.abstractfactory.Cheese;
import designpatterns.abstractfactory.Sauce;

public class GourmetToppingFactory implements BaseToppingFactory {
    @Override
    public Cheese createCheese(){
        return new GoatCheese();
    }
    @Override
    public Sauce createSauce(){
        return new CaliforniaOilSauce();
    }
}
