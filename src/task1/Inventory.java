package task1;

public class Inventory {
    public static void main(String[] args) {


    try {
        InventoryMap inventory = new InventoryMap();
        inventory.addProduct("Apples", 50);
        inventory.addProduct("Oranges", 30);
//        inventory.addProduct("Apples", 20);

        inventory.displayInventory();

        inventory.removeProduct("Oranges");
        inventory.removeProduct("Bananas");

    } catch (InventoryExceprion e) {
        System.out.println(e.getMessage());
    }
    }
}

