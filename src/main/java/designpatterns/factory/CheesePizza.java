package designpatterns.factory;

public class CheesePizza extends Pizza {
    @Override
    public void addIngrediants() {
        System.out.println("Preparing ingredients for Cheese Pizza");
    }
}
