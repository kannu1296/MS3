package generics.typesafety;

public class TypeSafetyTest {
    public static void main(String[] args) {
        TypeSafety typeSafety = new TypeSafety(8);      //create object with type int
        TypeSafety typeSafety1 = new TypeSafety("Value");   //create object with type String

        typeSafety = typeSafety1;
        int get = (Integer)typeSafety.getValue();   //This statement will give typecast error
    }
}
