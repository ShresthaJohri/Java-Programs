import java.util.*;
//CHECKING WHETHER NO. IS +VE OR -VE
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
    if (n >= 0)
    {
        System.out.println("The number is Positive!");
    }
    else
    {
        System.out.println("The number is Negative!");
    }
         sc.close();
    }
}
