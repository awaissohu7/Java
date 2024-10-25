import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Store> stores;
    private int nbStore;

    public Company(String name) {
        this.name = name;
        this.stores = new ArrayList<>();
    }

    public void addStore(Store store) {
        stores.add(store);
        nbStore++;
    }

    public int searchNbOfStore(String productName) {
        int count = 0;
        for (Store store : stores) {
            if (store.searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    public void displayAll() {
        for (Store store : stores) {
            System.out.println("Store Name: " + store.getName() + ", Location: " + store.getLocation());
            store.displayAll();
        }
    }
}
