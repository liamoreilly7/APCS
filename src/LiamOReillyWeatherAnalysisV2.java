//this program calculates the average and number of above average values
//of inputed data.
import java.util.Scanner;
import java.util.Arrays;
public class LiamOReillyWeatherAnalysisV2 {
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
        hottestAndColdest(array, days);
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
    public static void hottestAndColdest(int[] array, int days) {
        System.out.println("Temperatures: " + Arrays.toString(array));
    		/*int max = Integer.MIN_VALUE;
    		int min = Integer.MAX_VALUE;
    		int secondMax = 0;
    		int secondMin = 0;
    			for(int i = 0; i < days; i++) {
    				if(array[i]>max) {
    					max = array [i];
    				}
    				if(array[i]<min) {
    					min = array [i];
    				}
    			}*/
        Arrays.sort(array);

        System.out.println("Two coldest days: " + array[0] + ", " + array[1]);
        System.out.println("Two hottest days: " + array[array.length-1] + ", " + array[array.length-2]);
    }
}