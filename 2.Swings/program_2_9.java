

// Program 2.9: Program to demonstrate JButton.

import javax.swing.*;

public class program_2_9 extends JFrame {

    public program_2_9()
    {

        setLayout(null);
        setSize(400,500);
        setVisible(true);
        JButton jb = new JButton("Cancel");
        jb.setBounds(50,50,90,20);
        add(jb);


    }

    public static void main(String[] args) {
        new program_2_9();
    }
}
