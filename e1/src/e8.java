public class e8 {

    public static String truecheck(int a,int b){
        if(CheckForPrime(a)=="false" && CheckForPrime(b)=="false"){
            return "false";
        }
        else{
            return "true";
        }
    }

    public static String CheckForPrime(int a){
     if(a <= 1){
        return "true";
        }
    for(int i=2 ;i<=a/2;i++){
        if((a%i)==0){
            return "true";
        }}
     
    return "false";
    }

    public static void main(String[] args) {
        String [][] a=new String[3][3]; 
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                a[i][j]=truecheck(i, j);
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }
}
