package designpatterns.facade;

import designpatterns.facade.controller.OrderFullfilmentController;
import designpatterns.facade.entity.Product;
import designpatterns.facade.service.FacadeService;
import designpatterns.facade.service.Impl.FacadeServiceImpl;

public class FacadeTest {
    public static void main(String[] args) {
        Product product = new Product("Air freshener", "1");
        FacadeService facadeService = new FacadeServiceImpl();
        OrderFullfilmentController order = new OrderFullfilmentController(facadeService);
        System.out.println(order.orderProduct(product));
    }
}
