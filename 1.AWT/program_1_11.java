

// Program 1.11 : Program to demonstrate scroll bar.

import java.awt.*;
import java.util.Set;


class program_1_11 extends Frame{


    Scrollbar sb;


    program_1_11(String s)
    {
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        setTitle("Hello");
        sb = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);
        sb.setBounds(100,100,50,100);
        add(sb);
    }


    public static void main(String[] args) {

        program_1_11 pa = new program_1_11("");


    }
}
