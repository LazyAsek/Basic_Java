public class e23{
    public static void main(String[] args) {
        int array[]={1, 2, 3, 4, 5, 6, 7, 8, 8};
        int newarray[]={0,0,0,0,0,0,0};
        for(int i=1;i<array.length-1;i++){
            newarray[i-1]=array[i];
        }
        for(int f=0;f<newarray.length;f++){
            System.out.println(newarray[f]);
        }
    }
}