import java.util.*;
public class SumOddEven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sumEven = 0;
    int sumOdd = 0;
    int N;
    int choice;
    do
    {
      System.out.println("Enter the number :");
      N = sc.nextInt();
      if(N%2 ==0){
        sumEven += N;
      }
      else
      {
        sumOdd += N;
      }
      System.out.println("want to continue? press 1 for yes and 0 for no :");
      choice = sc.nextInt();
    }
    while(choice == 1);
    System.out.println("Sum of even numbers :" +sumEven);
    System.out.println("Sum of odd numbers :" +sumOdd);
    
      sc.close();
    }
}
