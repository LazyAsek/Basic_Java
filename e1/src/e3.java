import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if(a <1 && a > 0 && b<1 &&b>0){
            System.out.println("true");
        }
        else System.out.println("false");
        s.close();
    }
}

/*
Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. Go to the editor

Sample Output:
Input first number: 5
Input second number: 1
false
 
 */
