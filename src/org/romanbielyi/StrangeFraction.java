package org.romanbielyi;

public class StrangeFraction {
    private long integerPart;
    private short fractionPart;

    public StrangeFraction(double d) {
        integerPart = getIntegerPart(d);
        fractionPart = getFractionPart(d);
    }

    private long getIntegerPart(double d) {
        String tempString = String.valueOf(d);
        return Long.parseLong(tempString.split("\\.")[0]);
    }

    private short getFractionPart(double d) {
        String tempString = String.valueOf(d);
        return Short.parseShort(tempString.split("\\.")[1]);
    }

    public long getIntegerPart() {
        return integerPart;
    }

    public short getFractionPart() {
        return fractionPart;
    }

    public long getSumOfParts() {
        return integerPart + fractionPart;
    }

    public long getDiffOfParts() {
        return integerPart - fractionPart;
    }

    public long getProductOfParts() {
        return integerPart * fractionPart;
    }

    public boolean isIntegerPartBigger() {
        return integerPart > fractionPart;
    }

    public boolean isFractionPartBigger() {
        return fractionPart > integerPart;
    }

    public boolean arePartsEqual() {
        return fractionPart == integerPart;
    }
}
