package generics.methods;

/**
 * Class to represent example of generic method
 */
public class ArraySearch {
    /**
     * T, V are type parameters. T extends comparable<T> because T
     * must be comparable. V extends T, because the elements of array V must be
     * campatible with T. the V will only allow T and subtype of T
     */
    public static  <T extends Comparable<T>, V extends T> boolean isIn(T element, V[] array){
        for(T value: array){
            if(value.equals(element))
                return true;
        }
        return false;
    }
}
