import java.util.Scanner;
public class e6 {

    public static Double GetIntigger(){
        Scanner s = new Scanner(System.in);
        double a=s.nextDouble();
        s.close();
        return a;
    }

    public static Double Math(Double num){
        Double newnum = Math.log(num)/Math.log(2);
        return newnum;
    }
    
    public static void main(String[] args) {
        
        double number = GetIntigger();
        Double newnumber= Math(number);
        System.out.format("%.0f",newnumber);
    }
}
