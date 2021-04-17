package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Display extends JPanel {
    private static String numer;
    public JLabel result;
    Display(){
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,2);
        this.setLayout(new BorderLayout());

        JLabel name = new JLabel(); // Label which display program name
        result = new JLabel(); // Label used to display result return

        name.setText("Kalkulator prosty");
        name.setFont(new Font("Calibri",Font.BOLD,40));
        name.setPreferredSize(new Dimension(100,70));
        name.setHorizontalAlignment(JLabel.CENTER);
        name.setOpaque(true);

        result.setText("0");
        result.setHorizontalAlignment(JLabel.RIGHT);
        result.setBorder(border);
        result.setFont(new Font("Calibri", Font.PLAIN,60));
        result.setBackground(new Color(210,210,210));
        result.setOpaque(true);

        this.add(name,BorderLayout.NORTH);
        this.add(result,BorderLayout.SOUTH);

    }

    public void insert(char x){
        this.numer+=x;
        result.setText(this.numer);
    }
}
