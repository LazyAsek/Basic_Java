public class e37 {
    public static int repeat(String word){
        int norepeat = 0;
        for(int i=0;i<word.length();i++){
            String temp = word.substring(i);
            for(int j=0;j<word.length();j++){
                if(temp != word.substring(j)){
                    norepeat = j;
                }
            }
        }
        return norepeat;
    }
    public static void main(String[] args) {
        String word="googogot";
        System.out.println(repeat(word));
    }
}
