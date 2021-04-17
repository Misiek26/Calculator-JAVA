package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsNum extends JButton implements ActionListener {
    ButtonsNum(String text){
        this.setText(text);
        this.setSize(100,500);
        this.setBackground(new Color(240,240,240));
        this.setFont(new Font("Cambria",Font.BOLD,40));
        this.setFocusable(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            Action.insert(this.getText());
        }
    }
}
