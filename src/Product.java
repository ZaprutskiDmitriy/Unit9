public class Product {
    public int id;
    public String name;
    public int price;

    public Product(){
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
