public class e44 {
    public static Boolean findiInMatrix(int [][]arr,int n){
        Boolean check=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==n){
                    System.out.println("("+i+","+j+")");
                    check=true;
                }
            }
        }
        if(check==false){
            System.out.println("num not found");
        }
        return check;
    }
    public static void main(String[] args) {
        int arr[][]= {
            {2,5,3},
            {3,2,1},
            {1,3,5}
           };
        System.out.println(findiInMatrix(arr, 3));
    }
}
