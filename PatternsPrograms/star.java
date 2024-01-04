 import java.util.*;
 //PRINTING STAR PATTERN
 class star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in how many lines you want your pattern : ");
        int n = sc.nextInt();
         for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}