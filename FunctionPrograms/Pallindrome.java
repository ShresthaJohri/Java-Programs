package FunctionPrograms;
// CHECKING IF A NO. IS PALLINDROME OR NOT
import java.util.Scanner;

public class Pallindrome {
    public static boolean isPallindrome(int num) {
        int pall = num;
        int rev = 0;
        while(pall != 0)
        {
         int ld = pall%10;
         rev = (rev*10)+ld;
         pall = pall/10;
        }
        if (num == rev)
        {
            return true;
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPallindrome(n))
        {
         System.out.println("Number " + n + " is a Pallindrome");
        }
        else
        {
            System.out.println("Number " + n + " is not a Pallindrome");
        }
        sc.close();
    }
}
