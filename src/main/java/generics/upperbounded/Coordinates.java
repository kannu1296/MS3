package generics.upperbounded;

public class Coordinates<T extends TwoDimension> {
    private T[] points;

    public Coordinates(T[] points) {
        this.points = points;
    }

    public T[] getPoints() {
        return points;
    }
}
