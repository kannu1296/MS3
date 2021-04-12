package read.write;

import java.util.List;

public interface ShoppingCart {
    public List<String> getProduct();
    public void addProduct(String product);
}
