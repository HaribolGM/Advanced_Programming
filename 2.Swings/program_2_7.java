

// Program 2.7: Program to demonstrate JTextArea.



import javax.swing.*;
import java.awt.*;

public class program_2_7 extends JFrame {
    public program_2_7() {
        setLayout(new FlowLayout());
        JLabel j11 = new JLabel("TextArea");
        add(j11);
        JTextArea ta1 =  new JTextArea(10 ,20);
        add(ta1);
        setSize(600,600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new program_2_7();
    }
}
