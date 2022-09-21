import java.util.Scanner;

public class e21 {
    public static boolean contains(String str1,String str2){
        boolean a=false;
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)==str2.charAt(0)){
                for(int j=0;j<str2.length();j++){
                    if((i+j)< str1.length()&& str2.charAt(j)==str1.charAt(j+i)&&j==str2.length()-1){
                        a=true;
                        break;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Input second string: ");
		String str2 = scanner.nextLine();
		System.out.println("If the second string contains the first one? "+contains(str1, str2));	
        scanner.close();
    }

}
