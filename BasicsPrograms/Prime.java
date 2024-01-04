import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        if (N == 2)
        {
            System.out.println("The number is Prime");
        }
        else{
             boolean isPrime = true;
             for(int i = 2; i <= Math.sqrt(N); i++)
             {
                if (N%i == 0)
                 {
                 isPrime = false;
                 }
                 
             }
             if(isPrime == true)
               {
                 System.out.println("The number is Prime");
               }
             else
               {
                System.out.println("The number is not Prime");
               }
            }
        sc.close();
        }    
        
}

