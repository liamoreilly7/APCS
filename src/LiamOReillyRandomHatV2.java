import java.util.Scanner;
public class LiamOReillyRandomHatV2 {
    public static void main(String[] args){
        int teams = intro(); //runs intro sequence
        int[] array = setArray(teams); //populates array
        matchups(teams, array); //sets match ups
    }
    public static int intro(){
        System.out.println("This program will create the match ups for round 1.");
        Scanner console = new Scanner(System.in);
        //asks for number of teams
        System.out.print("How many teams are competing? ");
        int length = console.nextInt();
        //makes sure the number of teams is even
        while(length%2 != 0) {
            System.out.print("Please choose an even number: ");
            length = console.nextInt();
        }
        System.out.println();
        System.out.println("Match ups for round 1:");
        System.out.println();
        return length;
    }
    public static int[] setArray(int teams){
        //populates array with non-zero, increasing values
        int[] array = new int[teams];
        for(int i = 0; i<array.length;i++){
            array[i] = i+1;
        }
        //returns populated array
        return array;
    }
    public static void matchups(int n, int[]array) {
        boolean secondTeam = true; //variable used to differentiate between first and second team of each match up
        for(int i = 0; i<array.length; i++) { //for loop that runs for each team that needs to be selected
            int chosenTeam = (int) (Math.random()*n);
            //ensures the team has not already been chosen
            while(array[chosenTeam] == 0) {
                chosenTeam = (int) (Math.random()*n);
            }
            System.out.print("Team " + array[chosenTeam]);
            array[chosenTeam] = 0;
            if(secondTeam) { //prints "vs" and indicates that the second team in the match up needs to be chosen
                System.out.print(" vs ");
                secondTeam = false;
            } else { //adds next line for the next match up and changes variable to reflect that
                secondTeam = true;
                System.out.println();
            }
        }
    }
}
