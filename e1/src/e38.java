public class e38 {
    public static boolean isanagram(String word){
        int checker=0;
        String b="xyz";
        boolean check=false;
        for(int i=0;i<word.length();i++){
            char a= word.charAt(i);
            if(a==b.charAt(0)|| a==b.charAt(1)||a==b.charAt(2) ){
                checker++;
            }
        }
        if(checker==3){
            check=true;
        }
        return check;
    }
    public static int[] anagram(String word){
        String newword="";
        int t[]= new int [10];
        int tindex=0;
        for(int i=0;i<word.length()-3;i++){
            newword += word.substring(i, i+3);
            if(isanagram(newword)){
                t[tindex]=i;
                tindex++;
                i+=3;
            }
            newword="";
        }
        return t;
    }
    public static void main(String[] args) {
        String orginal = "zyxwyxyxzwxyz";
        int t[]=anagram(orginal);
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
