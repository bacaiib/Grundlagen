import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taschenrechner extends JFrame {

    private double total1 = 0.000;
    private double total2 = 0.000;
    private double total3 = 0.000;
    private char math_operator;

    private JTextField Bildschirm;
    private JButton seven;
    private JButton four;
    private JButton one;
    private JButton clear;
    private JButton zero;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton negative;
    private JButton nine;
    private JButton six;
    private JButton three;
    private JButton prozent;
    private JButton dot;
    private JButton mul;
    private JButton min;
    private JButton plus;
    private JButton div;
    private JButton equals;
    private JPanel Main;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(Bildschirm.getText());
        Bildschirm.setText("");
    }

    public Taschenrechner() {
        setTitle("Taschenrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(Main);


        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zeroN = Bildschirm.getText() + zero.getText();
                Bildschirm.setText(zeroN);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oneN = Bildschirm.getText() + one.getText();
                Bildschirm.setText(oneN);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String twoN = Bildschirm.getText() + two.getText();
                Bildschirm.setText(twoN);
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String threeN = Bildschirm.getText() + three.getText();
                Bildschirm.setText(threeN);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fourN = Bildschirm.getText() + four.getText();
                Bildschirm.setText(fourN);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fiveN = Bildschirm.getText() + five.getText();
                Bildschirm.setText(fiveN);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sixN = Bildschirm.getText() + six.getText();
                Bildschirm.setText(sixN);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sevenN = Bildschirm.getText() + seven.getText();
                Bildschirm.setText(sevenN);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eightN = Bildschirm.getText() + eight.getText();
                Bildschirm.setText(eightN);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nineN = Bildschirm.getText() + nine.getText();
                Bildschirm.setText(nineN);
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Bildschirm.getText().isEmpty()) {
                    Bildschirm.setText("0.");
                } else if (Bildschirm.getText().contains(".")){
                    dot.setEnabled(false);
                } else {
                    String dotN = Bildschirm.getText() + ".";
                    Bildschirm.setText(dotN);
                }
                dot.setEnabled(true);
            }
        });

        prozent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    total3 /= 100;
                    Bildschirm.setText(String.valueOf(total1));
                }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = plus.getText();
                getOperator(button_text);
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(Bildschirm.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(Bildschirm.getText());
                        break;
                    case '*':
                        total2 = total2 * Double.parseDouble(Bildschirm.getText());
                        break;
                    case '/':
                        total2 = total2 / Double.parseDouble(Bildschirm.getText());
                        break;

                }
                Bildschirm.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                Bildschirm.setText("");
            }
        });

        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = min.getText();
                getOperator(button_text);
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = mul.getText();
                getOperator(button_text);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = div.getText();
                getOperator(button_text);
            }
        });

    }

    public static void main(String[] args) {
        new Taschenrechner();
    }
}
