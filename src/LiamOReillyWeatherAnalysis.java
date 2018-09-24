//this program calculates the average and number of above average values
//of inputted data.
import java.util.Scanner;
public class LiamOReillyWeatherAnalysis {
    public static void main (String []args) {
        //ask for user input
        int days = askDays();
        Scanner console = new Scanner(System.in);
        //initialize variables for later use
        int totalTemp = 0;
        int aboveAVG = 0;
        //user input and populate array
        int [] array = new int[days];
        totalTemp = populate(totalTemp, array, days);
        //calculate average
        double avg = calcAVG(totalTemp, days);
        //print the results
        printAVG(avg, aboveAVG, days, array);
    }

    public static int askDays() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = input.nextInt();
        return days;
    }
    public static int populate(int totalTemp, int[] array, int days){

        for(int i = 1; i <= days; i++) {
            Scanner console = new Scanner(System.in);
            System.out.print("Day " + i + "'s high temp: ");
            int temp = console.nextInt();
            totalTemp += temp;
            array[i - 1] = temp;
        }
        return totalTemp;

    }
    public static double calcAVG(int totalTemp, int days) {
        return Math.round(((totalTemp * 1.0) / days) * 10.0) / 10.0;
    }
    public static void printAVG(double avg, int aboveAVG, int days, int[] array){
        System.out.println("Average temp = " + avg);
        for (int i = 1; i <= days; i++) {
            if (array[i - 1] > avg) {
                aboveAVG++;
            }
        }
        System.out.println(aboveAVG + " days were above average.");
    }
}