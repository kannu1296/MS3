package generics.upperbounded;

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        FourDimension[] points = {
                new FourDimension(1,2,3,4),
                new FourDimension(5,6,7,8),
                new FourDimension(9,10,11,12)
        };
        Coordinates<FourDimension> coordinates = new Coordinates<>(points);
        BoundedWildcard boundedWildcard = new BoundedWildcard();
        boundedWildcard.showTwoDimension(coordinates);      //Passing 4D coordinates to print just 2 coordinates
        boundedWildcard.showThreeDimension(coordinates);    //Passing 4D coordinates to print just 3 coordinates
        boundedWildcard.showFourDimension(coordinates);     //Passing 4D coordinates to print just 4 coordinates
    }
}
