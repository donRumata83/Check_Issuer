import View.View;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainClass {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();

        }
        View view = new View();
    }
}
