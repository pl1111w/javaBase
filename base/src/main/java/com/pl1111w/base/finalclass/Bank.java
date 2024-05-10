package finalclass;

/**
 * @title: pl1111w
 * @description: jdk 1.5之前定义枚举
 * @author: Kris
 * @date 2021/11/13 22:08
 */
public class Bank {

    private final String bankName;
    private final String bankCountry;

    private Bank(String bankName, String bankCountry) {
        this.bankCountry = bankCountry;
        this.bankName = bankName;
    }
    private static final Bank ICBC = new Bank("ICBC","CHN");
    private static final Bank HSBC = new Bank("HSBC","US");
    private static final Bank CITI = new Bank("CITI","USA");

    public String getBankName() {
        return bankName;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public static void main(String[] args) {
        Bank bank = Bank.CITI;
        System.out.println(bank.getBankCountry());
    }


}
