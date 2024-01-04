import java.util.*;
//CALCULATING FACTORIAL OF A NO.
public class Factorial {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter any positive integer: ");
int N = sc.nextInt();

int fact = 1;
for(int i=1; i<=N; i++)
{
    fact*=i;
}
System.out.println("Factorial: "+ fact);
sc.close();
}
}
/*int fact = N; // To hold factorial
for(int i=N-1; i>0; i--) {
fact = fact*i;                                    //Another way 
}
System.out.println("Factorial: "+ fact);
sc.close();
*/




