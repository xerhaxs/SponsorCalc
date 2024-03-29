import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunnerPorgrammGUI {
    public JPanel panelMain;
    private JTextField nameTextField1;
    private JTextField maxMoneyTextField1;
    private JTextField moneyPerRoundTextField1;
    private JButton signUpButton1;
    private JTextField nameTextField2;
    private JButton addRoundButton1;
    private JTextField roundTextField1;
    private JComboBox dayComboBox1;
    private JComboBox monthComboBox1;
    private JComboBox yearComboBox1;
    private JComboBox yearComboBox2;
    private JComboBox monthComboBox2;
    private JComboBox dayComboBox2;
    private JButton getFirstRunnerButton1;
    private JButton addRunnersButton1;
    private JTextArea runnerListTextArea1;
    private JButton sortRunnersButton1;

    public RunnerPorgrammGUI() {

        RunnerList RunnerList = new RunnerList();

        $$$setupUI$$$();
        signUpButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RunnerList.addRunner(nameTextField1.getText(), String.valueOf(yearComboBox1.getSelectedItem()) + ("-") + monthComboBox1.getSelectedItem() + ("-") + dayComboBox1.getSelectedItem(), Integer.parseInt(maxMoneyTextField1.getText()), Integer.parseInt(moneyPerRoundTextField1.getText()));
                runnerListTextArea1.setText(runnerListTextArea1.getText() + nameTextField1.getText() + "\n");
            }
        });

        addRoundButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RunnerList.getRunner(nameTextField2.getText() + String.valueOf(yearComboBox2.getSelectedItem()) + ("-") + monthComboBox2.getSelectedItem() + ("-") + dayComboBox2.getSelectedItem()).run(Integer.parseInt(roundTextField1.getText()));
                RunnerList.getRunner(nameTextField2.getText() + String.valueOf(yearComboBox2.getSelectedItem()) + ("-") + monthComboBox2.getSelectedItem() + ("-") + dayComboBox2.getSelectedItem()).getRunnerData();
            }
        });

        getFirstRunnerButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RunnerList.getFirstRunner();
            }
        });

        addRunnersButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RunnerList.addRunner("Adolf", "2000-January-01", 100, 5);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Adolf\n");
                RunnerList.getRunner("Adolf" + "2000-January-01").run(25);

                RunnerList.addRunner("Stalin", "2001-January-01", 200, 20);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Stalin\n");
                RunnerList.getRunner("Stalin" + "2001-January-01").run(10);

                RunnerList.addRunner("Mao", "2022-January-01", 150, 15);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Mao\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(100);

                RunnerList.addRunner("Wilhelm", "2005-January-01", 300, 5);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Wilhelm\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(7);

                RunnerList.addRunner("Karl", "2006-January-01", 110, 2);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Karl\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(26);

                RunnerList.addRunner("Marx", "2004-January-01", 80, 8);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Marx\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(15);

                RunnerList.addRunner("Bismarck", "2003-January-01", 20, 12);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Bismarck\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(8);

                RunnerList.addRunner("Friedrich", "2002-January-01", 50, 16);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Friedrich\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(5);

                RunnerList.addRunner("Caesar", "2005-January-01", 75, 3);
                runnerListTextArea1.setText(runnerListTextArea1.getText() + "Caesar\n");
                RunnerList.getRunner("Mao" + "2022-January-01").run(25);
            }
        });
        sortRunnersButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //RunnerList.getSortedRunnerListSelection();
                RunnerList.getSortedRunnerListInsert();
                runnerListTextArea1.setText(RunnerList.getRunnerNames());
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(panel1, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Sign Up");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label1, gbc);
        nameTextField1 = new JTextField();
        nameTextField1.setEnabled(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(nameTextField1, gbc);
        maxMoneyTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(maxMoneyTextField1, gbc);
        moneyPerRoundTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(moneyPerRoundTextField1, gbc);
        signUpButton1 = new JButton();
        signUpButton1.setText("Sign Up");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(signUpButton1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label2, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Max money");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label3, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("Money per round");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label4, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);
        monthComboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("January");
        defaultComboBoxModel1.addElement("February");
        defaultComboBoxModel1.addElement("March");
        defaultComboBoxModel1.addElement("April");
        defaultComboBoxModel1.addElement("May");
        defaultComboBoxModel1.addElement("June");
        defaultComboBoxModel1.addElement("July");
        defaultComboBoxModel1.addElement("August");
        defaultComboBoxModel1.addElement("Spetember");
        defaultComboBoxModel1.addElement("October");
        defaultComboBoxModel1.addElement("November");
        defaultComboBoxModel1.addElement("December");
        monthComboBox1.setModel(defaultComboBoxModel1);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(monthComboBox1, gbc);
        yearComboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("2022");
        defaultComboBoxModel2.addElement("2021");
        defaultComboBoxModel2.addElement("2020");
        defaultComboBoxModel2.addElement("2019");
        defaultComboBoxModel2.addElement("2018");
        defaultComboBoxModel2.addElement("2017");
        defaultComboBoxModel2.addElement("2016");
        defaultComboBoxModel2.addElement("2015");
        defaultComboBoxModel2.addElement("2014");
        defaultComboBoxModel2.addElement("2013");
        defaultComboBoxModel2.addElement("2012");
        defaultComboBoxModel2.addElement("2011");
        defaultComboBoxModel2.addElement("2010");
        defaultComboBoxModel2.addElement("2009");
        defaultComboBoxModel2.addElement("2008");
        defaultComboBoxModel2.addElement("2007");
        defaultComboBoxModel2.addElement("2006");
        defaultComboBoxModel2.addElement("2005");
        defaultComboBoxModel2.addElement("2004");
        defaultComboBoxModel2.addElement("2003");
        defaultComboBoxModel2.addElement("2002");
        defaultComboBoxModel2.addElement("2001");
        defaultComboBoxModel2.addElement("2000");
        yearComboBox1.setModel(defaultComboBoxModel2);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(yearComboBox1, gbc);
        dayComboBox1 = new JComboBox();
        dayComboBox1.setMaximumRowCount(31);
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("01");
        defaultComboBoxModel3.addElement("02");
        defaultComboBoxModel3.addElement("03");
        defaultComboBoxModel3.addElement("04");
        defaultComboBoxModel3.addElement("05");
        defaultComboBoxModel3.addElement("06");
        defaultComboBoxModel3.addElement("07");
        defaultComboBoxModel3.addElement("08");
        defaultComboBoxModel3.addElement("09");
        defaultComboBoxModel3.addElement("10");
        defaultComboBoxModel3.addElement("11");
        defaultComboBoxModel3.addElement("12");
        defaultComboBoxModel3.addElement("13");
        defaultComboBoxModel3.addElement("14");
        defaultComboBoxModel3.addElement("15");
        defaultComboBoxModel3.addElement("16");
        defaultComboBoxModel3.addElement("17");
        defaultComboBoxModel3.addElement("18");
        defaultComboBoxModel3.addElement("19");
        defaultComboBoxModel3.addElement("20");
        defaultComboBoxModel3.addElement("21");
        defaultComboBoxModel3.addElement("22");
        defaultComboBoxModel3.addElement("23");
        defaultComboBoxModel3.addElement("24");
        defaultComboBoxModel3.addElement("25");
        defaultComboBoxModel3.addElement("26");
        defaultComboBoxModel3.addElement("27");
        defaultComboBoxModel3.addElement("28");
        defaultComboBoxModel3.addElement("29");
        defaultComboBoxModel3.addElement("30");
        defaultComboBoxModel3.addElement("31");
        dayComboBox1.setModel(defaultComboBoxModel3);
        dayComboBox1.putClientProperty("html.disable", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(dayComboBox1, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("Birthday");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label5, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(panel3, gbc);
        final JLabel label6 = new JLabel();
        label6.setText("Runners List");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        panel3.add(label6, gbc);
        runnerListTextArea1 = new JTextArea();
        runnerListTextArea1.setEditable(false);
        runnerListTextArea1.setLineWrap(false);
        runnerListTextArea1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(runnerListTextArea1, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(panel4, gbc);
        nameTextField2 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(nameTextField2, gbc);
        final JLabel label7 = new JLabel();
        label7.setText("Round Counter");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel4.add(label7, gbc);
        addRoundButton1 = new JButton();
        addRoundButton1.setText("Add Round");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(addRoundButton1, gbc);
        roundTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(roundTextField1, gbc);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel4.add(panel5, gbc);
        yearComboBox2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("2022");
        defaultComboBoxModel4.addElement("2021");
        defaultComboBoxModel4.addElement("2020");
        defaultComboBoxModel4.addElement("2019");
        defaultComboBoxModel4.addElement("2018");
        defaultComboBoxModel4.addElement("2017");
        defaultComboBoxModel4.addElement("2016");
        defaultComboBoxModel4.addElement("2015");
        defaultComboBoxModel4.addElement("2014");
        defaultComboBoxModel4.addElement("2013");
        defaultComboBoxModel4.addElement("2012");
        defaultComboBoxModel4.addElement("2011");
        defaultComboBoxModel4.addElement("2010");
        defaultComboBoxModel4.addElement("2009");
        defaultComboBoxModel4.addElement("2008");
        defaultComboBoxModel4.addElement("2007");
        defaultComboBoxModel4.addElement("2006");
        defaultComboBoxModel4.addElement("2005");
        defaultComboBoxModel4.addElement("2004");
        defaultComboBoxModel4.addElement("2003");
        defaultComboBoxModel4.addElement("2002");
        defaultComboBoxModel4.addElement("2001");
        defaultComboBoxModel4.addElement("2000");
        yearComboBox2.setModel(defaultComboBoxModel4);
        panel5.add(yearComboBox2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        monthComboBox2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("January");
        defaultComboBoxModel5.addElement("February");
        defaultComboBoxModel5.addElement("March");
        defaultComboBoxModel5.addElement("April");
        defaultComboBoxModel5.addElement("May");
        defaultComboBoxModel5.addElement("June");
        defaultComboBoxModel5.addElement("July");
        defaultComboBoxModel5.addElement("August");
        defaultComboBoxModel5.addElement("Spetember");
        defaultComboBoxModel5.addElement("October");
        defaultComboBoxModel5.addElement("November");
        defaultComboBoxModel5.addElement("December");
        monthComboBox2.setModel(defaultComboBoxModel5);
        panel5.add(monthComboBox2, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dayComboBox2 = new JComboBox();
        dayComboBox2.setMaximumRowCount(31);
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("01");
        defaultComboBoxModel6.addElement("02");
        defaultComboBoxModel6.addElement("03");
        defaultComboBoxModel6.addElement("04");
        defaultComboBoxModel6.addElement("05");
        defaultComboBoxModel6.addElement("06");
        defaultComboBoxModel6.addElement("07");
        defaultComboBoxModel6.addElement("08");
        defaultComboBoxModel6.addElement("09");
        defaultComboBoxModel6.addElement("10");
        defaultComboBoxModel6.addElement("11");
        defaultComboBoxModel6.addElement("12");
        defaultComboBoxModel6.addElement("13");
        defaultComboBoxModel6.addElement("14");
        defaultComboBoxModel6.addElement("15");
        defaultComboBoxModel6.addElement("16");
        defaultComboBoxModel6.addElement("17");
        defaultComboBoxModel6.addElement("18");
        defaultComboBoxModel6.addElement("19");
        defaultComboBoxModel6.addElement("20");
        defaultComboBoxModel6.addElement("21");
        defaultComboBoxModel6.addElement("22");
        defaultComboBoxModel6.addElement("23");
        defaultComboBoxModel6.addElement("24");
        defaultComboBoxModel6.addElement("25");
        defaultComboBoxModel6.addElement("26");
        defaultComboBoxModel6.addElement("27");
        defaultComboBoxModel6.addElement("28");
        defaultComboBoxModel6.addElement("29");
        defaultComboBoxModel6.addElement("30");
        defaultComboBoxModel6.addElement("31");
        dayComboBox2.setModel(defaultComboBoxModel6);
        dayComboBox2.putClientProperty("html.disable", Boolean.FALSE);
        panel5.add(dayComboBox2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(label8, gbc);
        final JLabel label9 = new JLabel();
        label9.setText("Birthday");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(label9, gbc);
        final JLabel label10 = new JLabel();
        label10.setText("Add Round X");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(label10, gbc);
        getFirstRunnerButton1 = new JButton();
        getFirstRunnerButton1.setText("First Runner");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(getFirstRunnerButton1, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(spacer1, gbc);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(panel6, gbc);
        addRunnersButton1 = new JButton();
        addRunnersButton1.setText("Add Runners");
        panel6.add(addRunnersButton1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Debug Menu");
        panel6.add(label11, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        sortRunnersButton1 = new JButton();
        sortRunnersButton1.setText("Sort Runners");
        panel6.add(sortRunnersButton1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
