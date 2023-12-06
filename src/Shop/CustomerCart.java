package Shop;

import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.List;

class CustomerCart extends Product {
    ArrayList<Product> cart;

    public CustomerCart(long id, String prodotto, double price, String categoria) {
        super(id,prodotto,price,categoria);
        this.cart= new ArrayList<>();
    }

    public ArrayList<Product> getCart() {
        return cart;
    }
}
