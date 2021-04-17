package generics.upperbounded;

/**
 * A class to show upper bounded wildcard
 */
public class BoundedWildcard {
    public void showTwoDimension(Coordinates<?> points){
        for(TwoDimension twoDimension: points.getPoints()){
            System.out.println(twoDimension.getCord1() +" "+ twoDimension.getCord2());
        }
    }
    public void showThreeDimension(Coordinates<? extends ThreeDimension> points){
        for(ThreeDimension threeDimension: points.getPoints()){
            System.out.println(threeDimension.getCord1() +" "+ threeDimension.getCord2() +" "+ threeDimension.getCord3());
        }
    }
    public void showFourDimension(Coordinates<? extends FourDimension> points){
        for(FourDimension fourDimension: points.getPoints()){
            System.out.println(fourDimension.getCord1() +" "+ fourDimension.getCord2() +" "+ fourDimension.getCord3() +" "+ fourDimension.getCord4());
        }
    }
}
