import java.util.*;
//PRINT NUMBERS FROM 1 TO N
public class Oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        int num = 1;
        while(num<= N)
        {
            System.out.print(num + " ");  //For printing in 1 line
            //System.out.println(num);   For printing in next line
            num++;
        }
        sc.close();
    }
}
