/**
 * Course: TCSS 305 C, Programming Practicum
 * Instructor: Tom Capaul
 * Programming Assignment 6: Basic GUI - The Game of Craps
 *
 * This CrapsWelcome class is entry window/instruction
 * window where is the intro of the Craps game.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Sopheanith Ny
 * @version Autumn 2023
 *
 * Represent the instruction of the games.
 */
public class CrapsWelcome {
    /**
     * Instance field of the frame.
     */
    private JFrame myFrame;
    /**
     * Instance field of the button.
     */
    private JButton myButton;
    /**
     * Instance field of the label.
     */
    private JLabel myLabel;
    /**
     * Instance field of the text label.
     */
    private JPanel myTextLabel;
    /**
     * Instance field of the gui size center of the screen.
     */
    private static Dimension myGuiScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Instance field of the image icon.
     */
    private ImageIcon myImage = new ImageIcon("dice_logo.png");

    /**
     * Constructor of the Craps Welcome window.
     */
    public CrapsWelcome() {
        myFrame = new JFrame("Game of Craps");
        myButton = new JButton("Starts");
        myLabel = new JLabel("Welcome to The Game of Craps!");
        //add the text to the gui panel.
        myTextLabel = new JPanel();
        myTextLabel.setLayout(new BoxLayout(myTextLabel, BoxLayout.Y_AXIS));
        Font boldFont = new Font(null, Font.BOLD, 15);
        JLabel label1 = new JLabel(" ** Before You Hit the Starts Button, " +
                "Please Read the Instruction Carefully. **");
        label1.setFont(boldFont);
        JLabel label2 = new JLabel("    -Read the Rule and Instruction of Game by " +
                "Click the Help Menu Button.");
        label2.setFont(boldFont);
        JLabel label3 = new JLabel("                -ALWAYS Set Your Bank Amount " +
                "Before Playing!!!");
        label3.setFont(boldFont);
        JLabel label4 = new JLabel("                           " +
                "         ** GOOD LUCK! HAVE FUN **");
        label4.setFont(boldFont);

        myTextLabel.add(label1);
        myTextLabel.add(label2);
        myTextLabel.add(label3);
        myTextLabel.add(label4);
        myFrame.add(myTextLabel);
        myTextLabel.setBounds(50,200,600,100);
        //Setting up the text instruction in the center of the frame
        myFrame.setBounds(50,15,700,500);
        myFrame.setLayout(new BorderLayout());
        myFrame.add(myTextLabel, BorderLayout.CENTER);

        //Setting up the gui image.
        Image orginalImage = myImage.getImage();
        Image resizedImage = orginalImage.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        myLabel.setIcon(resizedImageIcon);
        myLabel.setBounds(20,10,700,500);
        myLabel.setVerticalAlignment(JLabel.TOP);
        myLabel.setFont(new Font(null, Font.BOLD, 25));
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        myFrame.getContentPane().add(myButton);

        //Setting up the Start gui button.
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.dispose();
                new CrapsGUI();
            }
        });
        myButton.setBounds(300, 380, 100,25);
        myButton.setVisible(true);
        //Setting up Gui Frame.
        myFrame.add(myLabel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(700,500);
        myFrame.setLocation(myGuiScreenSize.width/2 - myFrame.getWidth()/2,
                myGuiScreenSize.height/2 - myFrame.getHeight()/2);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }

}
