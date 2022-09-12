import java.util.Scanner;

public class e11 {

    private static int[] largest(int a[]){
        int tabtodes[]=a;
        int b[]={0,0,0,0,0,0,0};
        
            int largest=0;
            int iloop=0;
            //go in a tab and find largest
            for(int j=0;j<tabtodes.length;j++){
                //set largest to largest
                for(int i=0;i<tabtodes.length;i++){
                if(tabtodes[i]>largest ){
                    largest=tabtodes[i];
                    iloop=i;
                }
            }
                b[j]=largest;
                tabtodes[iloop]=0;
                largest=0;
            }
        
        return b;
    }

    private static int[] smallest(int a[]){
        int tabtodes[]=a;
        int b[]={0,0,0,0,0,0,0};
        
            int smallest=100;
            int iloop=0;
            //go in a tab and find smallest
            for(int j=0;j<tabtodes.length;j++){
                //set smallest to smallest
                for(int i=0;i<tabtodes.length;i++){
                if(tabtodes[i]<smallest ){
                    smallest=tabtodes[i];
                    iloop=i;
                }
            }
                b[j]=smallest;
                tabtodes[iloop]=100;
                smallest=100;
            }
        
        return b;
    }

    public static void printtab(int tab[],int tabb[]){
        System.out.println("insert what postion of largest and samlest you want to see");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.print(tab[x-1]+" "+tabb[x-1]);
        s.close();
    }
    public static void main(String[] args) {
        int starttab[] ={1, 4, 17, 7, 25, 3, 100};
        int largetab[]= largest(starttab);
        int starttabb[] ={1, 4, 17, 7, 25, 3, 100};
        int smaltab[] = smallest(starttabb);

        printtab(largetab, smaltab);
    }
}
