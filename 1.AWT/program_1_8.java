

// Program 1.7 : Program to demonstrate Checkbox group.


import java.awt.*;



 class program_1_8 extends Frame {

    Checkbox cb1, cb2;
    CheckboxGroup cbg;
    String msg = "";

    program_1_8() {
        setLayout(null);
        setVisible(true);
        setSize(300, 300);
        setTitle("Hello");

        cbg = new CheckboxGroup();

        cb1 = new Checkbox("Java", false, cbg);
        cb1.setBounds(100, 100, 50, 50);
        add(cb1);

        cb2 = new Checkbox("C++", false, cbg);
        cb2.setBounds(100, 200, 50, 50);
        add(cb2);
    }


    public static void main(String[] args) {
       program_1_8 f = new program_1_8();

    }
}