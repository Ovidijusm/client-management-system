package money.management;

public class Money {

    private String moneyDeclaration;
    private Float money;

    public Money(String moneyDeclaration, Float money) {
        this.moneyDeclaration = moneyDeclaration;
        this.money = money;
    }

    public Float getMoney() {
        return money;
    }

    public String getMoneyDeclaration() {
        return moneyDeclaration;
    }

    @Override
    public String toString() {
        return "Money{" +
                "moneyDeclaration='" + moneyDeclaration + '\'' +
                ", money=" + money +
                '}';
    }
}
