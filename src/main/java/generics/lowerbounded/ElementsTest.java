package generics.lowerbounded;

import java.util.ArrayList;
import java.util.List;

public class ElementsTest {
    public static void main(String[] args) {
        //Process Integer list
        List<Integer> elementsIntList = new ArrayList<>();
        elementsIntList.add(10);
        elementsIntList.add(20);
        Elements.processElements(elementsIntList);
        //Process number list
        List<Number> elementsLonglist = new ArrayList<>();
        elementsLonglist.add(30);
        elementsLonglist.add(40);
        Elements.processElements(elementsLonglist);
    }
}
