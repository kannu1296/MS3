package generics.wildcard;

public class ComputeAverageTest {
    public static void main(String[] args) {
        ComputeAverage<Integer> computeAverageInt = new ComputeAverage<>(new Integer[]{1,2,3});
        ComputeAverage<Float> computeAverageFloat = new ComputeAverage<>(new Float[]{1.0f,2.0f,3.0f});
        ComputeAverage<Double> computeAverageDouble = new ComputeAverage<>(new Double[]{1.0,2.0,3.0});

        System.out.println(computeAverageInt.average());
        System.out.println(computeAverageFloat.average());
        System.out.println(computeAverageDouble.average());

        System.out.println(computeAverageInt.compareAverage(computeAverageDouble));     //Comparision is possible due to wildcard
    }
}
