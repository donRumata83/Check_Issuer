package View;

import Listeners.FindButtonListener;
import Listeners.NewButtonListener;
import Listeners.SaveAndPrintButtonListener;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private JPanel topPanel;
    private JPanel mainPanel;
    private JPanel savePrintPanel;


    public View() throws HeadlessException {
        super("Программа для выписки чеков");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 520);
        this.setMinimumSize(new Dimension(800, 520));
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout(2, 10));
        this.topPanel = addTopPanelWithButtons();
        this.getContentPane().add(topPanel, BorderLayout.NORTH);

        this.mainPanel = addMainPanel();
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);

        this.savePrintPanel = addSavePrintPanel();
        this.getContentPane().add(savePrintPanel, BorderLayout.SOUTH);




        this.setVisible(true);

    }

    private JPanel addTopPanelWithButtons (){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setSize(800, 100);

        JButton newButton = new JButton("New check");
        newButton.setActionCommand("new");
        newButton.addActionListener(new NewButtonListener());
        panel.add(newButton);


        JButton findButton = new JButton("Find check..");
        findButton.setActionCommand("find");
        findButton.addActionListener(new FindButtonListener());
        panel.add(findButton);
        return panel;
    }

    private JPanel addMainPanel () {
        JPanel panel = new JPanel();
        panel.setSize(800, 300);


        return panel;
    }

    private JPanel addSavePrintPanel() {
        JPanel panel = new JPanel();
        SaveAndPrintButtonListener listener = new SaveAndPrintButtonListener();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.setSize(800, 100);

        JButton save = new JButton("Save");
        save.setActionCommand("save");
        save.addActionListener(listener);
        panel.add(save);

        JButton print = new JButton("Print");
        print.addActionListener(listener);
        print.setActionCommand("print");
        panel.add(print);

        return panel;
    }

}
