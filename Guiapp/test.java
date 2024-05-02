package Guiapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {

    private JLabel FristName;
    private JTextField textField1;
    private JButton clickButton;
    private JPanel Feld;

    public test() {
        setContentPane(Feld);
        setTitle("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);


        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(test.this, "Welcome "+firstName);
            }
        });
    }

    public static void main(String[] args) {
        new test();
    }
}
