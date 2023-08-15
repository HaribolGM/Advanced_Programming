

// Program 2.4: Program to demonstrate jLabel.


import javax.swing.*;
import java.awt.*;

public class program_2_4 extends JFrame {

    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();


    public program_2_4()
    {
        setLayout(null);
        setSize(new Dimension(400,300));
        jLabel1.setText("UserName");
        jLabel1.setBounds(new Rectangle(40,55,80,25));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(40,95,60,25));
        add(jLabel1, null);
        add(jLabel2, null);

    }

    public static void main(String[] args) {
        program_2_4 frame = new program_2_4();
        frame.setVisible(true);

    }
}
