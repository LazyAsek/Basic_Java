public class e20{
    public static void main(String[] args) {
        int []array={1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        int count=0;
        int big=0;
        for(int i=0;i<array.length-1;i++){
            int c=array[i+1];
            if(array[i]==array[i+1]){
                count++;
            }
            if(array[i]==c-1){
                count++;
            }
            if(count>big){
                big=count;
            }
            if(array[i]!=c-1&&array[i]!=array[i+1]){
                count=0;
            }

        }
        big+=1;
        System.out.println(big);
    }
}