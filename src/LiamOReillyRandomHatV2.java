import java.util.Scanner;
public class LiamOReillyRandomHatV2 {
    public static void main(String[] args){
        int teams = intro();
        int[] array = setArray(teams);
        matchups(teams, array);
    }
    public static int intro(){
        System.out.println("This program will create the matchups for teams");
        Scanner console = new Scanner(System.in);
        System.out.println("How many teams are competing? Please choose an even number: ");
        int length = console.nextInt();
            while(length%2 != 0) {
                System.out.print("Please choose an even number: ");
                length = console.nextInt();
            }
        return length;
    }
    public static int[] setArray(int teams){
        int[] array = new int[teams];
        for(int i = 0; i<array.length;i++){
            array[i] = i+1;
        }
        return array;
    }
    public static void matchups(int teams, int[] array) {
        boolean secondTeam = true;
        for (int i = 0; i < array.length; i++) {
            int team1 = (int) Math.random() * teams;
            while (array[team1] == 0) {
                team1 = (int) Math.random() * teams;
            }
            System.out.print("Team " + array[team1]); //prints fist team of the matchup
            if (secondTeam) {
                System.out.print(" vs ");
                secondTeam = false;
            } else {
                secondTeam = true;
                System.out.println();
            }
        }
    }
}
