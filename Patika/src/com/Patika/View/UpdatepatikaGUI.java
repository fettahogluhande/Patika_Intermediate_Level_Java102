package com.Patika.View;

import com.Patika.Helper.Config;
import com.Patika.Helper.Helper;
import com.Patika.Model.Patika;

import javax.swing.*;

public class UpdatepatikaGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private Patika patika;

    public UpdatepatikaGUI(Patika patika) {
        this.patika = patika;
        add(wrapper);
        setSize(300,150);
        setLocation(Helper.screenCenterLocation("x",getSize()),Helper.screenCenterLocation("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        fld_patika_name.setText(patika.getName());

        btn_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)){
                Helper.showMsg("fill");
            }else{
                if (Patika.update(patika.getId(),fld_patika_name.getText())){
                    Helper.showMsg("done");
                }
                dispose();
            }
        });
    }
}
