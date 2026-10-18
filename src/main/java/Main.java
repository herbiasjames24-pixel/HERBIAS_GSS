import dao.DatabaseConnection;
import ui.MainMenu;

/**
 * Gasoline Station Management System
 * App entry point: prepares the database, then opens the main menu.
 */
public class Main {
    public static void main(String[] args) {
        DatabaseConnection.initialize();
        new MainMenu().show();
    }
}
