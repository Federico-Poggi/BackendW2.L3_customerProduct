package Shop;

import java.util.ArrayList;
import java.util.Random;

abstract class Customer extends CustomerCart{
    Random rand=new Random();
    private final int customerId;
    private final String name;
    int tier;
    ArrayList<Product> Cart;

    Customer(String name) {
        super();
        this.customerId =rand.nextInt(1,200);
        this.name = setName(name);
        this.tier=rand.nextInt(1,5);
        this.cart=new CustomerCart()
    }

    /*----GETTERSE PER OTTENERE DATI CLIENTE---*/

    public int getCustomerId() {
        return customerId;
    }
    public String getName(){
        return name;
    }

    public String setName(String nome){
        return name;
    }

}
