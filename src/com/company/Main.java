package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator ver.1.0");
        frame.setSize(380,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(98,150));
        frame.add(display, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
