package read.write;

import java.util.List;

/**
 * A shopping cart used to implement ReadWrite lock
 * We can read multiple products at the same time, but we
 * write one product at a time
 */
public class ShoppingCartImpl implements ShoppingCart {

    private List<String> wishList;

    public ShoppingCartImpl(List<String> wishList) {
        this.wishList = wishList;
    }

    @Override
    public List<String> getProduct(){
        if(!wishList.isEmpty())
            return wishList;
        return null;
    }

    @Override
    public void addProduct(String product){
        wishList.add(product);
    }
}
