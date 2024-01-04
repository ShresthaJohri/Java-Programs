import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int N = sc.nextInt();
        for(int i=1; i<=10; i++)  //if you want your table till any no write i<=n
        {
         System.out.println(N + "*" +i+ "=" + N*i );
        }
        sc.close();
    }
}
