package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    // 2. Formular_Elemente deklarieren
    JPanel contentPane;

    JLabel lblAlterJahren;
    JTextField tfAlterJahre;
    JButton btnBerechnen;
    JLabel lblAusgabe;
    JButton btnReset;

    public Window() {
        this.setSize(800, 600);
        this.setTitle("GUI");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(get_Lab());


        contentPane = new JPanel();
        contentPane.setLayout(null); // Kein Layout-Manager nutzen
        this.setContentPane(contentPane);
        //contentPane.setBackground(Color.RED);

        // 3. alle Formular-Elemente initialisieren
        lblAlterJahren = new JLabel("Alter in Jahre");
        tfAlterJahre = new JTextField();
        btnBerechnen = new JButton("Berechnen");
        lblAusgabe = new JLabel("...");
        btnReset = new JButton("Reset");

        // 4. Formular_Elemente auf das ContentPane legen
        contentPane.add(lblAlterJahren);
        contentPane.add(tfAlterJahre);
        contentPane.add(btnBerechnen);
        contentPane.add(lblAusgabe);
        contentPane.add(btnReset);

        // 5. Größe und Position der Formular-Elemente
        lblAlterJahren.setBounds(50, 50, 100, 25);
        tfAlterJahre.setBounds(130, 50, 50, 25);
        btnBerechnen.setBounds(185, 50, 40, 25);
        lblAusgabe.setBounds(50, 110, 200, 25);
        btnReset.setBounds(190, 110, 40, 25);

        // Button mit Funktionalität versehen
        btnBerechnen.addActionListener(this);
        btnReset.addActionListener(this);
    }

    private static Label get_Lab() {
        Label label = new Label("Typisch Andy");
        label.setAlignment(Label.CENTER);
        return label;
    }


    public static void main(String[] args) {
//        Window window = new Window();
//        window.setVisible(true);
        new Window().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnBerechnen)) {
            //System.out.println("Klick");
            int alterInJahren = Integer.parseInt(tfAlterJahre.getText());
            int berechnung = alterInJahren * 365;
            lblAusgabe.setText("Sie sind " + berechnung + " Tage alt.");
        } else if (e.getSource().equals(btnReset)) {
            tfAlterJahre.setText("");
            lblAusgabe.setText("...");
        }
    }
}
