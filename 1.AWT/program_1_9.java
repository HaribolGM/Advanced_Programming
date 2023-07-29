

// Program 1.9 : Program to demonstrate choice controls.


import java.awt.*;

public class program_1_9 extends Frame {


String msg = "";
Choice  c;
program_1_9( )
{

    setLayout(null);
    setVisible(true);
    setSize(300,300);
    setTitle("Hello");
    c = new Choice();
    c.add("Sunday");
    c.add("Monday");
    c.add("Tuesday");
    c.add("Wednesday");
    c.setBounds(100,100,100,100);
    add(c);


}


    public static void main(String[] args) {

    program_1_9 f = new program_1_9();
    }
}
