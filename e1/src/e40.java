public class e40 {
    public static String[] contains(String s1,String s2){
        String st1[] = s1.split(" ");
        String st2[] = s2.split(" ");
        int c=st1.length-st2.length;
        String missing[]=new String[c];
        int l=0;
        int j=0;


        for(int i=0;i<st1.length;i++){
            j = j+l;
            if(i==st2.length){
                missing[l]= st1[i];
                break;
            }
            if(!st1[i].equals(st2[j])){
                missing[l] = st1[i];
                l++;
            }
            
            j++;
        }

        return missing;
    }
    public static void main(String[] args) {
        String str1 = "Java Programming Exercises, Practice, Solution";
        String str2 = "Java Programming Exercises, Practice,";
        String []tab=contains(str1, str2);
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
