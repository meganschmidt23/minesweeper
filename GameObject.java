package com.codegym.games.minesweeper;

public class GameObject {
    public int x = 0;
    public int y = 0;
    public boolean isMine = false;
    public GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;

    }
}