public class e43 {
   /*  public static int[] adding (int number){
        int []numarray=new int [number+1];
        for(int i=0;i<number+1;i++){
            numarray[i]=i;
        }
        return numarray;
    }
    public static int sum(int []tab ,int n){
        int sum=0;
        for(int i=0;i<n+1;i++){
            sum += tab[i];
        }
        return sum;
    }
    public static int bigsum(int []tab ,int n){
        int sum=0;
        for(int i=0;i<tab.length;i++){
            sum+=sum(tab, i);
            for(int j=0;j<n;j++){
                sum += tab[j];
            }
        }
        return sum;
    }
    */
    public static void main(String[] args) {
       int n=25;
       int result = (n * (n + 1) / 2) * (1 << (n - 1));
       System.out.println(result);
       
    }
}
