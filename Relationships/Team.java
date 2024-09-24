package Relationships;
import java.util.ArrayList;
import java.util.List;
//this scenario is to represent aggregation relationship("has-a") between a basketball team and its players..
// In this context we see that there is a weak relationship between the team and the players because
//even without the team, the players will still be able to exist and function independently.

public class Team { //this is the container class

    public static class Players{
        private int jerseyNumber;
        public Players(int jerseyNumber){
            this.jerseyNumber = jerseyNumber;
        }
        public int getJerseyNumber(){
            return jerseyNumber;
        }
    }
    private List<Players> Lakers;
    public Team(){
        this.Lakers = new ArrayList<>();
    }
    public void registerNewPlayer(Players players){
        Lakers.add(players);
    }

    public List<Players> getLakers(){
        return Lakers;
    }
    public void showNewPlayers(){
        for (Players players:Lakers){
            System.out.println("The new player is Jersey number: " + players.getJerseyNumber());
        }
    }

        public static void main(String[]args) {
            Team team = new Team();
            Players sub1 = new Players(21);
            team.registerNewPlayer(sub1);
            team.showNewPlayers();

            Team team1 = new Team();
            Players sub2 = new Players(11);
            team.registerNewPlayer(sub2);
            team.showNewPlayers();

            Team team2 = new Team();
            Players sub3 = new Players(17);
            team.registerNewPlayer(sub3);
            team.showNewPlayers();


        }
}
