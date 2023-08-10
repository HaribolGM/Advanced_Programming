

// Program 1.11 : Program to demonstrate scroll bar.

import java.awt.*;
import java.util.Set;


class practical_1_11 extends Frame{


    Scrollbar sb;


    practical_1_11(String s)
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

        practical_1_11 pa = new practical_1_11("");


    }
}
