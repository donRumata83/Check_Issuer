package Body.Listeners;

import Body.View;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextFieldsFocusListener implements FocusListener{
    private JTextField field;

    public TextFieldsFocusListener(JTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().equals(View.ENTER_VALUE)) field.setText("");
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().equals("") ) field.setText(View.ENTER_VALUE);
    }
}
