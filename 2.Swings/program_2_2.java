

// Program 2.2: Creating JFrame window by extending JFrame class.


import javax.swing.*;
import java.awt.*;

public class program_2_2 extends JFrame
{
    JFrame jf;
    program_2_2() {

        setTitle("MyWindows");
        JLabel lb = new JLabel("Welcome");
        add(lb);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);



    }

    public static void main(String[] args) {
        new program_2_2();
    }


}
