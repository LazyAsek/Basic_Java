

public class e17 {

    public static int[] move(int arr[]){
        boolean a=true;
        while(a){
            a=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==0 && arr[i+1]!=0){
                    swap(arr, i, i+1);
                    a=true;
                }
            }
        }
        return arr;
    }

    public static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    
    public static void main(String[] args) {
        int array[]= {0, 3, 4, 0, 1, 2, 5, 0};
        int arrayw[]= move(array);
        for(int i=0;i<arrayw.length;i++){
            System.out.print(arrayw[i]);
        }
    }
}
