package designpatterns.facade.controller;


import designpatterns.facade.entity.Product;
import designpatterns.facade.service.FacadeService;

public class OrderFullfilmentController {
    private FacadeService facadeService;

    public OrderFullfilmentController(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    public boolean orderProduct(Product product){
        boolean orderfulfilled = facadeService.placeOrder(product);
        return orderfulfilled;
    }
}
