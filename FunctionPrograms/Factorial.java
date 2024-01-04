package FunctionPrograms;
// FINDING FACTORIAL OF A NUMBER
public class Factorial {
    public static int findfactorial(int n) {
    int fact = 1;
    for(int i = 1;i <= n; i++)
    {
       fact *=i;
       
    }
    return fact;
    }
    public static void main(String[] args) {
         System.out.println("Factorial of the number is :" + findfactorial(5) );
        }
}

