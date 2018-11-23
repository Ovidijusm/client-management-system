package gui;

import money.management.Money;
import util.FileHandler;

import javax.swing.*;
import java.io.File;

/**
 * Class responsible for button action listeners.
 */
public class ClientManagementWindowButtonListeners {


    private final JFileChooser jFileChooser = new JFileChooser();

    private File selectedFile = null;

    private FileHandler fileHandler = new FileHandler();


    /**
     * Method creating listener from static context.
     */
    public void createButtonListeners() {
        ClientManagementWindowMenuPane.moneyChooseFile.addActionListener(e ->
                openShowDialog()
        );

        ClientManagementWindowMenuPane.moneyIncomeRegistration.addActionListener(e -> fileHandler.registerTransactions(selectedFile));
        ClientManagementWindowMenuPane.moneyTransactions.addActionListener(e -> printTransactions());
        ClientManagementWindowMenuPane.moneyBalanceCalculation.addActionListener(e -> printBalance());
        ClientManagementWindowMenuPane.saveDataAndExit.addActionListener(e -> System.exit(0));
    }

    private void openShowDialog() {
        jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = jFileChooser.showOpenDialog(ClientManagementWindowMenuPane.jPanel);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = jFileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }

    private void printTransactions() {
        display();
    }


    private void printBalance() {
        float tempMoney = 0f;
        for (Money money : fileHandler.moneyList) {
            System.out.println(tempMoney += money.getMoney());
        }
        JOptionPane.showMessageDialog(null, tempMoney);
    }

    private void display() {
        JFrame f = new JFrame("Money transactions");
        f.add(new JList<>(fileHandler.moneyList.toArray()));
        f.pack();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
