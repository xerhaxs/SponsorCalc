import javax.swing.*;

public class Main {
    public static void main(String [] args) {

        JFrame frame = new JFrame("SponsorCalc");
        frame.setContentPane(new RunnerPorgrammGUI().panelMain);
        frame.setSize(1000,800);
        frame.pack();
        frame.setVisible(true);
    }
}
