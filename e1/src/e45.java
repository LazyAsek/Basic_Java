import java.util.Scanner;

public class e45 {
    public static void main(String[] args) {
        System.out.println("give 3 num to check if it is triangle");
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a+b>c && a+c>b && c+b>a){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        s.close();
    }
}
