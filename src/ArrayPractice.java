import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String []args){
        randomArray();
    }
    public static void randomArray(){
        int numbers = (int)((Math.random() * 10)+1);
        int [] array = new int[numbers];
        for(int i = 0; i<numbers; i++){
            array [i] = (int) ((Math.random() * 10)+1);
        }
        System.out.println(Arrays.toString(array));
    }
}
