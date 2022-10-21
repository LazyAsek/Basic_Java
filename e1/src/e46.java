public class e46 {
    public static int num=1;
    public static int lastx=0;
    public static int lasty=0;
    public static int [][] spiral (int n){
        int [][] arr=new int [n][n];
        arr=move(arr, n, 1);
        arr=move(arr, n, 2);
        n--;
        arr=move(arr, n, 3);
        n--;
        arr=move(arr, n, 4);
        arr=move(arr, n+1, 1);
        arr=move(arr, n+1, 2);
        arr=move(arr, n, 3);
        return arr;
    }
    public static int [][]move(int [][]a,int n,int where){
        //where 1==rigth 2==down 3==left 4==up
        if(where==1){
            for(int i=lasty;i<n;i++){
                a[lasty][i]=num;
                num++;
                lastx=i;
            }
        }
        if(where==2){
            for(int j=lasty+1;j<n;j++){
                a[j][lastx]=num;
                num++;
                lasty=j;
            }
        }
        if(where==3){
            num=+n;
            for(int k=lasty;k<n;k++){
                System.out.print(lasty);
                a[lasty][k]=num;
                num++;
                lastx=k;
            }
            num-=n;
        }
        if(where == 4){
            for(int l=n;l>0;l--){
                a[l][lastx]=num;
                num++;
                lasty=l;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int [][]arr=spiral(5);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
