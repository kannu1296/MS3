package generics.bounded;

/**
 * A program to show example of bounded generics
 * @param <T>
 */
public class ComputeAverage<T extends Number> {
    private T[] list;

    public ComputeAverage(T[] list) {
        this.list = list;
    }

    public double average(){
        double  sum = 0.0;
        for(int i=0; i<list.length; i++){
            sum += list[i].doubleValue();
        }
        return sum/list.length;
    }
}
