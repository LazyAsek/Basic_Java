import java.util.Scanner;

public class e39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a,b ="";
        System.out.println("num1");
        a=s.next();
        System.out.println("num2");
        b=s.next();
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
        s.close();
    }
}
