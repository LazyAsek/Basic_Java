public class e9 {


    public static void main(String[] args) {
       int[] a = {1,4,17,7,25,3,100}; 
       int firstL=0;
       int SecoundL=0;
       int ThirdL=0;
       for(int j=0 ; j<10;j++){
       for(int i=0;i<a.length;i++){
        if(a[i]>firstL){ firstL = a[i]; }
        if(a[i]!=firstL && a[i]>SecoundL){SecoundL=a[i];}
        if(a[i]!=firstL && a[i]!=SecoundL && a[i]>ThirdL){ThirdL = a[i];}
       }
    
    }
    System.out.println(firstL+" "+ SecoundL+" "+ThirdL);
    }
}
