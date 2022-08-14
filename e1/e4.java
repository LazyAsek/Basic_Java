public class e4 {
    public static void main(String[] args) {
        
        Boolean array[][] = {{true, false, true},{false, true, false}};
        for(int i=0;i<array.length ;i++){
            for(int j = 0;j<array[i].length;j++){
                Boolean bool = array[i][j];
                System.out.print(bool+" ");
            }
            System.out.println(" ");
        }


    }
}

/*
Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false. Go to the editor

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f
 */
