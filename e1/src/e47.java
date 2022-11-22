public class e47 {
    public static void perfectsquare(int n){
        boolean flag=false;
        int a=1;
        while (n/2>a){
            if(a*a==n){
                flag=true;
                break;
            }
            
            a++;
        }
        
        System.out.println(flag);
    }
    public static void main(String[] args) {
        int a=6;
        perfectsquare(a);
    }
}
