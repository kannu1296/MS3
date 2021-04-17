package generics.methods;

public class GenericMethodTest {
    public static void main(String[] args) {
        boolean result = ArraySearch.isIn(2, new Integer[]{1,2,3});
        System.out.println(result);
        result = ArraySearch.isIn("One", new String[]{"Two", "Three"});
        System.out.println(result );
    }
}
