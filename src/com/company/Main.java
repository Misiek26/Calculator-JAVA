package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator ver.1.0");
        frame.setSize(380,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        Display display = new Display();
        display.setPreferredSize(new Dimension(98,150));
        frame.add(display, BorderLayout.NORTH);

        Keyboard keyboard = new Keyboard();
        keyboard.setPreferredSize(new Dimension(98,290));
        frame.add(keyboard, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
