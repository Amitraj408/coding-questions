package org.example.problemStatement;

public class Player {
    private String name;
    private Integer score;
    private PlayerType type;

    public Player(String name, Integer score, PlayerType type) {
        this.name = name;
        this.score = score;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", type=" + type +
                '}';
    }
}
