package generics.lowerbounded;

import java.util.List;

public class Elements {
    public static void processElements(List<? super Integer> list){
        for(Object element: list){
            System.out.println(element);
        }
    }
}
