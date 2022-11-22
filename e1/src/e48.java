public class e48 {
    public static int findNum (int n){
        int preimeArr[]=new int [1000];
        int postion =0;
        for(int i=2;i<=n;i++){
            if(i % 2 !=0 && i % 3 !=0 ){
                preimeArr[i-3]=i;
                System.out.print(preimeArr[i-3]+" ");
                postion++;
            }
        }
    
        return postion+2;
    }
    public static void main(String[] args) {
        int a= findNum(15);
        System.out.println(a);
    }
}
