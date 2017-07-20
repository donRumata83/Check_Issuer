package Body.Listeners;

import Body.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveAndPrintButtonListener implements ActionListener {
    private View view;

    public SaveAndPrintButtonListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "save":
                view.save();
                break;
            case "print": {
                view.save();
                view.print();
                break;
            }
        }
    }
}
