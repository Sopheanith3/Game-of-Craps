/**
 * Course: TCSS 305 C, Programming Practicum
 * Instructor: Tom Capaul
 * Programming Assignment 6: Basic GUI - The Game of Craps
 *
 * This CrapsGUI class is design the front end of
 * the Craps game.
 */
package view;

import model.CrapsModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
/**
 * @author Sopheanith Ny
 * @version Autumn 2023
 *
 * Represent set up and design GUI and Listener.
 */
public class CrapsGUI extends JFrame {
    /**
     * Craps Model object.
     */
    private final CrapsModel myCrapsModel;
    /**
     * Roll button for the dice.
     */
    private final JButton myRollDiceButton;
    /**
     * Play Again button.
     */
    private final JButton myPlayAgainButton;
    /**
     * Start the game button.
     */
    private final JButton myStartButton;
    /**
     * Reset the game button.
     */
    private final JButton myResetButton;
    /**
     * Set bank money button.
     */
    private final JButton mySetBankButton;
    /**
     * One dollar bet button.
     */
    private final JButton myAdd1Button;
    /**
     * Five dollar bet button.
     */
    private final JButton myAdd5Button;
    /**
     * Ten dollar bet button.
     */
    private final JButton myAdd10Button;
    /**
     * Fifty dollar bet button.
     */
    private final JButton myAdd50Button;
    /**
     * One hundred dollar bet button.
     */
    private final JButton myAdd100Button;
    /**
     * Five hundred dollar bet button.
     */
    private final JButton myAdd500Button;
    /**
     * Show player point text field.
     */
    private final JTextField myPointText;
    /**
     * Show dice one value text fields.
     */
    private final JTextField myDice1Text;
    /**
     * Show dice two value text fields.
     */
    private final JTextField myDice2Text;
    /**
     * Show the sum of the two dices text fields.
     */
    private final JTextField myTotalDiceText;
    /**
     * Show player wins the dice game total text fields.
     */
    private final JTextField myPlayerWinText;
    /**
     * Show house wins the game total text fields.
     */
    private final JTextField myHouseWinText;
    /**
     * Show total bank balance text fields.
     */
    private final JTextField myBalanceText;
    /**
     * Show amount bets text fields.
     */
    private final JTextField myBetText;
    /**
     * Show first dice icon.
     */
    private final JLabel myDice1Icon;
    /**
     * Show second dice icon.
     */
    private final JLabel myDice2Icon;
    /**
     * Show the result of the dice.
     */
    private final JLabel myResultDice;
    /**
     * Start menus of the game.
     */
    private final JMenuItem myStartMenu;
    /**
     * Reset menus of the game.
     */
    private final JMenuItem myResetMenu;
    /**
     * Exit menus of the game.
     */
    private final JMenuItem myExitMenu;
    /**
     * About menus of the game.
     */
    private final JMenuItem myAboutMenu;
    /**
     * Rule menus of the game.
     */
    private final JMenuItem myRuleMenu;
    /**
     * Shortcut menus of the game.
     */
    private final JMenuItem myShortcutMenu;
    /**
     * The dimension size of the screen center.
     */
    private static final  Dimension myCenterScreen = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * The dimension size of the buttons.
     */
    private static final Dimension myButtonSize = new Dimension(80,20);
    /**
     * Image for unknown mystery dice.
     */
    private final ImageIcon DICE = new ImageIcon("dice_mystery.png");
    /**
     * Dice one icon.
     */
    private final ImageIcon DICE_ONE = new ImageIcon("dice_one.png");
    /**
     * Dice two icon.
     */
    private final ImageIcon DICE_TWO = new ImageIcon("dice_two.png");
    /**
     * Dice three icon.
     */
    private final ImageIcon DICE_THREE = new ImageIcon("dice_three.png");
    /**
     * Dice four icon.
     */
    private final ImageIcon DICE_FOUR = new ImageIcon("dice_four.png");
    /**
     * Dice five icon.
     */
    private final ImageIcon DICE_FIVE = new ImageIcon("dice_five.png");
    /**
     * Dice six icon.
     */
    private final ImageIcon DICE_SIX = new ImageIcon("dice_six.png");
    /**
     * Sad gif for exit menu.
     */
    private final ImageIcon Sad_Icon = new ImageIcon("sad_image.gif");
    /**
     * Kai dancing gif for about menu.
     */
    private final ImageIcon Kai_Icon = new ImageIcon("kai_image.gif");
    /**
     * Rule gif for a rule menu.
     */
    private final ImageIcon Rule_Icon = new ImageIcon("rule_image.gif");
    /**
     * Broke gif for zero balance.
     */
    private final ImageIcon Broke_Icon = new ImageIcon("broke_image.gif");
    /**
     * Bank image for the amount text field.
     */
    private final ImageIcon Bank_Icon = new ImageIcon("bank_image.jpeg");
    /**
     * Money image.
     */
    private final ImageIcon Money_Icon = new ImageIcon("money_image .jpeg");
    /**
     * Speed sad for lost the game.
     */
    private final ImageIcon Speed_Icon = new ImageIcon("speed_sad.gif");
    /**
     * Speed rage for winning the game.
     */
    private final ImageIcon SpeedRage_Icon = new ImageIcon("speed_rage.gif");
    /**
     * Constructor the CrapsGui.
     */
    public CrapsGUI() {
        super("The Game Of Craps");
        myCrapsModel = new CrapsModel();

        myResetButton = new JButton("Reset");
        myStartButton = new JButton("Start");
        myRollDiceButton = new JButton("Roll Dice");
        myRollDiceButton.setMnemonic(KeyEvent.VK_R);
        myPlayAgainButton = new JButton("Play Again");
        myPlayAgainButton.setMnemonic(KeyEvent.VK_A);
        mySetBankButton = new JButton("Set Bank");
        myAdd1Button = new JButton("+$1");
        myAdd5Button = new JButton("+$5");
        myAdd10Button = new JButton("+$10");
        myAdd50Button = new JButton("+$50");
        myAdd100Button = new JButton("+$100");
        myAdd500Button = new JButton("+$500");

        myPointText = new JTextField();
        myDice1Text = new JTextField();
        myDice2Text = new JTextField();
        myTotalDiceText = new JTextField();
        myPlayerWinText = new JTextField();
        myHouseWinText = new JTextField();
        myBalanceText = new JTextField();
        myBetText = new JTextField();

        myDice1Icon = new JLabel();
        myDice2Icon = new JLabel();
        myResultDice = new JLabel();

        myStartMenu = new JMenuItem("Start");
        myStartMenu.setMnemonic(KeyEvent.VK_S);
        myResetMenu = new JMenuItem("Reset");
        myResetMenu.setMnemonic(KeyEvent.VK_R);
        myExitMenu = new JMenuItem("Exit");
        myExitMenu.setMnemonic(KeyEvent.VK_E);
        myAboutMenu = new JMenuItem("About");
        myRuleMenu = new JMenuItem("Rules");
        myShortcutMenu = new JMenuItem("Shortcuts");

        setSize(700,450);
        setLocation(myCenterScreen.width/2 -getWidth()/2,
                myCenterScreen.height/2 - getHeight()/2);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar();
        menuBarListener();
        guiSetup();
        addListener();
        resetPoint();
    }

    /**
     * Set up the roll panel for the center panel of the game.
     * @return roll panel.
     */
    private JPanel rollPanel() {
        final JPanel rollPanel = new JPanel();
        rollPanel.setLayout(new BoxLayout(rollPanel, BoxLayout.PAGE_AXIS));
        final JPanel resultPanel = new JPanel(new FlowLayout());
        final JPanel dicePanel = new JPanel(new FlowLayout());

        myDice1Text.setPreferredSize(myButtonSize);
        myDice1Text.setEditable(false);
        myDice2Text.setPreferredSize(myButtonSize);
        myDice2Text.setEditable(false);

        resultPanel.add(myResultDice);
        dicePanel.add(myDice1Icon);
        dicePanel.add(myDice2Icon);

        rollPanel.add(resultPanel);
        rollPanel.add(dicePanel);
        rollPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.RED));
        return rollPanel;
    }

    /**
     * Set up the bottom panel for the game panel.
     * @return bottom panel.
     */
    private JPanel bottomPanel() {
        final JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        final JPanel winTotalPanel = new JPanel();
        winTotalPanel.setLayout(new BoxLayout(winTotalPanel, BoxLayout.PAGE_AXIS));
        final JPanel playerPanel = new JPanel(new FlowLayout());
        final JPanel housePanel = new JPanel(new FlowLayout());

        final JLabel playerLabel = new JLabel("Player Win Total: ");
        final JLabel houseLabel = new JLabel("House Win Total: ");

        myPlayerWinText.setPreferredSize(myButtonSize);
        myPlayerWinText.setEditable(false);
        myHouseWinText.setPreferredSize(myButtonSize);
        myHouseWinText.setEditable(false);

        playerPanel.add(playerLabel);
        playerPanel.add(myPlayerWinText);
        housePanel.add(houseLabel);
        housePanel.add(myHouseWinText);

        winTotalPanel.add(playerPanel);
        winTotalPanel.add(housePanel);
        winTotalPanel.setBorder(BorderFactory.createTitledBorder("Win Totals"));
        bottomPanel.add(winTotalPanel, BorderLayout.CENTER);
        bottomPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.RED));
        return bottomPanel;
    }
    /**
     * Set up the top gui for the top panel.
     * @return top panel.
     */
    private JPanel topPanel() {
        final JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.X_AXIS));

        final JPanel totalPanel = new JPanel(new FlowLayout());
        final JPanel pointPanel = new JPanel(new FlowLayout());
        final JLabel totalLabel = new JLabel("Total: ");
        final JLabel pointLabel = new JLabel("Point: ");

        myTotalDiceText.setPreferredSize(myButtonSize);
        myTotalDiceText.setEditable(false);
        myPointText.setPreferredSize(myButtonSize);
        myPointText.setEditable(false);

        totalPanel.add(totalLabel);
        totalPanel.add(myTotalDiceText);
        pointPanel.add(pointLabel);
        pointPanel.add(myPointText);

        topPanel.add(totalPanel);
        topPanel.add(pointPanel);
        topPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.RED));
        return topPanel;
    }
    /**
     * Set up the gui button for the left panel.
     * @return left button panel.
     */
    private JPanel leftButtonPanel(){
        final JPanel leftButtonPanel = new JPanel();
        leftButtonPanel.setLayout(new BoxLayout(leftButtonPanel, BoxLayout.Y_AXIS));
        final JPanel playAgainPanel = new JPanel();
        final JPanel rollButtonPanel = new JPanel();
        final JPanel startButtonPanel = new JPanel();
        final JPanel resetButtonPanel = new JPanel();

        resetButtonPanel.add(myResetButton);
        myResetButton.setPreferredSize(new Dimension(80,50));
        startButtonPanel.add(myStartButton);
        myStartButton.setPreferredSize(new Dimension(80,50));
        playAgainPanel.add(myPlayAgainButton);
        myPlayAgainButton.setPreferredSize(new Dimension(80,50));
        rollButtonPanel.add(myRollDiceButton);
        myRollDiceButton.setPreferredSize(new Dimension(80, 50));

        leftButtonPanel.add(startButtonPanel);
        leftButtonPanel.add(rollButtonPanel);
        leftButtonPanel.add(resetButtonPanel);
        leftButtonPanel.add(playAgainPanel);
        leftButtonPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.RED));

        return leftButtonPanel;
    }

    /**
     * Set up the gui for the bank amount panel.
     * @return bank panel.
     */
    private JPanel setBankPanel() {
        final JPanel setBankPanel = new JPanel();
        setBankPanel.setLayout(new BoxLayout(setBankPanel, BoxLayout.PAGE_AXIS));
        final JPanel amountPanel = new JPanel(new FlowLayout());
        final JPanel bankButtonPanel = new JPanel(new FlowLayout());
        final JLabel amountText = new JLabel("Amount: $");

        myBalanceText.setPreferredSize(myButtonSize);
        amountPanel.add(amountText);
        amountPanel.add(myBalanceText);
        bankButtonPanel.add(mySetBankButton);

        setBankPanel.setBorder(BorderFactory.createTitledBorder("Bank"));
        setBankPanel.add(amountPanel);
        setBankPanel.add(bankButtonPanel);
        return setBankPanel;
    }

    /**
     * Set up the gui for the bet amount panel.
     * @return bet panel.
     */
    private JPanel betPanel() {
        final JPanel betPanel = new JPanel();
        betPanel.setLayout(new BoxLayout(betPanel, BoxLayout.PAGE_AXIS));
        betPanel.setBorder(BorderFactory.createTitledBorder("Bet"));
        final JPanel betTextPanel = new JPanel(new FlowLayout());
        final JPanel oneDollarButton = new JPanel(new FlowLayout());
        final JPanel fiveDollarButton = new JPanel(new FlowLayout());
        final JPanel tenDollarButton = new JPanel(new FlowLayout());
        final JPanel fiftyDollarButton = new JPanel(new FlowLayout());
        final JPanel oneHunDollarButton = new JPanel(new FlowLayout());
        final JPanel fiveHunDollarButton = new JPanel(new FlowLayout());
        final JLabel amountText = new JLabel("Bet: $");

        oneDollarButton.add(myAdd1Button);
        fiveDollarButton.add(myAdd5Button);
        tenDollarButton.add(myAdd10Button);
        fiftyDollarButton.add(myAdd50Button);
        oneHunDollarButton.add(myAdd100Button);
        fiveHunDollarButton.add(myAdd500Button);

        myBetText.setPreferredSize(myButtonSize);
        betTextPanel.add(amountText);
        betTextPanel.add(myBetText);

        betPanel.add(betTextPanel);
        betPanel.add(oneDollarButton);
        betPanel.add(fiveDollarButton);
        betPanel.add(tenDollarButton);
        betPanel.add(fiftyDollarButton);
        betPanel.add(oneHunDollarButton);
        betPanel.add(fiveHunDollarButton);
        return betPanel;
    }
    /**
     * Set up the gui for the right panel,
     * that have bet and bank panel.
     * @return right panel.
     */
    private JPanel rightPanel() {
        final JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(betPanel(), BorderLayout.SOUTH);
        rightPanel.add(setBankPanel(),BorderLayout.WEST);
        rightPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.RED));
        return rightPanel;
    }

    /**
     * Set up the gui for the center panel,
     * that have dice icon, total house win and player
     * win, and total dice and point.
     * @return
     */
    private JPanel centerPanel() {
        final JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(topPanel(), BorderLayout.NORTH);
        centerPanel.add(rollPanel(), BorderLayout.CENTER);
        centerPanel.add(bottomPanel(), BorderLayout.SOUTH);
        return centerPanel;
    }

    /**
     * Set up the gui for the left panel, that
     * have the button.
     * @return left panel.
     */
    private JPanel leftPanel() {
        final JPanel leftPanel = new JPanel();
        leftPanel.add(leftButtonPanel(), BorderLayout.CENTER);
        return leftPanel;
    }

    /**
     * Set up the gui container.
     */
    private void guiSetup() {
        final Container mainContainer = getContentPane();
        mainContainer.setLayout(new BorderLayout());
        mainContainer.add(centerPanel(), BorderLayout.CENTER);
        mainContainer.add(leftPanel(), BorderLayout.WEST);
        mainContainer.add(rightPanel(), BorderLayout.EAST);
    }

    /**
     * Set up the gui menu bar, that main menu has
     * game and help.
     */
    private void menuBar(){
        final JMenuBar menuBar = new JMenuBar();
        final JMenu gameBar = new JMenu("Game");
        menuBar.add(gameBar);
        final JMenu helpBar = new JMenu("Help");
        menuBar.add(helpBar);
        gameBar.add(myStartMenu);
        gameBar.add(myResetMenu);
        gameBar.add(myExitMenu);
        helpBar.add(myAboutMenu);
        helpBar.add(myRuleMenu);
        helpBar.add(myShortcutMenu);
        setJMenuBar(menuBar);
    }

    /**
     * Set up the menu function key listener.
     */
    private void menuBarListener(){
        myStartMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                startGame();
            }
        });
        myExitMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                final int jOption = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to Exit?", "Exit",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,Sad_Icon);
                if (jOption == JOptionPane.YES_NO_OPTION) {
                    dispose();
                }
            }
        });
        myResetMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myCrapsModel.Reset();
                resetPoint();
            }
        });
        myAboutMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                Image image = Kai_Icon.getImage().getScaledInstance(200,210,Image.SCALE_DEFAULT);
                ImageIcon resizeKaiImage = new ImageIcon(image);
                JOptionPane.showMessageDialog(null, "Game: Game of Carps.\n" +
                                "Author: Sopheanith Ny.\nVersion: 1.0.\nJDK: Java 19.", "About",
                        JOptionPane.INFORMATION_MESSAGE, resizeKaiImage);
            }
        });
        myRuleMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                final String gameRule = "** The rules of the Game " +
                        "of Craps are as follows: **\n. A player rolls two dice where each die has six\n" +
                        "faces in the usual way (values 1 through 6).\n. After dice have come to rest the sum of " +
                        "the two upward faces is calculated.\n. The first roll/throw :\n\t - If the sum is 7 or " +
                        "11 on the first " + "throw the roller/player wins.\n" +
                        "\t - If the sum is 2, 3 or 12 the roller/player loses, " +
                        "that is the house wins.\n\t - If the sum is 4, 5, 6, 8, 9, or 10, that sum becomes the" +
                        " roller/player's 'point'.\n \t\t\t  Continue rolling given the player's point\n " +
                        "\t\t\t  Now the player must roll the 'point' total before rolling a 7 in order to win.\n " +
                        "\t\t\t  If they roll a 7 before rolling the point\n\t\t\t   value they got on the first" +
                        "roll the roller/player loses (the 'house' wins).";

                Image image = Rule_Icon.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
                ImageIcon resizeKaiImage = new ImageIcon(image);
                JOptionPane.showMessageDialog(null,gameRule, "Rule",
                        JOptionPane.INFORMATION_MESSAGE,resizeKaiImage);
            }
        });
        myShortcutMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                JOptionPane.showMessageDialog(null,"ALT + S = Start.\n" +
                                "ALT + R = Reset.\nALT + E = Exit.","Shortcuts",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
    /**
     * Set up the gui listener to the components.
     */
    public void addListener() {
        myAdd1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(1);
            }
        });
        myAdd5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(5);
            }
        });
        myAdd10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(10);
            }
        });
        myAdd50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(50);
            }
        });
        myAdd100Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(100);
            }
        });
        myAdd500Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                intBetButton(500);
            }
        });
        myPlayAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                startGame();
            }
        });
        myStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                startGame();
            }
        });
        myResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myCrapsModel.Reset();
                resetPoint();
            }
        });
        myRollDiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                final int betAmount = myCrapsModel.getMyBet();
                final int sumOfDices = rollDice();
                if (myCrapsModel.getMyInitialRoll()) {
                    if (sumOfDices == 7 || sumOfDices == 11) {
                        winWindow(betAmount);
                    } else if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) {
                        loseWindow(betAmount);
                    } else {
                        myPointText.setText(String.valueOf(sumOfDices));
                        myCrapsModel.setMyPoint(sumOfDices);
                        myCrapsModel.setMyInitialRoll(false);
                    }
                } else {
                    if (sumOfDices == 7) {
                        loseWindow(betAmount);
                    } else if (sumOfDices == myCrapsModel.getMyPoint()) {
                        winWindow(betAmount);
                    }
                }
            }
        });
        mySetBankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                final String textValue = myBalanceText.getText();
                if (!positiveInteger(textValue)) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter a value that is more than 0",
                            "Set Bank Amount", JOptionPane.INFORMATION_MESSAGE, Bank_Icon);
                } else {
                    final int bankValue = Integer.parseInt(textValue);
                    myStartMenu.setEnabled(true);
                    myCrapsModel.setMyBankBalance(bankValue);
                    myBalanceText.setEditable(false);
                    mySetBankButton.setEnabled(false);
                    enableBetButton(true);
                }
            }
        });
    }

    /**
     * Set up gui pop-up message when win the game.
     * Also, helper method when the player wins the game.
     * @param theBet
     */
    private void winWindow(final int theBet) {
        JOptionPane.showMessageDialog(null, "You Win! $" + theBet
                + "\nPlease Bets to play again! Good luck:)", "Win",
                JOptionPane.PLAIN_MESSAGE, SpeedRage_Icon);
        myCrapsModel.setMyBankBalance(theBet);
        myCrapsModel.setMyInitialRoll(true);
        myCrapsModel.addMyWinCount();
        myBalanceText.setText(String.valueOf(myCrapsModel.getMyBankBalance()));
        myPlayerWinText.setText(String.valueOf(myCrapsModel.getMyWinCount()));
        pauseGamePlay();
    }

    /**
     * Set up gui pop-up message when lose the game.
     * Also, helper method when the player loses the game.
     * @param theBet
     */
    private void loseWindow(final int theBet) {
        JOptionPane.showMessageDialog(null, "You Lose! -$"
                + theBet + "\nPlease bets to play again! GoodLuck! :)",
                "Lose", JOptionPane.PLAIN_MESSAGE,Speed_Icon);
        myCrapsModel.setMyBankBalance(-theBet);
        myCrapsModel.setMyInitialRoll(true);
        myCrapsModel.addMyHouseWinCount();
        myBalanceText.setText(String.valueOf(myCrapsModel.getMyBankBalance()));
        myHouseWinText.setText(String.valueOf(myCrapsModel.getMyHouseWinCount()));
        if (myCrapsModel.getMyBankBalance() < 1) {
            JOptionPane.showMessageDialog(null,"Don't have enough money to Bet :(",
                    "Game Over",JOptionPane.INFORMATION_MESSAGE, Broke_Icon);
            myCrapsModel.Reset();
            resetPoint();
        } else {
            pauseGamePlay();
        }
    }

    /**
     * Helper method for the roll dice button.
     * @return total sum of the dices.
     */
    private int rollDice() {
        myCrapsModel.rollDices();
        int dice1 = myCrapsModel.getMyDice1();
        int dice2 = myCrapsModel.getMyDice2();
        myDice1Text.setText(String.valueOf(myCrapsModel.getMyDice1()));
        myDice2Text.setText(String.valueOf(myCrapsModel.getMyDice2()));
        myTotalDiceText.setText(String.valueOf(myCrapsModel.getMySumOfDices()));
        imageDice(dice1, myDice1Icon);
        imageDice(dice2, myDice2Icon);
        return myCrapsModel.getMySumOfDices();
    }

    /**
     * Helper method to check the game is it valid to bet
     * and start a round after.
     */
    private void startGame() {
        final String betValueText = myBetText.getText();
        if (!positiveInteger(betValueText)) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a integer bet value that is greater than 0",
                    "Bet", JOptionPane.INFORMATION_MESSAGE, Money_Icon);
        } else {
            final int betValue = Integer.parseInt(betValueText);
            if (betValue > myCrapsModel.getMyBankBalance()) {
                JOptionPane.showMessageDialog(null,
                        "Insufficient Balance", "Uh-oh!",
                        JOptionPane.INFORMATION_MESSAGE, Money_Icon);
            } else {
                myResetMenu.setEnabled(true);
                myStartMenu.setEnabled(false);
                startDiceImage();
                myResultDice.setText("");
                myPointText.setText("");
                myTotalDiceText.setText("");
                myDice1Text.setText("");
                myDice2Text.setText("");
                myCrapsModel.setMyBet(betValue);
                myRollDiceButton.setEnabled(true);
                myResetButton.setEnabled(true);
                enableBetButton(false);
                myPlayAgainButton.setEnabled(false);
            }
        }
    }

    /**
     * Helper method for the dice icon when it matches the value.
     * @param theValue
     * @param theLabelImage
     */
    private void imageDice(final int theValue, final JLabel theLabelImage) {
        if (theValue == 1) {
            theLabelImage.setIcon(DICE_ONE);
        }
        if (theValue == 2) {
            theLabelImage.setIcon(DICE_TWO);
        }
        if (theValue == 3) {
            theLabelImage.setIcon(DICE_THREE);
        }
        if (theValue == 4) {
            theLabelImage.setIcon(DICE_FOUR);
        }
        if (theValue == 5) {
            theLabelImage.setIcon(DICE_FIVE);
        }
        if (theValue == 6) {
            theLabelImage.setIcon(DICE_SIX);
        }
    }

    /**
     * Helper method to set the game pause between the rounds.
     */
    private void pauseGamePlay() {
        myResetButton.setEnabled(false);
        myRollDiceButton.setEnabled(false);
        enableBetButton(true);
        myBetText.setText("");
        myPlayAgainButton.setEnabled(true);
    }

    /**
     * Helper method to set the enable/disable bet button
     * and the text field.
     * @param theValue
     */
    private void enableBetButton(final boolean theValue) {
        myBetText.setEditable(theValue);
        myAdd1Button.setEnabled(theValue);
        myAdd5Button.setEnabled(theValue);
        myAdd10Button.setEnabled(theValue);
        myAdd50Button.setEnabled(theValue);
        myAdd100Button.setEnabled(theValue);
        myAdd500Button.setEnabled(theValue);
    }

    /**
     * Helper method for the change dice icon.
     */
    private void startDiceImage() {
        Image imageDice1 = DICE.getImage().getScaledInstance(140,150,Image.SCALE_DEFAULT);
        ImageIcon resizeDiceImage = new ImageIcon(imageDice1);
        myDice1Icon.setIcon(resizeDiceImage);
        Image imageDice2 = DICE.getImage().getScaledInstance(140,150,Image.SCALE_DEFAULT);
        ImageIcon resizeDice2Image = new ImageIcon(imageDice2);
        myDice2Icon.setIcon(resizeDice2Image);
    }

    /**
     * Helper method for the reset/start point.
     */
    private void resetPoint() {
        final String empty = "";
        startDiceImage();
        myPointText.setText(empty);
        myDice1Text.setText(empty);
        myDice2Text.setText(empty);
        myTotalDiceText.setText(empty);
        myBalanceText.setText(empty);
        myBetText.setText(empty);
        myResultDice.setText(empty);
        myHouseWinText.setText("0");
        myPlayerWinText.setText("0");
        myBalanceText.setEditable(true);
        mySetBankButton.setEnabled(true);
        myRollDiceButton.setEnabled(false);
        myResetButton.setEnabled(false);
        myPlayAgainButton.setEnabled(false);
        enableBetButton(false);
        myStartMenu.setEnabled(false);
        myResetMenu.setEnabled(false);
    }

    /**
     * Helper method for the user has to input the number that has to
     * be greater than 0.
     * @param theString
     * @return true when its positive integer.
     */
    private boolean positiveInteger(final String theString) {
        try {
            final int number = Integer.parseInt(theString);
            if (number < 1) {
                return false;
            }
        } catch (NumberFormatException theException) {
            return false;
        }
        return true;
    }

    /**
     * Helper method to set up the listener for the bet button.
     * @param theValue
     */
    private void intBetButton(final int theValue) {
        final String betValueText = myBetText.getText();
        if (positiveInteger(betValueText)) {
            final int betValue = Integer.parseInt(betValueText);
            myBetText.setText(String.valueOf(betValue + theValue));
        } else {
            myBetText.setText(String.valueOf(theValue));
        }
    }
}