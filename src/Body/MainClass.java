package Body;

import Body.Model.Model;
import Body.Model.Parser.SimpleFileParser;

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
        model.setParser(new SimpleFileParser("e://1.txt"));
        Controller controller = new Controller(model);
        View view = new View(controller);
        model.setView(view);

    }
}
