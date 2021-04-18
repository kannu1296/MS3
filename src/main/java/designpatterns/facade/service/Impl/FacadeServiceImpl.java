package designpatterns.facade.service.Impl;

import designpatterns.facade.entity.Product;
import designpatterns.facade.service.FacadeService;
import designpatterns.facade.service.InventoryService;
import designpatterns.facade.service.PaymentService;
import designpatterns.facade.service.ShippingService;

public class FacadeServiceImpl implements FacadeService {
    @Override
    public boolean placeOrder(Product product) {
        if(InventoryService.isAvailable(product)){
            System.out.println("Product with name " +product.getName() +" "+ "and productId "+ product.getProductId() +" "+ "is available");
            boolean paymentStatus = PaymentService.makePayment();
            if(paymentStatus){
                System.out.println("Order is placed");
                ShippingService.shipProduct(product);
                System.out.println("Product is shipped");
                return true;
            }
            return false;
        }
        return false;
    }
}
