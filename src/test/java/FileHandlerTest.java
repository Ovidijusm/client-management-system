import money.management.Money;
import org.junit.Test;
import util.FileHandler;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileHandlerTest {

    private FileHandler fileHandler = new FileHandler();

    @Test
    public void registerTransactions() {
        File file = new File("C:\\Users\\D1sturbance\\Desktop\\money_transactions.txt");
        fileHandler.registerTransactions(file);
        assertEquals(6, fileHandler.moneyList.size());
        for (Money money : fileHandler.moneyList) {
            assertEquals("Money{" +
                    "moneyDeclaration='" + money.getMoneyDeclaration() + '\'' +
                    ", money=" + money.getMoney() +
                    '}', money.toString());
        }
    }
}