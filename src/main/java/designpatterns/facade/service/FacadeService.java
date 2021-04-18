package designpatterns.facade.service;

import designpatterns.facade.entity.Product;

/**
 * An interface to provide connection with subsystems
 * Client will not worry about subsytem the facade
 * will take care of it
 */
public interface FacadeService {
    boolean placeOrder(Product product);
}
