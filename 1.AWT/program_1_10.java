

// Program 1.10 : Program to demonstrate lists.


import java.awt.*;
public class program_1_10 extends Frame{

    String msg = "";
    List l ;

    program_1_10(String s)
    {
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        l = new List(5,true);
        setTitle("Hello");
        l.add("Sunday");
        l.add("Monday");
        l.add("Tueday");
        l.add("Wednesday");
        l.setBounds(100,100,100,100);
        add(l);


    }


    public static void main(String[] args) {
        program_1_10 f = new program_1_10("");
    }
}
