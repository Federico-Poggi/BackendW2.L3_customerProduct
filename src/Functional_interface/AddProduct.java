package Functional_interface;

import Shop.Product;

import java.util.List;

@FunctionalInterface
public interface AddProduct {
    List<Product> addproduct();

}
