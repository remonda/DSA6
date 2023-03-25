package com.dsa6.ch3;

import java.util.Arrays;

/**
 * author: Raymond, Zhang Yuehua
 * created: 13/3/23
 */

public class Scoreboard {
    private int numEnties = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public int getNumEnties() {
        return numEnties;
    }

    public void setNumEnties(int numEnties) {
        this.numEnties = numEnties;
    }

    public GameEntry[] getBoard() {
        return board;
    }

    public void setBoard(GameEntry[] board) {
        this.board = board;
    }

    public void add(GameEntry e) {
        if (numEnties < board.length) {
            board[++numEnties] = e;
        } else {
            if (e.getScore() > board[numEnties].getScore()) {
                board[numEnties] = e;
            } else {
                return;
            }
        }
        sort();
    }

    public GameEntry remove(int idx) {
        if (idx > numEnties || idx < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        } else {
            GameEntry ret = board[idx];
//            for (int i = idx; i < numEnties - 1; i++) {
//                board[i] = board[i + 1];
//            }
            System.arraycopy(board, idx + 1, board, idx, numEnties - idx);
            board[numEnties--] = null;
            return ret;
        }
    }

    public void sort() {
        Arrays.sort(board);
    }

    @Override
    public String toString() {
        return "Scoreboard={" +
                "numEnties=" + numEnties +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
