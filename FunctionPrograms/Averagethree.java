package FunctionPrograms;
//FIND AVERAGE OF THREE NUMBERS
import java.util.*;
public class Averagethree {
    public static double average(double a, double b, double c) {
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        System.out.println(average(a, b, c));
        sc.close();
    }
}
