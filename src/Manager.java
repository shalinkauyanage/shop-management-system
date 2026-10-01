public class Manager extends User {

    public Manager(String username, String password) {
        super(username, password, "Manager");
    }

    public void addCashier(String username, String password) {
        FileManager.appendLine("data/users.txt", username + "," + password + ",Cashier");
    }

    public void addSupply(String itemName, int qty, double price) {
        FileManager.appendLine("data/supplies.txt", itemName + "," + qty + "," + price);
    }
}

