

// program 1.21 : Program to demonstrate dialog box.


import java.awt.*;

public class program_1_21 extends Dialog {



    program_1_21(Frame parent, String title)
    {
        super( parent, title , false);
        setLayout(new FlowLayout());
        setSize(300,200);
        setBackground(Color.YELLOW);
        Button b = new Button ("cancel");
        add(b);


    }


    public static void main(String[] args) {
        Frame f1 = new Frame();
        program_1_21 pa = new program_1_21(f1,"Hello");
        pa.setVisible(true);

    }
}
