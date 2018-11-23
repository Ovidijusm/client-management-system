package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Class responsible for Menu panel in GUI window.
 */
class ClientManagementWindowMenuPane extends JPanel {

    /**
     * Static JButton instance.
     */
    static JButton moneyChooseFile = new JButton("Choose file");

    /**
     * Static JButton instance.
     */
    static JButton moneyIncomeRegistration = new JButton("Money transactions registration");

    /**
     * Static JButton instance.
     */
    static JButton moneyTransactions = new JButton("Money transactions");

    /**
     * Static JButton instance.
     */
    static JButton moneyBalanceCalculation = new JButton("Money balance calculation");

    /**
     * Static JButton instance.
     */
    static JButton saveDataAndExit = new JButton("Save data and exit");

    static JPanel jPanel = new JPanel(new GridBagLayout());

    /**
     * Method creating Menu pane.
     */
    ClientManagementWindowMenuPane() {
        GridBagConstraints gbc = new GridBagConstraints();




        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>Client management system</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        jPanel.add(moneyChooseFile, gbc);
        jPanel.add(moneyIncomeRegistration, gbc);
        jPanel.add(moneyTransactions, gbc);
        jPanel.add(moneyBalanceCalculation, gbc);
        jPanel.add(saveDataAndExit, gbc);

        gbc.weighty = 1;
        add(jPanel, gbc);
    }
}
