public class Cashier extends User {

    public Cashier(String username, String password) {
        super(username, password, "Cashier");
    }

    public void recordSale(String itemName, int qty, double price) {
        String line = username + "," + itemName + "," + qty + "," + price;
        FileManager.appendLine("data/sales.txt", line);
    }
}
