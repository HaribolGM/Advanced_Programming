

//Program 2.10: Program to demonstrate JRadioButton



import javax.swing.*;
import java.awt.*;

public class program_2_10 extends JFrame {


    public program_2_10()
    {
        setLayout(new FlowLayout());
        setSize(800,300);
        setVisible(true);
        JRadioButton jr1  = new JRadioButton("Java", true);
        add(jr1);
        JRadioButton jr2 = new JRadioButton("C++");
        add(jr2);



    }

    public static void main(String[] args) {
        new program_2_10();
    }
}
