package io.github.febialfarabi.utility;

import java.math.BigDecimal;
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

}
