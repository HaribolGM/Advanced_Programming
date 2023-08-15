

// Program 1.13 Program to demonstrate textarea.






import java.awt.*;

public class program_1_13 extends Frame{
    String msg = "hello  everyone, This is unit is Introduction to AWT and its components.";
    TextArea t1 ;

    program_1_13(String s){
        super(s);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        t1 = new TextArea(msg);
        t1.setBounds(50,100,100,100);
        add(t1);

    }

    public static void main(String[] args) {
        program_1_13 pa = new program_1_13("Frame");
    }
}
