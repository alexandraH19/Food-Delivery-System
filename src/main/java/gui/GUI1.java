package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUI1 extends JFrame {
    private JButton enterButton= new JButton("ENTER");
    private JButton joinButton= new JButton("JOIN");
    private JTextField enterName=new JTextField();;
    private JTextField enterPass= new JPasswordField();
    private JTextField joinName= new JTextField();;
    private JTextField joinPass= new JPasswordField();
    private JTextField joinEmail= new JTextField();
    private JTextField joinAge= new JTextField();
    private JLabel p = new JLabel("PASS:");
    private JLabel n = new JLabel("NAME:");
    private  JLabel j = new JLabel("JOIN OUR TEAM");
    private JLabel wb = new JLabel("WELCOME BACK");
    private JLabel nn = new JLabel("NAME:");
    private JLabel pp = new JLabel("PASS:");
    private JLabel ee = new JLabel("EMAIL:");
    private  JLabel aa = new JLabel("AGE:");
    private JComboBox comboBox;
    private String[] tp={"Admin","Client","Employee"};

    //=====costructor=====

    public GUI1() {

        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 255, 204));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        this.setTitle("Catering company");
        this.setSize(724, 364);


        JPanel enter1 = new JPanel();
        enter1.setBackground(new Color(204, 153, 153));
        enter1.setBounds(10, 10, 330, 295);
        panel.add(enter1);
        enter1.setLayout(null);


        wb.setBounds(73, 10, 174, 28);
        enter1.add(wb);
        wb.setForeground(Color.WHITE);
        wb.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        enterButton.setBackground(Color.WHITE);
        enterButton.setBounds(105, 174, 96, 28);
        enter1.add(enterButton);


        enterPass.setBounds(130, 117, 114, 19);
        enter1.add(enterPass);
        enterPass.setColumns(10);


        enterName.setBounds(130, 74, 114, 19);
        enter1.add(enterName);
        enterName.setColumns(10);


        p.setBounds(61, 104, 87, 44);
        enter1.add(p);
        p.setForeground(Color.WHITE);
        p.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));


        n.setBounds(61, 61, 87, 44);
        enter1.add(n);
        n.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        n.setForeground(Color.WHITE);

        JPanel joinPanel = new JPanel();
        joinPanel.setBackground(new Color(255, 204, 153));
        joinPanel.setBounds(362, 10, 330, 295);
        panel.add(joinPanel);
        joinPanel.setLayout(null);


        j.setBounds(83, 10, 171, 28);
        j.setForeground(Color.WHITE);
        j.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        joinPanel.add(j);


        nn.setForeground(Color.WHITE);
        nn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        nn.setBounds(69, 48, 77, 44);
        joinPanel.add(nn);


        pp.setForeground(Color.WHITE);
        pp.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pp.setBounds(69, 92, 77, 44);
        joinPanel.add(pp);


        joinName.setColumns(10);
        joinName.setBounds(136, 63, 114, 19);
        joinPanel.add(joinName);


        joinPass.setColumns(10);
        joinPass.setBounds(136, 102, 114, 19);
        joinPanel.add(joinPass);



        joinButton.setBackground(Color.WHITE);
        joinButton.setBounds(114, 257, 96, 28);
        joinPanel.add(joinButton);


        ee.setForeground(Color.WHITE);
        ee.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        ee.setBounds(69, 130, 87, 44);
        joinPanel.add(ee);


        aa.setForeground(Color.WHITE);
        aa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        aa.setBounds(69, 168, 87, 44);
        joinPanel.add(aa);


        joinEmail.setColumns(10);
        joinEmail.setBounds(136, 146, 114, 19);
        joinPanel.add(joinEmail);


        joinAge.setColumns(10);
        joinAge.setBounds(136, 184, 114, 19);
        joinPanel.add(joinAge);

        comboBox = new JComboBox(tp);
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(Color.BLACK);
        comboBox.setBounds(69, 215, 179, 21);
        joinPanel.add(comboBox);
    }

    public JTextField getEnterName() {
        return enterName;
    }

    public void setEnterName(JTextField enterName) {
        this.enterName = enterName;
    }

    public JTextField getEnterPass() {
        return enterPass;
    }

    public void setEnterPass(JTextField enterPass) {
        this.enterPass = enterPass;
    }

    public JTextField getJoinName() {
        return joinName;
    }

    public void setJoinName(JTextField joinName) {
        this.joinName = joinName;
    }

    public JTextField getJoinPass() {
        return joinPass;
    }

    public void setJoinPass(JTextField joinPass) {
        this.joinPass = joinPass;
    }

    public JTextField getJoinEmail() {
        return joinEmail;
    }

    public void setJoinEmail(JTextField joinEmail) {
        this.joinEmail = joinEmail;
    }

    public JTextField getJoinAge() {
        return joinAge;
    }

    public void setJoinAge(JTextField joinAge) {
        this.joinAge = joinAge;
    }

    public JButton getEnterButton() {
        return enterButton;
    }

    public void setEnterButton(JButton enterButton) {
        this.enterButton = enterButton;
    }

    public JButton getJoinButton() {
        return joinButton;
    }

    public void setJoinButton(JButton joinButton) {
        this.joinButton = joinButton;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public JFrame getFrame()
    {
        return this;
    }
}