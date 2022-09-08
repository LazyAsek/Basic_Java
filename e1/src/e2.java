import java.util.Scanner;

public class e2 {
            
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int a ,b ,c ,d;
    System.out.println("Give four integers and i check if they are equal");
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();

    int rest = (a+b+c+d) % 2;
    if(rest==0){
        System.out.println("Your numbrers are equal");
    }
    else{
        System.out.println("Your numbers aren t equal");
    }
    scanner.close();
}  
}
