package Game;

import javax.swing.*;
import java.awt.*;

public class UI {

        JFrame gameWindow = new JFrame();
        JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
        JLabel titleNameLabel, hpLabel, hpNumberLabel;
        JButton startButton, choice1, choice2, choice3, choice4;
        JTextArea mainTextArea;
        Font titleFont = new Font("Times New Roman", Font.BOLD,90);
        Font normalFont = new Font("Times New Roman",Font.PLAIN,26);

    public void createUI() {

        //GAME WINDOW

        gameWindow.setSize(800, 600);
        gameWindow.getContentPane().setBackground(Color.black);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLayout(null); // disabled layout to make my own
        // to make it appear

        // TITLE SCREEN
            //Title
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.darkGray);
        titleNameLabel = new JLabel("The Game");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

            //Start Button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButtonPanel.add(startButton);

        gameWindow.add(titleNamePanel);
        gameWindow.add(startButtonPanel);


        // GAME SCREEN
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        gameWindow.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");

        gameWindow.setVisible(true);
    }


}
