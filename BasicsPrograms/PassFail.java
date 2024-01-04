import java.util.*;
// STUDENT IS PASS OR FAIL USING TERNARY OPERATOR
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();
        String ans = (marks>=33)?"Pass":"Fail";
        System.out.println(ans);
        sc.close();
    }
}
