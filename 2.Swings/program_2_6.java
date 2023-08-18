

// Program 2.6: Program to demonstrate JTextField.




import javax.swing.*;
import java.awt.*;

public class program_2_6 extends JFrame {
    public program_2_6() {

        setLayout(new FlowLayout());
        JLabel j1  = new JLabel("TextField");
        add(j1);
        JTextField tf1 = new JTextField(40);
        add(tf1);
        setSize(800,300);
        setVisible(true);


    }

    public static void main(String[] args) {
        new program_2_6();
    }
}
