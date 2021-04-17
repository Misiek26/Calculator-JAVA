package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsFun extends JButton implements ActionListener {
    ButtonsFun(String text){
        this.setText(text);
        this.setSize(100,500);
        this.setBackground(new Color(200,200,200));
        this.setFont(new Font("Cambria",Font.BOLD,30));
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
