package finalclass;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @title: pl1111w
 * @description: jdk 1.5之后定义枚举
 * @author: Kris
 * @date 2021/11/13 22:08
 */
public enum BankEnum {

    ICBC("ICBC", "CHN"),
    HSBC("HSBC", "US"),
    CITI("CITI", "USA");

    private final String bankName;
    private final String bankCountry;

    BankEnum(String bankName, String bankCountry) {
        this.bankName = bankName;
        this.bankCountry = bankCountry;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public static void main(String[] args) {
        System.out.println(BankEnum.CITI);
        System.out.println("===valueOf==");
        BankEnum bank = BankEnum.valueOf("HSBC");
        System.out.println(bank);
        System.out.println("===values==");
        BankEnum[] banks = BankEnum.values();
        for (BankEnum bankEnum : banks) {
            System.out.println(bankEnum);
        }
    }
}
