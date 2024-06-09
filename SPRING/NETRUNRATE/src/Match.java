import java.util.*;
import java.lang.*;
public class Match{
    private Team teamA;
    private Team teamB;
    private String Batter;


    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void playMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of batting team : ");
        Batter=scanner.nextLine();

        if(!teamA.getName().equalsIgnoreCase(Batter.trim())){
            Team temp =teamB;
            teamB=teamA;
            teamA=temp;
        }

        System.out.println("Enter runs scored by " + teamA.getName());
        int teamARuns = scanner.nextInt();

        System.out.println("Enter overs played by " + teamA.getName());
        double oversPlayedByA = scanner.nextDouble();

        System.out.println("Enter wickets lost by " + teamA.getName());
        int wicketsLostByA = scanner.nextInt();

        System.out.println("Enter runs scored by " + teamB.getName());
        int teamBRuns = scanner.nextInt();

        System.out.println("Enter overs played by " + teamB.getName());
        double oversPlayedByB = scanner.nextDouble();

        System.out.println("Enter wickets lost by " + teamB.getName());
        int wicketsLostByB = scanner.nextInt();

        if (wicketsLostByA == 10) {
            oversPlayedByA = 20.0;
        }

        if (wicketsLostByB == 10) {
            oversPlayedByB = 20.0;
        }

        teamA.RunsScored(teamARuns);
        teamA.RunsConceded(teamBRuns);
        teamA.OversPlayed(oversPlayedByA);
        teamA.OversBowled(oversPlayedByB);

        teamB.RunsScored(teamBRuns);
        teamB.RunsConceded(teamARuns);
        teamB.OversPlayed(oversPlayedByB);
        teamB.OversBowled(oversPlayedByA);

        if(teamARuns>teamBRuns){
            System.out.println("winner of Match is : " + teamA.getName());
        }
        else{
            System.out.println("winner of Match is : " + teamB.getName());
        }

        System.out.println("Current nrr of "+ teamA.getName() + " is : " + teamA.getNRR());
        System.out.println("Current nrr of "+ teamB.getName() + " is : " + teamB.getNRR());
    }
}