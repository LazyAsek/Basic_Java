import java.util.Scanner;

public class e35 {
    public static Boolean check(String s){
        for(int i=0;i<s.length()-1/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sone=s.nextLine();
        String stwo=s.nextLine();
        if(check(sone)==check(stwo)){
            System.out.println("true");
        }
        else{
            System.err.println("false");
        }
        s.close();
    }
}
