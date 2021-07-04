
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {

    public List<Product> productList = new ArrayList<>();

    public void addToList(Product product) {
        if (productList.size() == 0) {
            productList.add(product);
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (!productList.contains(product)) {
                    productList.add(product);
                }
            }
        }
    }

    public List getProductList(){
        return productList;
    }

    public void removeProduct(int id, Product product){
                productList.remove(product);
    }

    public void changeProduct(int id, Product product){
        productList.set(id, product);
    }
}

