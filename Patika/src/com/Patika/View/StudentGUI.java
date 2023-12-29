package com.Patika.View;

import com.Patika.Helper.Config;
import com.Patika.Helper.Helper;

import javax.swing.*;

public class StudentGUI extends JFrame{
    private JPanel wrapper;
    public StudentGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterLocation("x",getSize()), Helper.screenCenterLocation("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        //setResizable(false);
        setVisible(true);
    }
}
