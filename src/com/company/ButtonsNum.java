package com.company;

import javax.swing.*;
import java.awt.*;

public class ButtonsNum extends JButton {
    ButtonsNum(String text){
        this.setText(text);
        this.setSize(100,500);
        this.setBackground(new Color(240,240,240));
        this.setFont(new Font("Cambria",Font.BOLD,40));
    }
}
