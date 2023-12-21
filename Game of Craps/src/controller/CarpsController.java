/**
 * Course: TCSS 305 C, Programming Practicum
 * Instructor: Tom Capaul
 * Programming Assignment 6: Basic GUI - The Game of Craps
 *
 * This CrapsController class is the main class to
 * start the Craps game.
 */
package controller;

import view.CrapsWelcome;
/**
 * @author Sopheanith Ny
 * @version Autumn 2023
 *
 * Represent to run the Craps game.
 */
public class CarpsController {
    public static void main(final String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new CrapsWelcome();
        });
    }
}
