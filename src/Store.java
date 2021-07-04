
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {

    public List<Product> productList = new ArrayList<>();

    public void addToList(Product product) {
        int count = 0;
        if (productList.size() == 0) {
            productList.add(product);
        } else {
            for (Product productFromList : productList) {
                if (product.id == productFromList.id) {
                    count++;
                }
            }
            if (count == 0) {
                productList.add(product);
            }
        }
    }

    public List getProductList() {
        return productList;
    }

    public void removeProduct(int id) {
        for (Product productFromList : productList) {
            if (id == productFromList.id) {
                productList.remove(productFromList);
                break;
            }
        }
    }

    public void changeProduct(Product product) {
        for (Product productFromList : productList) {
            if (product.id == productFromList.id) {
                productList.set(productList.indexOf(productFromList), product);
                break;
            }
        }
    }
}

