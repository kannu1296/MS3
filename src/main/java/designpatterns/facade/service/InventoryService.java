package designpatterns.facade.service;


import designpatterns.facade.entity.Product;

public class InventoryService {
    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
        return true;
    }
}
