public class e7 {
    
    public static int Euclid(int x,int y){
        if(x==0 ||y==0){
            return 1;
        }
        if(x<y){
            int t = x;
            x=y;
            y=t;
        }
        if(x%y==0){
            return y;
        }
        else{
            return Euclid(y,x % y);
        }

    }

    public static void main(String[] args) {
        System.out.println("result: " + Euclid(48, 24));
    }
}
