package io.github.febialfarabi.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NumberUtil {

    public static final String moneyFormat(BigDecimal bigDecimal, boolean symbol){
        DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.00");
        try {
            return (symbol?"Rp ":"")+decimalFormat.format(bigDecimal);
        }catch (Exception e){
            e.printStackTrace();
            return (symbol?"Rp ":"")+"0";
        }
    }

    public static final BigDecimal currencyRoundUp(BigDecimal amount, BigDecimal roundingPrice){
        amount = amount.setScale(0, RoundingMode.HALF_UP);
        amount = amount.divide(roundingPrice);
        amount = amount.setScale(0, RoundingMode.HALF_UP);
        amount = amount.subtract(roundingPrice);
        return amount ;
    }

    public static final BigDecimal amountOfPercent(BigDecimal amount, Double percent){
        BigDecimal amountOfPercent = amount.multiply(BigDecimal.valueOf(percent)).divide(BigDecimal.valueOf(100));
        return amountOfPercent;

    }



}
