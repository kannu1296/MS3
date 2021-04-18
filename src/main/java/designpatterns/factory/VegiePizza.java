package designpatterns.factory;

public class VegiePizza extends Pizza {
    @Override
    public void addIngrediants() {
        System.out.println("Preparing ingredients for VegiePizza");
    }
}
