package org.romanbielyi;

public class StrangeMoney {
    private long bills;
    private byte coins;

    public StrangeMoney(double d) {
        bills = getBills(d);
        coins = getCoins(d);
    }

    private long getBills(double d) {
        String stringedMoney = String.valueOf(d);
        return Long.parseLong(stringedMoney.split("\\.")[0]);
    }

    private byte getCoins(double d) {
        String stringedMoney = String.valueOf(d);
        return Byte.parseByte(stringedMoney.split("\\.")[1]);
    }

    public void printPrettyMoney() {
        System.out.printf("Your money are: %s,%d UAH\n", bills, coins);
    }

    public long getSum() {
        return bills + coins;
    }

    public long getDiff() {
        return bills - coins;
    }

    public double getFraction() {
        return (double) (bills / coins);
    }

    public double getFractionBy(double d) {
        return getSum() / d;
    }

    public double getProductBy(double d) {
        return getSum() * d;
    }

    public boolean areBillsGreaterThanCoins() {
        return bills > coins;
    }

    public boolean areCoinsGreaterThanBills() {
        return coins > bills;
    }

    public boolean areTheyEqual() {
        return coins == bills;
    }


}
