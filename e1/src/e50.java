
import java.util.*;

public class e50 {
    public static String[] RemoveDuplicats(String word){
        char[] letters = word.toCharArray();
        Set <Character> map=new HashSet<>();
        for(int i=0;i<letters.length;i++){
            map.add(letters[i]);
        }
        System.out.println(map);
        String[] newletters = new String[map.size()];
        map.toArray(newletters);
        return newletters;
    }
    public static String[] removeLargest(String[]tab){
        char largest=97;
        int index=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i].charAt(i)>largest){
                largest = tab[i].charAt(i);
                index=i;
            }
        }
        System.out.println(tab[index]);
        String []newtab=new String[tab.length-1];
        for(int j=0;j<tab.length;j++){
            if(j==index){
                j++;
            }
            newtab[j]=tab[j];
        }
        return newtab;
    }
    public static void sort(String[]letters){
        String []sorted=removeLargest(letters);

    }
    public static void main(String[] args) {
        String word="zxywooxz";
        String[]letters=RemoveDuplicats(word);
        sort(letters);
    }
}
