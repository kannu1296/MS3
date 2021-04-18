package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.Cheese;

public class GoatCheese implements Cheese {
    public GoatCheese(){
        addCheese();
    }
    @Override
    public void addCheese() {
        System.out.println("Adding goat cheese");
    }
}
