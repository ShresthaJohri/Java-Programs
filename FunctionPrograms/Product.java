package FunctionPrograms;
// PRODUCT OF 2 NO.S
import java.util.*;
public class Product {
    public static int multiply(int a ,int b) {
        int Product = a*b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("Product is :" +prod);
        sc.close();
    }
    
}
