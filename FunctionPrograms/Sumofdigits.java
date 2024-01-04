package FunctionPrograms;
// FINDING SUM OF DIGITS OF A NO.
import java.util.*;

public class Sumofdigits {
    public static int sumOfDigits(int  num) {
        int sum = 0;
        while(num > 0)
        {
         int ld = num%10;
         sum = sum+ld;
         num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sod = sumOfDigits(n);
        System.out.println("Sum of digits of a number is :" + sod);
        sc.close();
    }
}
