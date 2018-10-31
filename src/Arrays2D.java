import java.util.Arrays;
import java.util.Scanner;
//prints a multiplication table of numbers 1-5
public class Arrays2D {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.print("Choose a height: ");
        int height = console.nextInt();
        System.out.print("Choose a girth: ");
        int width = console.nextInt();

        int[][] table = new int[height][width];
        for(int row = 0; row<table.length; row++){
            for(int column = 0; column<width; column++){
                table[row][column] = (row+1)*(column+1);
            }
        }
        for(int i = 0; i<height; i++){
            for(int j=0; j<width; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
