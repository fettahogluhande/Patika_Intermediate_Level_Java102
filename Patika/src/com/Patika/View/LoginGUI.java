package com.Patika.View;

import com.Patika.Helper.Config;
import com.Patika.Helper.Helper;
import com.Patika.Model.Operator;
import com.Patika.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_user_uname;
    private JButton btn_login;
    private JPasswordField fld_user_pass;

    public LoginGUI(){
        add(wrapper);
        setSize(1000,500);
        setLocation(Helper.screenCenterLocation("x",getSize()), Helper.screenCenterLocation("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        //setResizable(false);
        setVisible(true);

        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)){
                Helper.showMsg("fill");
            }else {
                User u = User.getFetch(fld_user_uname.getText(), new String(fld_user_pass.getPassword()));
                if (u == null){
                    Helper.showMsg("Kullanıcı bulunamadı");
                }else {
                    switch (u.getType()){
                        case "operator":
                            OperatorGUI opGUI = new OperatorGUI((Operator)u);
                            break;
                        case "educator":
                            EducatorGUI edGUI = new EducatorGUI();
                            break;
                        case "student":
                            StudentGUI stGUI = new StudentGUI();
                            break;
                    }
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI login = new LoginGUI();
    }
}
