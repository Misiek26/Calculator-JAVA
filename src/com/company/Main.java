package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    static Display display;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        ImageIcon icon = new ImageIcon("logo.jpg");

        frame.setSize(380,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());

        display = new Display();
        display.setPreferredSize(new Dimension(98,150));
        frame.add(display, BorderLayout.NORTH);

        Keyboard keyboard = new Keyboard();
        keyboard.setPreferredSize(new Dimension(98,290));
        frame.add(keyboard, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    //----- Function used to display numbers on the screen  ------

    public static void insertToDisplay(String num){
        display.result.setText(num);
    }
}
