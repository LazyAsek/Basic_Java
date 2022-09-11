import java.util.Scanner;

public class e5 {

    public static void  GetArray(){
        //geting first array
        Scanner s = new Scanner(System.in);
        int FirstArray[][]={{0,0,0},{0,0,0}};
        for(int i=0; i<=1 ; i++){
            for(int j = 0;j<=2;j++){
                
                FirstArray[i][j]=s.nextInt();
                
            }
        }
        //geting secound array
        int SecoundArray[][]={{0,0},{0,0},{0,0}};
        for(int a=0;a<=2;a++){
            for(int b=0;b<=1;b++){

                SecoundArray[a][b] = FirstArray[b][a];

            }
        }
        //return array
        for(int n=0;n<=1;n++){
            for(int m=0;m<=2;m++){
                System.out.println(SecoundArray[m][n]);
            }
        }

        s.close();
    }
    public static void main(String[] args) {
        GetArray();
    }
}
