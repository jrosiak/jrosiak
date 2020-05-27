package TUT_11_4;

import java.util.Scanner;

public class NegativeNumberException{

    Scanner input = new Scanner(System.in);
    public NegativeNumberException(){ }

    int i;
    int j;
    int array[] = new int[10];

    public void readNumber(){
        System.out.println("Please provide a number");

            i = input.nextInt();
            if (i < 0) {
                throw new IllegalArgumentException();
            }
    }

    public void fillArray(){
        if(i<0){
            array[1]=0;
        }else{
            System.out.println("Provide the desired index");
            j=input.nextInt();
            //This part makes the output more user friendly, so that index equals the position in the output
            //e.g. 4th index is the 4th number in the output not 5th as it would be in the normal array where the first index is 0

            if(j<1){
                throw new IllegalArgumentException("Index cannot be lass that 1!!!");
            }
            array[j-1]=i;
        }
        for(int i=0; i<10; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

}
