public class e19 {
    public static int zero(String a){
        int index=0;
        for(int i=0;i<a.length();i++){
            if(a.indexOf(" ",i)>index){
                index=a.indexOf(" ",i);
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String word ="The quick brown fox jumps over the lazy dog";
        String word2="";
        for(int i=0;i<word.length();i++){
            int index=zero(word);
            word2 += word.substring(index);
            word=word.substring(0, index);
        }
        word2+=" "+word;
        System.out.println(word2);
    }
}
