import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product(1, "bread", 10);
        Product product2 = new Product(2, "ice-cream", 20);
        Product product3 = new Product(3, "milk", 30);
        Product product4 = new Product(4, "meat", 40);


        store.addToList(product1);
        store.addToList(product2);
        store.addToList(product3);

        store.getProductList();

/*
        store.productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
*/

        store.removeProduct(1, product1);

        store.getProductList();

        store.changeProduct(1, product4);

        store.getProductList();
    }
}
