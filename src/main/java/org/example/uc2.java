package org.example;

import java.util.Random;

public class TicTacToe_uc2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;


    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);
        if(toss==0){
            isHumanTurn = true;
            humanSymbol = 'x';
            computerSymbol = 'O';
        }
        else{
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }

    }
    static void displayTossResult() {
        if(isHumanTurn){
            System.out.println("Human won the toss");
        }
        else
        {
            System.out.println("computer won the toss and plays");
        }
        System.out.println("Human Symbol: "+ humanSymbol);
        System.out.println("computer symbol: "+ computerSymbol);

    }
}
