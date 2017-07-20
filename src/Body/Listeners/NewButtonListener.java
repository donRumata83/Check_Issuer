package Body.Listeners;

import Body.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewButtonListener implements ActionListener {
    private View view;

    public NewButtonListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int choose = JOptionPane.showConfirmDialog(null, "Do you want to save previous data?");
        switch (choose) {
            case 0:
                break;
            case 1: view.nullTheFields();
                break;
            case 2:
                break;
        }
    }
}
