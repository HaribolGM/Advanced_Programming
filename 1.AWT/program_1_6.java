

// Program 1.6 : Program to demonstrate buttons.



import java.awt.*;
public class program_1_6  extends Frame{

    Button ok, cancel;
    program_1_6(String s) {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);
        ok = new Button("OK");
        cancel = new Button("Cancel");
        ok.setBounds(50,50,50,50);
        cancel.setBounds(120,50,100,50);
        add(ok);
        add(cancel);

    }



    public static void main(String[] args) {

        program_1_6 pa = new program_1_6("Desomnstrating Frame");
    }
}
