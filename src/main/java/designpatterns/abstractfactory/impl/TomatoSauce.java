package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.Sauce;

public class TomatoSauce implements Sauce {
    public TomatoSauce(){
        addSauce();
    }

    @Override
    public void addSauce() {
        System.out.println("Adding Sauce");
    }
}
