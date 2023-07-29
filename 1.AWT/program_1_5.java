

// Program 1.5 : Program to demonstrate Label.



import java.awt.*;
  public class program_1_5 extends Frame {

    program_1_5(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);
        Label one  = new Label("Label One");
        Label two = new Label ("Label Two");
        Label three = new Label("Label Three");

        // set the position of controls

        one.setBounds(50,50,100,100);
        two.setBounds(150,50,100,100);
        three.setBounds(250,50,100,100);
        add(one);
        add( two);
        add( three);
    }

    public static void main(String[] args) {
        program_1_5  pa = new program_1_5("Demonstrating Frame");
    }
}
