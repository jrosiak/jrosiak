package TUT_6;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {

    public int add(int a, int b){
        return a+b;
    }

    public static BigDecimal add(ArrayList<BigDecimal> listBigDecimal){
        BigDecimal x = BigDecimal.valueOf(1);
        for(int i=0; i<listBigDecimal.size(); i++){
            x=x.add(listBigDecimal.get(i));
        }
        return x;
    }

}
