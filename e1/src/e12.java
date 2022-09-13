public class e12 {

    //average
    public static int average(int tab[]){
        int count=0;
        for(int i=0;i<tab.length;i++){
            count += tab[i];
        }
        count/=tab.length;
        return count;
    }
    //print greater
    public static int[] greater(int average,int tab[]){
        int greater[]={0,0};
        int index=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>average){
                greater[index]=tab[i];
                index +=1;
            }
        }
        return greater;
    }
    //print tab
    public static void printtab(int tab[]){
        for(int i =0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1, 4, 17, 7, 25, 3, 100};
        int av=average(a);
        int gr[]=greater(av,a);
        System.out.println("the average is "+av);
        printtab(gr);
    }
}
