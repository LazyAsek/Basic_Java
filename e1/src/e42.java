import java.util.Arrays;

public class e42 {
    public static void main(String[] args) {
        String str1 = "AND456HSE8";
        System.out.println(sort(str1));
    }
    public static String sort (String s){
        String text="";
        int nums=0;
        for(int i=0;i<s.length();i++){
            char letter =s.charAt(i);
          //  System.out.println(letter);
            if(letter  >=65 && letter<=90){
                text += letter;
              //  System.out.println(text);
            }
            if(letter>=48 && letter<=57){
                String num= Character.toString(letter);   
                nums+=Integer.parseInt(num);
              //  System.out.println(nums);
            }
        }
        String nwetext=alphabet(text);
        String numstext=Integer.toString(nums);
        return nwetext+numstext;
    }
    public static String alphabet(String text){
        char charArray[] = text.toCharArray();
        Arrays.sort(charArray);
        String newt=new String (charArray);
        return newt ;
    }
    
}
