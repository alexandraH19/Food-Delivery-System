package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class GUI2 extends JFrame {

    private JLabel ap = new JLabel("ADD PRODUCT");
    private JTextField titleAddSimpleText;
    private JTextField ratingAddSimpleText;
    private JTextField caloriesAddSimpleText;
    private JTextField proteinAddSimpleText;
    private JTextField fatAddSimpleText;
    private JTextField sodiumAddSimpleText;
    private JTextField priceAddSimpleText;
    private JTextField titleAddMenuText;
    private JLabel ta = new JLabel("Title:");
    private JLabel ca = new JLabel("Calories:");
    private JLabel pa = new JLabel("Protein:");
    private JLabel sa = new JLabel("Sodium:");
    private JLabel tp = new JLabel("Title:");
    private JLabel fe = new JLabel("Fat:");
    private JLabel v3 = new JLabel("Val:");
    private JTextField ratingEditText;
    private JTextField titleEditText;
    private JTextField caloriesEditText;
    private JTextField proteinEditText;
    private JTextField fatEditText;
    private JTextField sodiumEditText;
    private JTextField priceEditText;
    private JTextField productNameEditText;
    private JTextField productNameDeleteText;
    private JTextField endReport1Text;
    private JTextField startReport1Text;
    private JTextField report2Text;
    private JTextField valReport3Text;
    private JTextField timesReport3Text;
    private JTextField dayReport4Text;
    private JTextField productTitleAddMenu;
    private JButton btnBack;
    private JButton btnImportProducts;
    private JButton makeReport4Button;
    private JLabel r1 = new JLabel("Report 1");
    private JLabel t3 = new JLabel("Times:");
    private  JLabel fa = new JLabel("Fat:");
    private JLabel rp = new JLabel("Rating:");
    private  JLabel am = new JLabel("ADD MENU");
    private  JLabel lblAdmin = new JLabel("ADMIN");
    private JLabel cp = new JLabel("Calories:");
    private JLabel ep = new JLabel("EDIT PRODUCT");
    private  JLabel pe = new JLabel("Protein:");
    private JLabel se = new JLabel("Sodium:");
    private JLabel pee = new JLabel("Price:");
    private JLabel r4 = new JLabel("Report 4");
    private JLabel d4 = new JLabel("Day:");
    private JLabel ppe = new JLabel("Product:");
    private   JLabel r3 = new JLabel("Report 3");
    private JLabel r2 = new JLabel("Report 2");
    private JButton makeReport3Button;
    private JButton makeReport1Button;
    private JButton makeReport2Button;
    private JButton deleteButton;
    private JButton editButton;
    private JButton putOnListButton;
    private JButton addSPB;
    private JButton addMenuButton;
    private JLabel ra = new JLabel("Rating:");

    //====constructor=====
    public GUI2() {

        this.setTitle("Administrator window");
        this.setSize( 1082, 611);
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 255, 204));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);
        this.setVisible(true);

        JPanel enterPanel = new JPanel();
        enterPanel.setBackground(new Color(204, 153, 153));
        enterPanel.setBounds(10, 101, 273, 298);
        panel.add(enterPanel);
        enterPanel.setLayout(null);
        this.setVisible(true);

        JPanel joinPanel = new JPanel();
        joinPanel.setBackground(new Color(255, 204, 153));
        joinPanel.setBounds(650, 60, 330, 160);
        panel.add(joinPanel);
        joinPanel.setLayout(null);

        JPanel enteringPanel_1 = new JPanel();
        enteringPanel_1.setLayout(null);
        enteringPanel_1.setBackground(new Color(204, 153, 102));
        enteringPanel_1.setBounds(326, 60, 273, 339);
        panel.add(enteringPanel_1);
        this.setVisible(true);

        JPanel joinPanel_1 = new JPanel();
        joinPanel_1.setLayout(null);
        joinPanel_1.setBackground(new Color(255, 127, 80));
        joinPanel_1.setBounds(650, 239, 330, 160);
        panel.add(joinPanel_1);
        this.setVisible(true);

        ap.setBounds(56, 10, 174, 28);
        enterPanel.add(ap);
        ap.setForeground(Color.WHITE);
        ap.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));

        addSPB = new JButton("Add product");
        addSPB.setBackground(Color.WHITE);
        addSPB.setBounds(62, 249, 129, 28);
        enterPanel.add(addSPB);

        ratingAddSimpleText = new JTextField();
        ratingAddSimpleText.setBounds(133, 81, 114, 19);
        enterPanel.add(ratingAddSimpleText);
        ratingAddSimpleText.setColumns(10);

        titleAddSimpleText = new JTextField();
        titleAddSimpleText.setBounds(133, 52, 114, 19);
        enterPanel.add(titleAddSimpleText);
        titleAddSimpleText.setColumns(10);


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

        JLabel paa = new JLabel("Price:");
        paa.setForeground(Color.WHITE);
        paa.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        paa.setBounds(41, 195, 87, 44);
        enterPanel.add(paa);

        caloriesAddSimpleText = new JTextField();
        caloriesAddSimpleText.setColumns(10);
        caloriesAddSimpleText.setBounds(133, 106, 114, 19);
        enterPanel.add(caloriesAddSimpleText);

        proteinAddSimpleText = new JTextField();
        proteinAddSimpleText.setColumns(10);
        proteinAddSimpleText.setBounds(133, 134, 114, 19);
        enterPanel.add(proteinAddSimpleText);

        fatAddSimpleText = new JTextField();
        fatAddSimpleText.setColumns(10);
        fatAddSimpleText.setBounds(133, 160, 114, 19);
        enterPanel.add(fatAddSimpleText);

        sodiumAddSimpleText = new JTextField();
        sodiumAddSimpleText.setColumns(10);
        sodiumAddSimpleText.setBounds(133, 187, 114, 19);
        enterPanel.add(sodiumAddSimpleText);

        priceAddSimpleText = new JTextField();
        priceAddSimpleText.setColumns(10);
        priceAddSimpleText.setBounds(133, 210, 114, 19);
        enterPanel.add(priceAddSimpleText);




        am.setForeground(Color.WHITE);
        am.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        am.setBounds(94, 10, 174, 28);
        joinPanel.add(am);

        JLabel pm = new JLabel("Product:");
        pm.setForeground(Color.WHITE);
        pm.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pm.setBounds(23, 37, 87, 44);
        joinPanel.add(pm);

        JLabel tm = new JLabel("Title:");
        tm.setForeground(Color.WHITE);
        tm.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        tm.setBounds(23, 65, 87, 44);
        joinPanel.add(tm);

        titleAddMenuText = new JTextField();
        titleAddMenuText.setColumns(10);
        titleAddMenuText.setBounds(105, 80, 159, 19);
        joinPanel.add(titleAddMenuText);

        addMenuButton = new JButton("Add menu");
        addMenuButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        addMenuButton.setBackground(Color.WHITE);
        addMenuButton.setBounds(174, 109, 129, 28);
        joinPanel.add(addMenuButton);

        putOnListButton = new JButton("Put on list");
        putOnListButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        putOnListButton.setBackground(Color.WHITE);
        putOnListButton.setBounds(33, 109, 114, 28);
        joinPanel.add(putOnListButton);

        productTitleAddMenu = new JTextField();
        productTitleAddMenu.setColumns(10);
        productTitleAddMenu.setBounds(104, 52, 159, 19);
        joinPanel.add(productTitleAddMenu);


        lblAdmin.setForeground(new Color(220, 20, 60));
        lblAdmin.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
        lblAdmin.setBounds(466, 0, 203, 61);
        panel.add(lblAdmin);



        ep.setForeground(Color.WHITE);
        ep.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        ep.setBounds(56, 10, 174, 28);
        enteringPanel_1.add(ep);

        editButton = new JButton("Edit product");
        editButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        editButton.setBackground(Color.WHITE);
        editButton.setBounds(64, 301, 129, 28);
        enteringPanel_1.add(editButton);

        ratingEditText = new JTextField();
        ratingEditText.setColumns(10);
        ratingEditText.setBounds(133, 81, 114, 19);
        enteringPanel_1.add(ratingEditText);

        titleEditText = new JTextField();
        titleEditText.setColumns(10);
        titleEditText.setBounds(133, 52, 114, 19);
        enteringPanel_1.add(titleEditText);


        rp.setForeground(Color.WHITE);
        rp.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        rp.setBounds(41, 65, 87, 44);
        enteringPanel_1.add(rp);


        tp.setForeground(Color.WHITE);
        tp.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        tp.setBounds(41, 37, 87, 44);
        enteringPanel_1.add(tp);


        cp.setForeground(Color.WHITE);
        cp.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        cp.setBounds(41, 91, 87, 44);
        enteringPanel_1.add(cp);


        pe.setForeground(Color.WHITE);
        pe.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pe.setBounds(41, 119, 87, 44);
        enteringPanel_1.add(pe);


        fe.setForeground(Color.WHITE);
        fe.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        fe.setBounds(41, 145, 87, 44);
        enteringPanel_1.add(fe);


        se.setForeground(Color.WHITE);
        se.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        se.setBounds(41, 172, 87, 44);
        enteringPanel_1.add(se);


        pee.setForeground(Color.WHITE);
        pee.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pee.setBounds(41, 195, 87, 44);
        enteringPanel_1.add(pee);

        caloriesEditText = new JTextField();
        caloriesEditText.setColumns(10);
        caloriesEditText.setBounds(133, 106, 114, 19);
        enteringPanel_1.add(caloriesEditText);

        proteinEditText = new JTextField();
        proteinEditText.setColumns(10);
        proteinEditText.setBounds(133, 134, 114, 19);
        enteringPanel_1.add(proteinEditText);

        fatEditText = new JTextField();
        fatEditText.setColumns(10);
        fatEditText.setBounds(133, 160, 114, 19);
        enteringPanel_1.add(fatEditText);

        sodiumEditText = new JTextField();
        sodiumEditText.setColumns(10);
        sodiumEditText.setBounds(133, 187, 114, 19);
        enteringPanel_1.add(sodiumEditText);

        priceEditText = new JTextField();
        priceEditText.setColumns(10);
        priceEditText.setBounds(133, 210, 114, 19);
        enteringPanel_1.add(priceEditText);

        productNameEditText = new JTextField();
        productNameEditText.setColumns(10);
        productNameEditText.setBounds(133, 239, 114, 19);
        enteringPanel_1.add(productNameEditText);


        ppe.setForeground(Color.WHITE);
        ppe.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        ppe.setBounds(41, 226, 87, 44);
        enteringPanel_1.add(ppe);


        JLabel dp = new JLabel("DELETE PRODUCT");
        dp.setForeground(Color.WHITE);
        dp.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        dp.setBounds(63, 10, 215, 28);
        joinPanel_1.add(dp);

        JLabel pd = new JLabel("Product:");
        pd.setForeground(Color.WHITE);
        pd.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        pd.setBounds(37, 49, 87, 44);
        joinPanel_1.add(pd);

        productNameDeleteText = new JTextField();
        productNameDeleteText.setColumns(10);
        productNameDeleteText.setBounds(119, 64, 159, 19);
        joinPanel_1.add(productNameDeleteText);

        deleteButton = new JButton("Delete");
        deleteButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        deleteButton.setBackground(Color.WHITE);
        deleteButton.setBounds(84, 107, 129, 28);
        joinPanel_1.add(deleteButton);

        JPanel joinPanel_2 = new JPanel();
        joinPanel_2.setLayout(null);
        joinPanel_2.setBackground(new Color(255, 102, 51));
        joinPanel_2.setBounds(16, 409, 252, 160);
        panel.add(joinPanel_2);


        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        r1.setBounds(62, 10, 174, 28);
        joinPanel_2.add(r1);

        JLabel s1 = new JLabel("Start:");
        s1.setForeground(Color.WHITE);
        s1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        s1.setBounds(23, 37, 87, 44);
        joinPanel_2.add(s1);

        JLabel e1 = new JLabel("End:");
        e1.setForeground(Color.WHITE);
        e1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        e1.setBounds(23, 65, 87, 44);
        joinPanel_2.add(e1);

        endReport1Text = new JTextField();
        endReport1Text.setColumns(10);
        endReport1Text.setBounds(78, 80, 140, 19);
        joinPanel_2.add(endReport1Text);

        makeReport1Button = new JButton("Make");
        makeReport1Button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        makeReport1Button.setBackground(Color.WHITE);
        makeReport1Button.setBounds(62, 119, 114, 28);
        joinPanel_2.add(makeReport1Button);

        startReport1Text = new JTextField();
        startReport1Text.setColumns(10);
        startReport1Text.setBounds(78, 52, 140, 19);
        joinPanel_2.add(startReport1Text);

        JPanel joinPanel_1_1 = new JPanel();
        joinPanel_1_1.setLayout(null);
        joinPanel_1_1.setBackground(new Color(204, 102, 102));
        joinPanel_1_1.setBounds(278, 409, 252, 160);
        panel.add(joinPanel_1_1);


        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        r2.setBounds(57, 10, 215, 28);
        joinPanel_1_1.add(r2);

        JLabel n2 = new JLabel("Nr:");
        n2.setForeground(Color.WHITE);
        n2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        n2.setBounds(27, 48, 87, 44);
        joinPanel_1_1.add(n2);

        report2Text = new JTextField();
        report2Text.setColumns(10);
        report2Text.setBounds(57, 63, 159, 19);
        joinPanel_1_1.add(report2Text);

        makeReport2Button = new JButton("Make");
        makeReport2Button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        makeReport2Button.setBackground(Color.WHITE);
        makeReport2Button.setBounds(57, 119, 129, 28);
        joinPanel_1_1.add(makeReport2Button);

        JPanel joinPanel_2_1 = new JPanel();
        joinPanel_2_1.setLayout(null);
        joinPanel_2_1.setBackground(new Color(255, 160, 122));
        joinPanel_2_1.setBounds(540, 409, 252, 160);
        panel.add(joinPanel_2_1);


        r3.setForeground(Color.WHITE);
        r3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        r3.setBounds(68, 10, 174, 28);
        joinPanel_2_1.add(r3);


        t3.setForeground(Color.WHITE);
        t3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        t3.setBounds(34, 37, 87, 44);
        joinPanel_2_1.add(t3);


        v3.setForeground(Color.WHITE);
        v3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        v3.setBounds(34, 65, 87, 44);
        joinPanel_2_1.add(v3);

        valReport3Text = new JTextField();
        valReport3Text.setColumns(10);
        valReport3Text.setBounds(106, 80, 130, 19);
        joinPanel_2_1.add(valReport3Text);

        makeReport3Button = new JButton("Make");
        makeReport3Button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        makeReport3Button.setBackground(Color.WHITE);
        makeReport3Button.setBounds(68, 119, 114, 28);
        joinPanel_2_1.add(makeReport3Button);

        timesReport3Text = new JTextField();
        timesReport3Text.setColumns(10);
        timesReport3Text.setBounds(106, 52, 130, 19);
        joinPanel_2_1.add(timesReport3Text);

        JPanel joinPanel_1_1_1 = new JPanel();
        joinPanel_1_1_1.setLayout(null);
        joinPanel_1_1_1.setBackground(new Color(221, 160, 221));
        joinPanel_1_1_1.setBounds(802, 409, 252, 160);
        panel.add(joinPanel_1_1_1);


        r4.setForeground(Color.WHITE);
        r4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        r4.setBounds(69, 10, 215, 28);
        joinPanel_1_1_1.add(r4);


        d4.setForeground(Color.WHITE);
        d4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        d4.setBounds(39, 48, 87, 44);
        joinPanel_1_1_1.add(d4);

        dayReport4Text = new JTextField();
        dayReport4Text.setColumns(10);
        dayReport4Text.setBounds(83, 63, 129, 19);
        joinPanel_1_1_1.add(dayReport4Text);

        makeReport4Button = new JButton("Make");
        makeReport4Button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        makeReport4Button.setBackground(Color.WHITE);
        makeReport4Button.setBounds(69, 119, 129, 28);
        joinPanel_1_1_1.add(makeReport4Button);

        btnImportProducts = new JButton("Import products");
        btnImportProducts.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        btnImportProducts.setBackground(Color.WHITE);
        btnImportProducts.setBounds(143, 60, 173, 31);
        panel.add(btnImportProducts);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
        btnBack.setBackground(Color.WHITE);
        btnBack.setBounds(10, 60, 123, 31);
        panel.add(btnBack);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JTextField getTitleAddSimpleText() {
        return titleAddSimpleText;
    }

    public void setTitleAddSimpleText(JTextField titleAddSimpleText) {
        this.titleAddSimpleText = titleAddSimpleText;
    }

    public JTextField getRatingAddSimpleText() {
        return ratingAddSimpleText;
    }

    public void setRatingAddSimpleText(JTextField ratingAddSimpleText) {
        this.ratingAddSimpleText = ratingAddSimpleText;
    }

    public JTextField getCaloriesAddSimpleText() {
        return caloriesAddSimpleText;
    }

    public void setCaloriesAddSimpleText(JTextField caloriesAddSimpleText) {
        this.caloriesAddSimpleText = caloriesAddSimpleText;
    }

    public JTextField getProteinAddSimpleText() {
        return proteinAddSimpleText;
    }

    public void setProteinAddSimpleText(JTextField proteinAddSimpleText) {
        this.proteinAddSimpleText = proteinAddSimpleText;
    }

    public JTextField getFatAddSimpleText() {
        return fatAddSimpleText;
    }

    public void setFatAddSimpleText(JTextField fatAddSimpleText) {
        this.fatAddSimpleText = fatAddSimpleText;
    }

    public JTextField getSodiumAddSimpleText() {
        return sodiumAddSimpleText;
    }

    public void setSodiumAddSimpleText(JTextField sodiumAddSimpleText) {
        this.sodiumAddSimpleText = sodiumAddSimpleText;
    }

    public JTextField getPriceAddSimpleText() {
        return priceAddSimpleText;
    }

    public void setPriceAddSimpleText(JTextField priceAddSimpleText) {
        this.priceAddSimpleText = priceAddSimpleText;
    }

    public JTextField getTitleAddMenuText() {
        return titleAddMenuText;
    }

    public void setTitleAddMenuText(JTextField titleAddMenuText) {
        this.titleAddMenuText = titleAddMenuText;
    }

    public JTextField getRatingEditText() {
        return ratingEditText;
    }

    public void setRatingEditText(JTextField ratingEditText) {
        this.ratingEditText = ratingEditText;
    }

    public JTextField getTitleEditText() {
        return titleEditText;
    }

    public void setTitleEditText(JTextField titleEditText) {
        this.titleEditText = titleEditText;
    }

    public JTextField getCaloriesEditText() {
        return caloriesEditText;
    }

    public void setCaloriesEditText(JTextField caloriesEditText) {
        this.caloriesEditText = caloriesEditText;
    }

    public JTextField getProteinEditText() {
        return proteinEditText;
    }

    public void setProteinEditText(JTextField proteinEditText) {
        this.proteinEditText = proteinEditText;
    }

    public JTextField getFatEditText() {
        return fatEditText;
    }

    public void setFatEditText(JTextField fatEditText) {
        this.fatEditText = fatEditText;
    }

    public JTextField getSodiumEditText() {
        return sodiumEditText;
    }

    public void setSodiumEditText(JTextField sodiumEditText) {
        this.sodiumEditText = sodiumEditText;
    }

    public JTextField getPriceEditText() {
        return priceEditText;
    }

    public void setPriceEditText(JTextField priceEditText) {
        this.priceEditText = priceEditText;
    }

    public JTextField getProductNameEditText() {
        return productNameEditText;
    }

    public void setProductNameEditText(JTextField productNameEditText) {
        this.productNameEditText = productNameEditText;
    }

    public JTextField getProductNameDeleteText() {
        return productNameDeleteText;
    }

    public void setProductNameDeleteText(JTextField productNameDeleteText) {
        this.productNameDeleteText = productNameDeleteText;
    }

    public JTextField getEndReport1Text() {
        return endReport1Text;
    }

    public void setEndReport1Text(JTextField endReport1Text) {
        this.endReport1Text = endReport1Text;
    }

    public JTextField getStartReport1Text() {
        return startReport1Text;
    }

    public void setStartReport1Text(JTextField startReport1Text) {
        this.startReport1Text = startReport1Text;
    }

    public JTextField getReport2Text() {
        return report2Text;
    }

    public void setReport2Text(JTextField report2Text) {
        this.report2Text = report2Text;
    }

    public JTextField getValReport3Text() {
        return valReport3Text;
    }

    public void setValReport3Text(JTextField valReport3Text) {
        this.valReport3Text = valReport3Text;
    }

    public JTextField getTimesReport3Text() {
        return timesReport3Text;
    }

    public void setTimesReport3Text(JTextField timesReport3Text) {
        this.timesReport3Text = timesReport3Text;
    }

    public JTextField getDayReport4Text() {
        return dayReport4Text;
    }

    public void setDayReport4Text(JTextField dayReport4Text) {
        this.dayReport4Text = dayReport4Text;
    }

    public JTextField getProductTitleAddMenu() {
        return productTitleAddMenu;
    }

    public void setProductTitleAddMenu(JTextField productTitleAddMenu) {
        this.productTitleAddMenu = productTitleAddMenu;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnImportProducts() {
        return btnImportProducts;
    }

    public void setBtnImportProducts(JButton btnImportProducts) {
        this.btnImportProducts = btnImportProducts;
    }

    public JButton getMakeReport4Button() {
        return makeReport4Button;
    }

    public void setMakeReport4Button(JButton makeReport4Button) {
        this.makeReport4Button = makeReport4Button;
    }

    public JButton getMakeReport3Button() {
        return makeReport3Button;
    }

    public void setMakeReport3Button(JButton makeReport3Button) {
        this.makeReport3Button = makeReport3Button;
    }

    public JButton getMakeReport1Button() {
        return makeReport1Button;
    }

    public void setMakeReport1Button(JButton makeReport1Button) {
        this.makeReport1Button = makeReport1Button;
    }

    public JButton getMakeReport2Button() {
        return makeReport2Button;
    }

    public void setMakeReport2Button(JButton makeReport2Button) {
        this.makeReport2Button = makeReport2Button;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }

    public JButton getPutOnListButton() {
        return putOnListButton;
    }

    public void setPutOnListButton(JButton putOnListButton) {
        this.putOnListButton = putOnListButton;
    }

    public JButton getAddSimpleProductButton() {
        return addSPB;
    }

    public JButton getAddMenuButton() {
        return addMenuButton;
    }

    public void setAddMenuButton(JButton addMenuButton) {
        this.addMenuButton = addMenuButton;
    }
}
