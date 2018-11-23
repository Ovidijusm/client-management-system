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
    static JButton moneyIncomeRegistration = new JButton("Money income registration");

    /**
     * Static JButton instance.
     */
    static JButton moneyExpenseRegistration = new JButton("Money expenses registration");

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

    /**
     * Method creating Menu pane.
     */
    ClientManagementWindowMenuPane() {
        GridBagConstraints gbc = new GridBagConstraints();


        JPanel buttons = new JPanel(new GridBagLayout());

        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>Client management system</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        buttons.add(moneyIncomeRegistration, gbc);
        buttons.add(moneyExpenseRegistration, gbc);
        buttons.add(moneyTransactions, gbc);
        buttons.add(moneyBalanceCalculation, gbc);
        buttons.add(saveDataAndExit, gbc);

        gbc.weighty = 1;
        add(buttons, gbc);
    }
}
