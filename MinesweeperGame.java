package com.codegym.games.minesweeper;
import com.codegym.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject gameField[][] = new GameObject [SIDE][SIDE];
    private int countMinesOnField = 0;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int side1 = 0; side1 < SIDE; side1++) {
            for (int side2 = 0; side2 < SIDE; side2++) {
                boolean maybeMine = false;
                int randomNumb = getRandomNumber(10);
                if(randomNumb == 0){
                    maybeMine = true;
                    countMinesOnField++;
                }
                gameField[side2][side1] = new GameObject(side1, side2, maybeMine);
                setCellColor( side1,side2,Color.YELLOW);
            }
        }
    }
}