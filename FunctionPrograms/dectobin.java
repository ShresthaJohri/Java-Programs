package FunctionPrograms;

import java.util.*;
// CHANGING DECIMAL TO BINARY
public class dectobin {
    public static void decToBinary(int decNum) {
        int mynum = decNum;
        int pow =0;
        int biNum= 0;
        while( decNum > 0)
        {
            int rem = decNum % 2;
            biNum = biNum + (rem* (int)Math.pow(10, pow));
            pow++;

            decNum = decNum/2;
        }
        System.out.println("Binary of " + mynum + " is " +biNum);
    }
    public static void main(String[] args) {
        System.out.print("Enter the Decimal no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBinary(n);
        sc.close();

    }
}
