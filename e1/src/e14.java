import java.util.Scanner;

public class e14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input divided");
        int divided = s.nextInt();
        System.out.println("input divider");
        int divider = s.nextInt();
        int count=0;
        int leng=divided/divider;
        for(int i=0;i<leng;i++){
            divided= divided-divider;
            count++;
        }
        System.out.print("result "+count);
        s.close();
    }
}