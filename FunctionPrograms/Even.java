package FunctionPrograms;
// CHECKING NO. IS EVEN OR NOT USING FUNCTION
import java.util.*;
public class Even {
    public static boolean isEven(int num) {
        if(num %2 == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isEven(n))
        {
            System.out.println("Number is EVEN");
        }
        else
        {
            System.out.println("Number is ODD");
        }
        sc.close();
    }
}
