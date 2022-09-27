public class e28 {
    public static int count(int[]a){
        int count=1;
        int largestcount=0;
        int w=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==w+1){
                w=a[i];
                count++;
            }
            if(count>largestcount){
                largestcount=count;
            }
            if(a[i]<w){
                count=0;
            }
        }
        return largestcount;
    }
    public static void main(String[] args) {
        int t[]={10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};
        System.out.println(count(t));
    }
}
