package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

public class GUI4 extends JFrame implements Observer {
    private JButton butonIntoarcere= new JButton("Back");
    private JLabel label= new JLabel("0");
    private int con;
    private JLabel ang = new JLabel("EMPLOYEE");

    public JButton getBackButton() {
        return butonIntoarcere;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    //====constructor=====
    public GUI4() {
        this.setTitle("Employee window");
        this.setSize(270, 230);
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 255, 204));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        ang.setBounds(59, 0, 198, 61);
        ang.setForeground(new Color(220, 20, 60));
        ang.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
        panel.add(ang);

        butonIntoarcere.setBackground(Color.WHITE);
        butonIntoarcere.setBounds(67, 143, 123, 31);
        panel.add(butonIntoarcere);

        JPanel panell = new JPanel();
        panell.setBounds(84, 82, 87, 32);
        panell.setBackground(new Color(216, 191, 216));
        panel.add(panell);


        label.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
        panell.add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void update(Observable o, Object arg) {
        con++;
        label.setText(String.valueOf(con));
    }
}
