

// Program 1.7 : Program to demonstrate checkboxes.


import java.awt.*;
public class program_1_7 extends Frame{

    Checkbox cb1, cb2;
    String msg="";
    program_1_7 ()
    {
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        setTitle("Hello");
        cb1 = new Checkbox("Java",false);
        cb1.setBounds(100,100,50,50);
        add(cb1);
        cb2= new Checkbox("C++",false);
        cb2.setBounds(100,200,50,50);
        add(cb2);
    }


    public static void main(String[] args) {

    program_1_7 pa = new program_1_7();

    }
}
