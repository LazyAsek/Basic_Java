public class e29 {
    public  static int convertoint(int[]t){
        int num=0;
        int a=1;
        for(int i=t.length-1;i>=0;i--){
            num = num+(t[i]*a);
            a = a*10;
        }
        return num;
    }
    public static int[] convertotab(int num){
        String number = Integer.toString(num);
        int length= number.length();
        int a[]=new int[length];
        for(int i=0;i<length;i++){
            a[i]= number.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        int t[]={9, 9, 9, 9};
        System.out.println(convertoint(t));
        int num= convertoint(t)+1;
        int [] nt= convertotab(num);
        for(int i=0;i<nt.length;i++){
            System.out.print((char)nt[i]);
        }
    }
}
