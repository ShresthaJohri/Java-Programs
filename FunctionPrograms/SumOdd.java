package FunctionPrograms;
//import java.util.*;
public class SumOdd {
    public static int getSum(int n) {
        int sum =0;
        for(int i=1;i<=n;i++)
        {
          if(i%2 != 0)
          {
          sum += i;
        }
        
    }
    return sum;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int total = getSum(5);//function call
        System.out.println("Sum of odd numbers is :" +total);
        //sc.close();

    }
    
}
