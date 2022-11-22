
import java.util.*;
public class e49 {
    public static boolean findPattern(String word, String pattern){
        //creates charr arr
        char[] word_pattern = pattern.toCharArray();
        //creates word array
        String[] words = word.split(" ");
            // hashmap char to string for pattern x y xy y
         Map < Character, String > map = new HashMap < > ();
         //set for words that are the same
         Set < String > set = new HashSet < > ();
         for(int i=0;i<word_pattern.length;i++){
            if(map.containsKey(word_pattern[i])){
                if(!map.get(word_pattern[i]).equals(words[i])){
                    return false;
                }
                continue;
            }
            if(set.contains(words[i])){
                return false;
            }
            map.put(word_pattern[i],words[i]);
            set.add(words[i]);
         }
         return true;
    }
    public static void main(String[] args) {
        System.out.print(findPattern("red black black red", "xxyx"));
    }

}
