import java.io.*;
import java.util.*;

public class LoginHandler {

    private static final String USER_FILE = "data/users.txt";

    public static User authenticate(String username, String password) {
        List<String> users = FileManager.readAllLines(USER_FILE);
        for (String u : users) {
            String[] parts = u.split(",");
            if (parts.length == 3) {
                String user = parts[0];
                String pass = parts[1];
                String role = parts[2];

                if (user.equals(username) && pass.equals(password)) {
                    if (role.equalsIgnoreCase("Manager")) {
                        return new Manager(username, password);
                    } else if (role.equalsIgnoreCase("Cashier")) {
                        return new Cashier(username, password);
                    }
                }
            }
        }
        return null;
    }

    public static void initializeDefaultUsers() {
        File file = new File(USER_FILE);
        if (!file.exists() || FileManager.readAllLines(USER_FILE).isEmpty()) {
            FileManager.appendLine(USER_FILE, "admin,admin123,Manager");
            FileManager.appendLine(USER_FILE, "cashier1,pass123,Cashier");
        }
    }
}
