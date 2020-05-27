package TUT_11_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NegativeNumberException e = new NegativeNumberException();
        try {
            e.readNumber();
        }catch (Exception exception){
            System.out.println("Negative numbers are not allowed");
        }
        e.fillArray();

    }
}
