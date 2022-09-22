public class e22 {
    public static int smallerthen(int a[],int num){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<num){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int arrayone[]={1,2,3,4,5,6,7,8};
       int smalthen[]={1,4,8}; 
       for(int i=0;i<smalthen.length;i++){
        int a= smallerthen(arrayone, smalthen[i]);
        System.out.println(a);
       }
    }
}
