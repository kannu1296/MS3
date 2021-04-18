package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.Cheese;

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Adding Mozzarella Cheese ");
    }
}
