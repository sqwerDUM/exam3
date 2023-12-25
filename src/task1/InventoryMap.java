package task1;
import java.util.HashMap;
import java.util.Map;

public class InventoryMap {
    private Map<String, Integer> items;

    public InventoryMap() {
        this.items = new HashMap<>();
    }

    public void addProduct(String itemName, int quantity) throws InventoryExceprion {
        if (items.containsKey(itemName)) {
            throw new InventoryExceprion("Item '" + itemName + "' already exists in inventory.");
        }
        items.put(itemName, quantity);
    }

    public void removeProduct(String productName) throws InventoryExceprion {
        if (!items.containsKey(productName)) {
            throw new InventoryExceprion("product '" + productName + "' does not exist in inventory.");
        }
        items.remove(productName);
    }

    public boolean checkProduct(String itemName) {
        return items.containsKey(itemName);
    }


    public void displayInventory() {
        System.out.println("Inventory:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}


