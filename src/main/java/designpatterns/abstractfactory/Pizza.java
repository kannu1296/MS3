package designpatterns.abstractfactory;

public abstract class Pizza {
    public abstract void addIngrediants();
    public void bakePizza(){
        System.out.println("Pizza is baking");
    }
}
