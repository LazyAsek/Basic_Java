

public class e26 {
    public static int[] partion(int [] t){
        int n[]= new int [t.length];
        int newstart=0;
        for(int i=0;i<t.length;i++){
            if(t[i]%2==0){
                n[newstart]=t[i];
                newstart++;
            }
        }
        for(int j = 0;j<t.length;j++){
            if(t[j]% 2 !=0){
                n[newstart]=t[j];
                newstart++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int oarray[]={7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int narray[]= partion(oarray);
        for(int i = 0 ; i< narray.length;i++){
            System.out.print(narray[i]+",");
        }
    }
}