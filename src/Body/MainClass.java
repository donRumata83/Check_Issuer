package Body;

import Body.Model.Model;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainClass {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();

        }
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

    }
}
