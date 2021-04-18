package designpatterns.facade.entity;

public class Product {
    private String name;
    private String productId;

    public Product(String name, String productId) {
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }
}
