package org.example.problemStatement;

import java.util.Arrays;
import java.util.List;

public class Team {
        List<Player> players;

        public Integer totalScore(){
            return players.stream().map(player->player.getScore()).mapToInt(e->(int)e).sum();
        }
        public Integer scoreByBatsmam(){
            return players.stream()
                    .filter(player->player.getType().equals(PlayerType.batsman))
                    .mapToInt(batsman->batsman.getScore())
                    .sum();
        }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
