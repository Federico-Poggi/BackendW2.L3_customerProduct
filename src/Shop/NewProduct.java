package Shop;

import Functional_interface.AddProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NewProduct implements AddProduct {

    @Override
    public List<Product> addproduct() {
        List<Product> prodotti=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        String product;
        long productId;
        double price;
        String category;

            System.out.println("PRODOTTO:");
            product= scan.next();
            System.out.println("PREZZO: ");
            price=scan.nextDouble();
            productId= rand.nextLong(1,1000);
            System.out.println("CATEGORAIA: ");
            category=scan.nextLine();
            Product prodotto= new Product(productId,product,price, category);
            prodotti.add(prodotto);
            return prodotti;
    }


}
