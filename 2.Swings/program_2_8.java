

// Program 2.8: Program to demonstrate JComboBox.





import javax.swing.*;

public class program_2_8 extends JFrame {
    public program_2_8 ()
    {
        String country[] = { "India","Aus", "U.S.A","England","Newzeland"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,50,90,20);
        add(cb);
        setLayout(null);
        setSize(400,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new program_2_8();
    }
}
