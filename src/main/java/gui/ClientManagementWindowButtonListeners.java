package gui;

/**
 * Class responsible for button action listeners.
 */
public class ClientManagementWindowButtonListeners {

    /**
     * Method creating listener from static context.
     */
    public void createButtonListeners() {
        ClientManagementWindowMenuPane.moneyIncomeRegistration.addActionListener(e -> System.out.println("Example"));
        ClientManagementWindowMenuPane.moneyExpenseRegistration.addActionListener(e -> System.out.println("Example"));
        ClientManagementWindowMenuPane.moneyTransactions.addActionListener(e -> System.out.println("Example"));
        ClientManagementWindowMenuPane.moneyBalanceCalculation.addActionListener(e -> System.out.println("Example"));
        ClientManagementWindowMenuPane.saveDataAndExit.addActionListener(e -> System.out.println("Example"));
    }
}
