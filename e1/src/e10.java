public class e10 {
    public static void main(String[] args) {
        int[] a = {1,4,17,7,25,3,100}; 
        int firstS=100;
        int SecoundS=100;
        int ThirdS=100;
        for(int j=0 ; j<10;j++){
        for(int i=0;i<a.length;i++){
         if(a[i]<firstS){ firstS = a[i]; }
         if(a[i]!=firstS && a[i]<SecoundS){SecoundS=a[i];}
         if(a[i]!=firstS && a[i]!=SecoundS && a[i]<ThirdS){ThirdS = a[i];}
    }}
    System.out.println(firstS+" "+ SecoundS+" "+ThirdS);
}
}
