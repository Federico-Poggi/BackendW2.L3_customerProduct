package Shop;

public class Product {
    long idProduct;
    String nameProduct;
    String category;
    double price;

    public Product(long id, String prodotto, double price, String categoria){
        this.idProduct=id;
        this.nameProduct=prodotto;
        this.price=price;
        this.category=categoria;
    }

}
