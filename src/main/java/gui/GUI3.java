package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class GUI3 extends JFrame {
    public JTextField getTitleSearchText() {
        return titleSearchText;
    }

    public void setTitleSearchText(JTextField titleSearchText) {
        this.titleSearchText = titleSearchText;
    }

    public JTextField getRatingSearchText() {
        return ratingSearchText;
    }

    public void setRatingSearchText(JTextField ratingSearchText) {
        this.ratingSearchText = ratingSearchText;
    }

    public JTextField getCaloriesSearchText() {
        return caloriesSearchText;
    }

    public void setCaloriesSearchText(JTextField caloriesSearchText) {
        this.caloriesSearchText = caloriesSearchText;
    }

    public JTextField getProteinSearchText() {
        return proteinSearchText;
    }

    public void setProteinSearchText(JTextField proteinSearchText) {
        this.proteinSearchText = proteinSearchText;
    }

    public JTextField getFatSearchText() {
        return fatSearchText;
    }

    public void setFatSearchText(JTextField fatSearchText) {
        this.fatSearchText = fatSearchText;
    }

    public JTextField getSodiumSearchText() {
        return sodiumSearchText;
    }

    public void setSodiumSearchText(JTextField sodiumSearchText) {
        this.sodiumSearchText = sodiumSearchText;
    }

    public JTextField getPriceSearchText() {
        return priceSearchText;
    }

    public void setPriceSearchText(JTextField priceSearchText) {
        this.priceSearchText = priceSearchText;
    }

    public JTextField getTitleProductOrderText() {
        return titleProductOrderText;
    }

    public void setTitleProductOrderText(JTextField titleProductOrderText) {
        this.titleProductOrderText = titleProductOrderText;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }

    public JButton getPutOnListOrderButton() {
        return putOnListOrderButton;
    }

    public void setPutOnListOrderButton(JButton putOnListOrderButton) {
        this.putOnListOrderButton = putOnListOrderButton;
    }

    public JButton getCreateButton() {
        return createButton;
    }

    public void setCreateButton(JButton createButton) {
        this.createButton = createButton;
    }

    public JButton getShowAllButton() {
        return showEvButton;
    }

    public void setShowAllButton(JButton showAllButton) {
        this.showEvButton = showAllButton;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    private JLabel ap = new JLabel("SEARCH PRODUCT");
    private JLabel ra = new JLabel("Rating:");
    private JLabel ta = new JLabel("Title:");
    private JLabel ca = new JLabel("Calories:");
    private JLabel pa = new JLabel("Protein:");
    private JLabel fa = new JLabel("Fat:");
    private JLabel sa = new JLabel("Sodium:");
    private JLabel paa = new JLabel("Price:");
    private JLabel c = new JLabel("CLIENT");
    private  JLabel r4 = new JLabel("CREATE ORDER");
    private JTextField titleSearchText;
    private JTextField ratingSearchText;
    private JTextField caloriesSearchText;
    private JTextField proteinSearchText;
    private JTextField fatSearchText;
    private JTextField sodiumSearchText;
    private JTextField priceSearchText;
    private JTextField titleProductOrderText;
    private JButton searchButton= new JButton("Search ");
    private JButton putOnListOrderButton = new JButton("Put on list");
    private JButton createButton= new JButton("Create");
    private JButton showEvButton= new JButton("Show all");
    private JButton btnBack= new JButton("Back");

    //=====constructor=====
    public GUI3() {
        this.setTitle("Client window");
        this.setSize(637,465);
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 255, 204));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);
        this.setVisible(true);

        JPanel enterPanel = new JPanel();
        enterPanel.setBackground(new Color(204, 153, 153));
        enterPanel.setBounds(10, 71, 273, 298);
        panel.add(enterPanel);
        enterPanel.setLayout(null);
        this.setVisible(true);


        ap.setBounds(38, 10, 209, 28);
        enterPanel.add(ap);
        ap.setForeground(Color.WHITE);
        ap.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        searchButton.setBackground(Color.WHITE);
        searchButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        searchButton.setBounds(78, 248, 129, 28);
        enterPanel.add(searchButton);

        ratingSearchText = new JTextField();
        ratingSearchText.setBounds(133, 81, 114, 19);
        enterPanel.add(ratingSearchText);
        ratingSearchText.setColumns(10);

        titleSearchText = new JTextField();
        titleSearchText.setBounds(133, 52, 114, 19);
        enterPanel.add(titleSearchText);
        titleSearchText.setColumns(10);


        ra.setBounds(41, 65, 87, 44);
        enterPanel.add(ra);
        ra.setForeground(Color.WHITE);
        ra.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));


        ta.setBounds(41, 37, 87, 44);
        enterPanel.add(ta);
        ta.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        ta.setForeground(Color.WHITE);


        ca.setForeground(Color.WHITE);
        ca.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        ca.setBounds(41, 91, 87, 44);
        enterPanel.add(ca);


        pa.setForeground(Color.WHITE);
        pa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pa.setBounds(41, 119, 87, 44);
        enterPanel.add(pa);


        fa.setForeground(Color.WHITE);
        fa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        fa.setBounds(41, 145, 87, 44);
        enterPanel.add(fa);


        sa.setForeground(Color.WHITE);
        sa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        sa.setBounds(41, 172, 87, 44);
        enterPanel.add(sa);


        paa.setForeground(Color.WHITE);
        paa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        paa.setBounds(41, 195, 87, 44);
        enterPanel.add(paa);

        caloriesSearchText = new JTextField();
        caloriesSearchText.setColumns(10);
        caloriesSearchText.setBounds(133, 106, 114, 19);
        enterPanel.add(caloriesSearchText);

        proteinSearchText = new JTextField();
        proteinSearchText.setColumns(10);
        proteinSearchText.setBounds(133, 134, 114, 19);
        enterPanel.add(proteinSearchText);

        JPanel panell = new JPanel();
        panell.setLayout(null);
        panell.setBackground(new Color(221, 160, 221));
        panell.setBounds(335, 71, 273, 298);
        panel.add(panell);

        putOnListOrderButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        putOnListOrderButton.setBackground(Color.WHITE);
        putOnListOrderButton.setBounds(62, 138, 129, 28);
        panell.add(putOnListOrderButton);


        createButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        createButton.setBackground(Color.WHITE);
        createButton.setBounds(62, 192, 129, 28);
        panell.add(createButton);

        fatSearchText = new JTextField();
        fatSearchText.setColumns(10);
        fatSearchText.setBounds(133, 160, 114, 19);
        enterPanel.add(fatSearchText);

        sodiumSearchText = new JTextField();
        sodiumSearchText.setColumns(10);
        sodiumSearchText.setBounds(133, 187, 114, 19);
        enterPanel.add(sodiumSearchText);

        priceSearchText = new JTextField();
        priceSearchText.setColumns(10);
        priceSearchText.setBounds(133, 210, 114, 19);
        enterPanel.add(priceSearchText);


        c.setForeground(new Color(220, 20, 60));
        c.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
        c.setBounds(258, 0, 203, 61);
        panel.add(c);




        r4.setForeground(Color.WHITE);
        r4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        r4.setBounds(48, 10, 215, 28);
        panell.add(r4);

        JLabel d4 = new JLabel("Title:");
        d4.setForeground(Color.WHITE);
        d4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        d4.setBounds(24, 69, 87, 44);
        panell.add(d4);

        titleProductOrderText = new JTextField();
        titleProductOrderText.setColumns(10);
        titleProductOrderText.setBounds(100, 84, 129, 19);
        panell.add(titleProductOrderText);



        showEvButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        showEvButton.setBackground(Color.WHITE);
        showEvButton.setBounds(468, 390, 140, 31);
        panel.add(showEvButton);


        btnBack.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        btnBack.setBackground(Color.WHITE);
        btnBack.setBounds(10, 390, 123, 31);
        panel.add(btnBack);


    }
}
