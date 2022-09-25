public class e24 {
    public static int largest(int []tab){
        int max=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }

    public static int[] threetable(int[] tosplit){
        int []max={0,0,0,0,0,0,0};
        int start=0;
        for(int i=0;i<tosplit.length-2;i++){
            int []array={0,0,0};
            int a=0;
            for(int j=start;j<3+start;j++){
            array[a]=tosplit[j/2];
            a++;
            }
            max[i]= largest(array);
            a=0;
            start+=2;
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[]={1, 2, 3, 4, 5, 6, 7, 8, 8};
        int arr[]=threetable(ar);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
