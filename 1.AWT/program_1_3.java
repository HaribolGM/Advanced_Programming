

// Program 1.3 : Program for panel.




import java.awt.*;


public class program_1_3 extends Frame{


    program_1_3()
    {

        Frame f = new Frame ("Panel Example");

        Panel panel =new  Panel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.black);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
       program_1_3 pa = new program_1_3();
    }
}
