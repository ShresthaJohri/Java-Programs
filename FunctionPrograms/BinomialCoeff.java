package FunctionPrograms;

import java.util.*;

//FINDING BINOMIAL COEFFICIENT 
public class BinomialCoeff {
public static int findfactorial(int n) {
    int fact = 1;
    for(int i = 1;i <= n; i++)
    {
       fact *=i;
       
    }
    return fact;
}
    public static int bincoeff(int n, int r){
     int fact_n = findfactorial(n);
     int fact_r= findfactorial(r);
     int factnmr = findfactorial(n-r);
     int BC = fact_n/(fact_r*factnmr);
     return BC;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of n:");
     int n = sc.nextInt();
     System.out.print("Enter the value of r:");
     int r = sc.nextInt();
        System.out.println("Binomial Coefficient is : " + bincoeff(n,r));
        sc.close();
    }
}
