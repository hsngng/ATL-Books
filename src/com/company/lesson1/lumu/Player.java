package com.company.lesson1.lumu;

public class Player implements Comparable<Player>{
    private String name;
    private Integer score;

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Player that) {
        if (!this.score.equals(that.score)){
           if (this.score>that.score){
               return 1;
           }
           else
               return -1;
        }
        else {
            return this.name.compareTo(that.name);
        }
    }
}
