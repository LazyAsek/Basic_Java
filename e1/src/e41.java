import java.util.Scanner;

public class e41 {
    public static boolean issumoftwopowers(int n){
        int Lnum=(int)Math.sqrt(n);
        int Rnum=0;
        
        while(Lnum>=Rnum){
            if(Lnum*Lnum + Rnum*Rnum==n){
                return true;
            }
            if(Lnum*Lnum + Rnum*Rnum<n){
                Rnum++;
            }
            if(Lnum*Lnum + Rnum*Rnum>n){
                Lnum--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("give num");
        System.out.println(issumoftwopowers(s.nextInt()));
        s.close();
    }
}
