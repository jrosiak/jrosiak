package TUT_6;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    public int multiply (int a, int b){
        return a*b;
    }

    public int multiply (int a, int b, int c, int d){
        int e = a*b;
        int f = c*d;
        return multiply(e,f);
    }

    public double multiply (double a, double b){
        return a*b;
    }

    public BigDecimal multiply (BigDecimal a, BigDecimal b){
        return multiply(a,b);
    }

    public static int multiply(ArrayList<Integer> list){
        int x = 1;
        for(int i=0; i<list.size(); i++){
            x*=list.get(i);
        }
        return x;
    }

}


