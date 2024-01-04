import java.util.*;
//PRINTING SUM OF N NATURAL NO.S
public class Sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;
        
        while (i<=N)
        {
            sum = sum + i;    //OR  //sum+= i;
            i++;
        }
        System.out.println("Sum of N no.s is : " +sum);
        sc.close();
    }
}