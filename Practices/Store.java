import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String location;
    private List<Product> productList;
    private int nbProduct;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new ArrayList<>();
    }

    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }

    public void addProduct(Product p) {
        productList.add(p);
        nbProduct++;
    }

    public boolean searchProduct(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return true;
            }
        }
        return false;

    }

    public Product deleteProduct(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                productList.remove(product);
                nbProduct--;
                return product;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Product product : productList) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity() + " - Price: " + product.getPrice());
        }
    }
}
