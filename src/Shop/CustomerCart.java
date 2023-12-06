package Shop;

import java.util.ArrayList;
import java.util.List;

abstract class CustomerCart {
    ArrayList<Product> prodotti=new ArrayList<>();

    public CustomerCart(ArrayList<Product>prodotti) {
        this.prodotti=prodotti;
    }
}
