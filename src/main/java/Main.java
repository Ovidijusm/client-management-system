import gui.ClientManagementWindow;
import gui.ClientManagementWindowButtonListeners;

/**
 * Main program
 */
public class Main {

    /**
     * Main method
     * @param args params
     */
    public static void main(String[] args) {
        new ClientManagementWindow();

        ClientManagementWindowButtonListeners clientManagementWindowButtonListeners = new ClientManagementWindowButtonListeners();
        clientManagementWindowButtonListeners.createButtonListeners();
    }
}
