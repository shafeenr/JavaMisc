package io.github.shafeenr.sams;

import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        super("My Frame");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookandFeel();
        setVisible(true);
    }

    private  static void setLookandFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        setLookandFeel();
        SimpleFrame sf = new SimpleFrame();
    }
}
