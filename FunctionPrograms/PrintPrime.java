package FunctionPrograms;
// PRINTING ALL THE PRIME NO.IN RANGE
public class PrintPrime {
    public static boolean checkprime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
            return false;
            }
        }
    return true;
    }
    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++)
        {
            if(checkprime(i))
            {
                System.out.print(i+ " ");
            }
        }
         System.out.println();
    }
    public static void main(String[] args) {
        primeInRange(20);
    }
}
