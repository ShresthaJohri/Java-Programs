package FunctionPrograms;

import java.util.*;
// CHANGING BINARY TO DECIMAL
public class Bintodec {
    public static void binToDecimal(int binNum) {
        int mynum = binNum; // yha save kiya binNum ko jisse output m aa ske
        int decNum = 0;
        int pow =0; 
        while(binNum > 0) 
        {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + mynum + " is " +decNum);
    }
    public static void main(String[] args) {
        System.out.print("Enter the Binary no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binToDecimal(n);
        sc.close();
    }
}
