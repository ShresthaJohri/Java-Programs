import java.util.Scanner;
// TOTAL BILL OF ITEMS AND AFTER ADDING TAX 
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        System.out.println("Total bill is :"+bill);
      // After adding 18% tax
        float Total = bill + (0.18f * bill);
        System.out.println("Total bill with 18% tax is :"+Total);
        sc.close();

    }
}
