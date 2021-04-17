package generics.upperbounded;

/**
 * class to store coordinates of 2D-shape
 */
public class TwoDimension {
    private int cord1;
    private int cord2;

    public TwoDimension(int cord1, int cord2) {
        this.cord1 = cord1;
        this.cord2 = cord2;
    }

    public int getCord1() {
        return cord1;
    }

    public int getCord2() {
        return cord2;
    }
}
