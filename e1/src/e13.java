import java.util.Scanner;

public class e13{

    //to binary
    public static void countzero(int i){
        String result=Integer.toBinaryString(i);
        System.out.println(result);
        String zero="0";
        int count=0;
        for(int d=0;d<result.length();d++){
           if(zero.charAt(0)==result.charAt(d)){
            count++;
           }
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("put your number: ");
        int num =s.nextInt();
        System.out.print("binary represtation is: ");
        countzero(num);
        s.close();
    }
}