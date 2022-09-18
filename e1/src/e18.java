import java.util.Scanner;

public class e18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give first num");
        int a=s.nextInt();
        System.out.println("give second num");
        int b=s.nextInt();
        s.close();
        int num =a;
        for(int i=0;i<b-1;i++){
            a +=num;
        }
        System.out.println(a);
    }
}
