

// Program 3.11 :  Program for TextListener interface.


import java.awt.*;
import java.awt.event.TextListener;
import java.awt.event.*;

public class program_3_11 implements TextListener {

    Label label1, label2;
    TextField field1 ;
    Frame jf;
    String str;

    program_3_11() {
        jf = new Frame ("TextEventDemo");
        label1 = new Label("Enter you name");
        label2 = new Label();
        field1 = new TextField(25);
        jf.setLayout(new FlowLayout());
        jf.add(label1);
        jf.add(field1);
        jf.add(label2);
        field1.addTextListener(this);
        jf.setSize(340,200);
        jf.setVisible(true);
    }

    public void textValueChanged(TextEvent te) {
        label2.setText(te.paramString());
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new program_3_11();
    }

}
