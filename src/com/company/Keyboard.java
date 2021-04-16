package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Keyboard extends JPanel {
    Keyboard(){

        this.setLayout(new GridLayout(4,4));
        Border border = BorderFactory.createLineBorder(Color.black,2);
        this.setBorder(border);

        this.add(new ButtonsFun("C"));
        this.add(new ButtonsFun("x2"));
        this.add(new ButtonsFun("/"));
        this.add(new ButtonsFun("*"));

        this.add(new ButtonsNum("7"));
        this.add(new ButtonsNum("8"));
        this.add(new ButtonsNum("9"));
        this.add(new ButtonsFun("-"));

        this.add(new ButtonsNum("4"));
        this.add(new ButtonsNum("5"));
        this.add(new ButtonsNum("6"));
        this.add(new ButtonsFun("+"));

        this.add(new ButtonsNum("1"));
        this.add(new ButtonsNum("2"));
        this.add(new ButtonsNum("3"));
        this.add(new ButtonsFun("="));
    }
}
