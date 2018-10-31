import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String []args){
        int[] array = {27,15,15,11,27};
        mode(array);
    }
    public static int mode(int[] array){
       int[]tally = new int[101];
       for(int i = 0; i <array.length; i++){
           tally[array[i]]++;
       }
       //System.out.print(Arrays.toString(tally));
       int max = 0;
       for(int i = 0; i<100; i++){
           if(tally[i]>=max){
               max = i;
           }

       }
       System.out.println(max);
    return max;
    }
}
