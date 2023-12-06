package Shop;

import java.util.ArrayList;

public class Customer extends CustomerCart{
    private int customerId;
    private String name;
    int tier;

    private Customer(int id, String name, int tier, ArrayList<Product> prodotti){
        super(prodotti);
        this.customerId=getCustomerId();
        this.name=getName();
        this.tier=tier;

    }

    /*----GETTERSE PER OTTENERE DATI CLIENTE---*/

    public int getCustomerId() {
        return customerId;
    }
    public String getName(){
        return name;
    }


}
