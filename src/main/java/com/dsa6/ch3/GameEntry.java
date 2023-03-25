package com.dsa6.ch3;

/**
 * author: Raymond, Zhang Yuehua
 * created: 13/3/23
 */

public class GameEntry implements Comparable {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry={" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this.getScore() > ((GameEntry) o).getScore()) {
            return 1;
        } else if (this.getScore() < ((GameEntry) o).getScore()) {
            return -1;
        } else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(GameEntry other) {
//        if (this.score > other.getScore()) {
//            return 1;
//        }
//        if (this.score < other.getScore()) {
//            return -1;
//        }
//        if (this.score == other.getScore()) {
//            return 0;
//        }
//
//    }
}
