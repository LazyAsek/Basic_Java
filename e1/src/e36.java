import java.util.Scanner;

public class e36 {
    public static int[] toarr(int num){
        String temp =Integer.toString(num);
        int []arr= new int [temp.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(temp.substring(i));
        }
        return arr;
    }
    public static int []change(int[]arr){
        int[]t = new int[arr.length];
        for(int i=0;i<t.length;i++){
            if(arr[i]==6){
                t[i]=9;
                break;
            }
            else{
                t[i]=arr[i];
            }
            if(arr[i]==6){
                t[i]=9;
                break;
            }
            else{
                t[i]=arr[i];
            }
        }
        return t;
    }
    public static int reverseprint(int[]t){
        int num=0;
        int k=1;
        for(int i=0;i<t.length-1;i++){
            int temp=t[i];
            num+=(temp*k);
            k*=10;
            System.out.print(num+" ");
            System.out.println(temp);
            temp=0;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num= s.nextInt();
        int []t=toarr(num);
        int cht[]=change(t);
        int newnum=reverseprint(cht);
    
        s.close(); 
    }
}
