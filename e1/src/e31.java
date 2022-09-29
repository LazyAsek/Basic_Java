public class e31 {
    public static String getlast(String word){
        String neword= word.substring(word.length() -1);
        for(int i=word.length()-1;i>0;i--){
            neword+=word.charAt(i);
            if(word.charAt(i)==' '){
                i=0;
            }
        }
        String fixesword="";
        for(int j=neword.length()-1;j>0;j--){
            fixesword += neword.charAt(j);
        }
        return fixesword;
    }
    public static void main(String[] args) {
        String word = "The length of last word";
        System.out.println(getlast(word));
    }
}
