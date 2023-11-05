package org.example.problemStatement;

import java.util.Arrays;
import java.util.List;

public class DriverClass {

    static Team team = new Team();
    public static void main(String[] args) {
        //find the sum of scores of all the player in the team
        List<Player> players = Arrays.asList(
                new Player("Yuvraj Singh",101,PlayerType.batsman),
                new Player("Dhoni",89,PlayerType.batsman),
                new Player("Virat kohli",101,PlayerType.bowler),
                new Player("Hardik patel",80,PlayerType.bowler),
                new Player("Irfan Pathan",90,PlayerType.batsman),
                new Player("Rohit Sharma",101,PlayerType.bowler),
                new Player("Gautam Gambhir",101,PlayerType.batsman),
                new Player("Chahal",70,PlayerType.bowler),
                new Player("sehwag",201,PlayerType.batsman),
                new Player("Sachin",101,PlayerType.batsman),
                new Player("Ishan Kishan",50,PlayerType.batsman)
        );

       team.setPlayers(players);

       batsmanScore();;
        Integer totalScoreOfTeam = team.totalScore();
        System.out.println(totalScoreOfTeam);



    }
    public static void batsmanScore(){
        //sum of score of the batsman only

        System.out.println("score by batsman: "+team.scoreByBatsmam());
    }
}
