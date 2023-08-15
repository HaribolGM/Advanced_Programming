import java.awt.*;

public class program_1_12 extends Frame{
    TextField t1,t2;
    Label l1,l2;

    program_1_12(String s){
        super(s);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        l1  = new Label("Enter User name");
        l1.setBounds(50,100,100,50);
        t1 = new TextField(12);
        t1.setBounds(150,100,100,50);
        add(l1);
        add(t1);

        l2 = new Label("Enter Password");
        l2.setBounds(50,200,100,50);
        t2 = new TextField(8);
        t2.setBounds(150,200,100,50);
        t2.setEchoChar('*');
        add(l2);
        add(t2);



    }

    public static void main(String[] args) {
        program_1_12 pa = new program_1_12("Frame");

    }

}
