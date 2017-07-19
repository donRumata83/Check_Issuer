package View;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{


    public View() throws HeadlessException {
        super("Программа для выписки чеков");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(500, 520);
        this.setMinimumSize(new Dimension(500, 520));
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout(2, 10));


    }
}
