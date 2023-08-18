

// Program 2.11 : Program to demonstrate JCheckBox.


import javax.swing.*;
import java.awt.*;

public class program_2_11 extends JFrame {
    public program_2_11()
    {

    setLayout(new FlowLayout());
    setSize(400,500);
    setVisible(true);
    JCheckBox jr1 =  new JCheckBox("Java",true);
    add(jr1);
    JCheckBox jr2 = new JCheckBox("C++");
    add(jr2);


    }

    public static void main(String[] args) {
        new program_2_11();
    }
}
