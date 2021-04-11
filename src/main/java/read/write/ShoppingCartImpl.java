package read.write;

import java.util.List;

public class ShoppingCartImpl implements ShoppingCart {

    private List<String> wishList;

    public ShoppingCartImpl(List<String> wishList) {
        this.wishList = wishList;
    }

    @Override
    public String getProduct(){
        if(!wishList.isEmpty())
            return wishList.get(0);
        return null;
    }

    @Override
    public void addProduct(String product){
        wishList.add(product);
    }
}
