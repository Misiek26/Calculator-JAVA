package com.company;

import javax.swing.*;
import java.awt.*;

public class ButtonsFun extends JButton {
    ButtonsFun(String text){
        this.setText(text);
        this.setSize(100,500);
        this.setBackground(new Color(200,200,200));
        this.setFont(new Font("Cambria",Font.BOLD,30));
    }
}
