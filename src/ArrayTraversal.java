import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {5,2,4,1};
        oliverAlgo(array);
        michelleAlgo(array);
    }
    //Oliver algorithm reverses the array by using a temporary array
    public static void oliverAlgo(int[] array){
        int[] temp = new int[array.length];
            for(int i = temp.length-1; i >= 0; i--){
                temp[i] = array[array.length-1-i ];
            }
        System.out.println(Arrays.toString(temp));
    }
    //Michelle algorith suggests that we do an in-array
    //swap of first and last elements and continue to do
    //so until length of the array divide by 2
    public static void michelleAlgo(int[] oa){
        for(int i = 0; i <=oa.length/2; i++){
            int temp = oa[i];
            oa[i] = oa[oa.length-1-i];
            oa[oa.length-1-i] = temp;
        }
    }
}

