package gui;

import javax.swing.*;

/**
 * Class for creating GUI window.
 */
public class ClientManagementWindow {

    /**
     * Creating JFrame for Client management window.
     */
    public ClientManagementWindow() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Client Management System");
            frame.add(new ClientManagementWindowMenuPane());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

