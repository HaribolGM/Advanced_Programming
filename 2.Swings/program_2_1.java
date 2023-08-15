

// Program 2.1: Creating JFrame window by instantiating JFrame class.


import javax.swing.*;
import java.awt.*;


public class program_2_1 {
    JFrame jf;
    program_2_1(){
        jf = new JFrame("MyWindow");
        JButton btn = new JButton("Say Hello");
        jf.add(btn); // jf.getContentPane.add(btn) for pre-JDK 1.5 versions
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new program_2_1();
    }
}
