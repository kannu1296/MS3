package generics.upperbounded;

/**
 * class to store coordinates of 3D-shape
 */
public class ThreeDimension extends TwoDimension {
    private int cord3;

    public int getCord3() {
        return cord3;
    }

    public ThreeDimension(int cord1, int cord2, int cord3) {
        super(cord1, cord2);
        this.cord3 = cord3;
    }
}
