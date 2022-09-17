public class e15 {
    public static int[] sort(int arr[]){
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<arr.length -1;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                    flag=true;
                }
            }
        }
    return arr;
    }
    
    public static void swap(int num[],int right ,int left){
        int temp = num[left];
        num[left]=num[right];
        num[right]=temp;
    }
    
    
    
    public static void main(String[] args) {
        int array[] = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        int arrayw[]= sort(array);
        for(int k=0;k<arrayw.length;k++){
            System.out.print(arrayw[k]+" ");
        }
    }
}
