import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {

    public List<Product> productList = new ArrayList<>();

    public void addToList(Product product){
        productList.add(product);
    }

    public void getProductList(){
        for(int i = 0; i<productList.size(); i++) {
            System.out.println(productList.get(i));
        }
        System.out.println();
    }

    public void removeProduct(int id, Product product){
        productList.remove(product);
    }

    public void changeProduct(int index, Product product){
        productList.set(index, product);
    }


}
