package generics.upperbounded;

/**
 * class to store coordinates of 4D-shape
 */
public class FourDimension extends ThreeDimension {
    private int cord4;

    public int getCord4() {
        return cord4;
    }

    public FourDimension(int cord1, int cord2, int cord3, int cord4) {
        super(cord1, cord2, cord3);
        this.cord4 = cord4;
    }
}
