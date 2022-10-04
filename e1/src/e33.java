import java.util.Scanner;

public class e33 {
    public static int toarr(int num){
        int len = (int)(Math.log10(num)+1);
        int[]arr= new int[2];
        int numm=0;
        arr[0]=len;
        arr[1]=num-len*10;
        for(int i=0;i<arr.length;i++){
            numm+= arr[i];
        }
        return numm;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();
        System.out.println(toarr(num));
        s.close();
    }
}
