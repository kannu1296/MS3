package designpatterns.factory;

public abstract class Pizza {
    public abstract void addIngrediants();
    public void bakePizza(){
        System.out.println("Pizza is baking");
    }
}
