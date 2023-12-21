/**
 * Course: TCSS 305 C, Programming Practicum
 * Instructor: Tom Capaul
 * Programming Assignment 6: Basic GUI - The Game of Craps
 *
 * This CrapsModel class is the model of the Craps game.
 */
package model;
/**
 * @author Sopheanith Ny
 * @version Autumn 2023
 *
 * Represent the back-end of the Craps game.
 */
public class CrapsModel {
    /**
     * Instance field for dice 1.
     */
    private int myDice1;
    /**
     * Instance field for dice 2.
     */
    private int myDice2;
    /**
     * Instance field for bank balance.
     */
    private int myBankBalance;
    /**
     * Instance field for player point.
     */
    private int myPoint;
    /**
     * Instance field for counting the win.
     */
    private int myWinCount;
    /**
     * Instance field for counting the house win.
     */
    private int myHouseWinCount;
    /**
     * Instance field for the bet.
     */
    private int myBet;
    /**
     * Instance field total of two dices.
     */
    private int mySumOfDices;
    /**
     * Instance field for the current roll/initial roll.
     */
    private boolean myInitialRoll;

    /**
     * Constructor the Craps Model.
     */
    public CrapsModel() {
        myBankBalance = 0;
        myInitialRoll = true;
        myWinCount = 0;
        myHouseWinCount = 0;
    }

    /**
     * Getter for dice one.
     * @return dice one.
     */
    public int getMyDice1() {
        return myDice1;
    }

    /**
     * Getter for dice two.
     * @return dice two.
     */
    public int getMyDice2() {
        return myDice2;
    }

    /**
     * Getter for bank balance.
     * @return bank balance.
     */
    public int getMyBankBalance() {
        return myBankBalance;
    }

    /**
     * Setter for bank balance.
     * @param theBankBalance
     */
    public void setMyBankBalance(final int theBankBalance) {
        myBankBalance += theBankBalance;
    }

    /**
     * Getter for current point.
     * @return current point.
     */
    public int getMyPoint() {
        return myPoint;
    }

    /**
     * Setter for current point.
     * @param thePoint
     */
    public void setMyPoint(final int thePoint) {
        myPoint = thePoint;
    }

    /**
     * Getter for counting the win.
     * @return win count.
     */
    public int getMyWinCount() {
        return myWinCount;
    }
    /**
     * Add one winning game count.
     */
    public void addMyWinCount() {
        myWinCount++;
    }

    /**
     * Getter for house win count.
     * @return house win count.
     */
    public int getMyHouseWinCount() {
        return myHouseWinCount;
    }

    /**
     * Add one winning house game count.
     */
    public void addMyHouseWinCount() {
        myHouseWinCount++;
    }

    /**
     * Getter for amount of betting.
     * @return bet amount.
     */
    public int getMyBet() {
        return myBet;
    }

    /**
     * Setter for bets.
     * The user should bet more than 0.
     * @param theBet
     */
    public void setMyBet(final int theBet) {
        if (theBet <= 0) {
            throw new IllegalArgumentException("Bet must be greater than 0$");
        } else {
            myBet = theBet;
        }
    }

    /**
     * Getter for totals of two dice added together.
     * @return sum of dices.
     */
    public int getMySumOfDices() {
        return mySumOfDices;
    }

    /**
     * Roll dices method.
     */
    public void rollDices() {
        final int noFace = 6;
        myDice1 = (int) (Math.random() * noFace + 1);
        myDice2 = (int) (Math.random() * noFace + 1);
        mySumOfDices = myDice1 + myDice2;
    }

    /**
     * Getter for initial roll.
     * @return initial roll.
     */
    public boolean getMyInitialRoll() {
        return myInitialRoll;
    }

    /**
     * Setter for initial roll.
     * @param theInitialRoll
     */
    public void setMyInitialRoll(boolean theInitialRoll) {
        myInitialRoll = theInitialRoll;
    }

    /**
     * Reset the game.
     */
    public void Reset() {
        myBankBalance = 0;
        mySumOfDices = 0;
        myDice1 = 0;
        myDice2 = 0;
        myPoint = 0;
        myInitialRoll = true;
        myHouseWinCount = 0;
        myWinCount = 0;
        myBet = 0;
    }
}
