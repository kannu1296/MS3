package designpatterns.abstractfactory.impl;

import designpatterns.abstractfactory.Sauce;

public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce(){
        addSauce();
    }

    @Override
    public void addSauce() {
        System.out.println("Adding California Oil Sauce");
    }
}
