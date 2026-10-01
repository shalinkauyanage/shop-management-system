public class Main {
    public static void main(String[] args) {
        // Create default folders & users
        LoginHandler.initializeDefaultUsers();

        // Show login GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}

