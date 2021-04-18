package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.BaseToppingFactory;
import designpatterns.abstractfactory.Cheese;
import designpatterns.abstractfactory.Sauce;

class SicillianToppingFactory implements BaseToppingFactory {
    @Override
    public Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public Sauce createSauce(){return new TomatoSauce();}
}
