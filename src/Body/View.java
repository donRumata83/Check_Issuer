package Body;

import Body.Listeners.FindButtonListener;
import Body.Listeners.NewButtonListener;
import Body.Listeners.SaveAndPrintButtonListener;
import Body.Listeners.TextFieldsFocusListener;
import Body.Model.Cheque;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JPanel topPanel;
    private JPanel mainPanel;
    private JPanel savePrintPanel;

    private JTextField number;
    private JTextField customer;
    private JTextField product;
    private JTextField summ;
    private JTextField cache;

    private Controller controller;

    public static final String ENTER_VALUE = "Enter value";

    public View(Controller controller) throws HeadlessException {
        super("Программа для выписки чеков");

        this.controller = controller;
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

    private JPanel addTopPanelWithButtons() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setSize(800, 100);

        JButton newButton = new JButton("New check");
        newButton.setActionCommand("new");
        newButton.addActionListener(new NewButtonListener(this));
        panel.add(newButton);


        JButton findButton = new JButton("Find check..");
        findButton.setActionCommand("find");
        findButton.addActionListener(new FindButtonListener());
        panel.add(findButton);
        return panel;
    }

    private JPanel addMainPanel() {
        JPanel panel = new JPanel();
        panel.setSize(800, 300);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));



        JPanel customerPan = new JPanel();
        customerPan.add(new JLabel("Customer"));
        this.customer = new JTextField("Физична особа", 50);
        customerPan.add(customer);
        this.number = new JTextField(controller.getNewNumber(), 10);
        number.setFocusable(false);
        customerPan.add(number);
        panel.add(customerPan);

        JPanel productPan = new JPanel();
        productPan.add(new JLabel("Product "));
        this.product = new JTextField(ENTER_VALUE, 50);
        product.addFocusListener(new TextFieldsFocusListener(product));
        product.setForeground(Color.GRAY);

        productPan.add(product);
        panel.add(productPan);


        JPanel summPane = new JPanel();
        summPane.add(new JLabel("Summ    "));
        this.summ = new JTextField(ENTER_VALUE, 50);
        summ.setForeground(Color.GRAY);
        summ.addFocusListener(new TextFieldsFocusListener(summ));
        summPane.add(summ);
        panel.add(summPane);

        JPanel cachePan = new JPanel();
        cachePan.add(new JLabel("Cache   "));
        this.cache = new JTextField(ENTER_VALUE, 50);
        cache.setForeground(Color.GRAY);
        cache.addFocusListener(new TextFieldsFocusListener(cache));
        cachePan.add(cache);
        panel.add(cachePan);

        return panel;
    }

    private JPanel addSavePrintPanel() {
        JPanel panel = new JPanel();
        SaveAndPrintButtonListener listener = new SaveAndPrintButtonListener(this);
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

    public void save() {
        controller.save(new Cheque(customer.getText(), product.getText(), number.getText(), summ.getText()));
        nullTheFields();
    }

    public void nullTheFields() {
        customer.setText("Фізична особа");
        product.setText(ENTER_VALUE);
        summ.setText(ENTER_VALUE);
        cache.setText(ENTER_VALUE);
    }

    public void print() {
        controller.print();
    }

    public void getNewNumber() {
        controller.getNewNumber();
    }


}
