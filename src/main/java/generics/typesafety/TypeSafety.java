package generics.typesafety;

/**
 * Program to show how generics is better than object
 */
public class TypeSafety {
    private Object value;

    public TypeSafety(Object value) {
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }
}
