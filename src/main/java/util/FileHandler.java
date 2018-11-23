package util;

import money.management.Money;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    public List<Money> moneyList = new ArrayList<>();

    public void registerTransactions(File file) {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                moneyList.add(new Money(fileReader.next(), fileReader.nextFloat()));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
