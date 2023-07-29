

// Program 1.1 : By instantiating Frame class.
import java.awt.*;

public class program_1_1 {


    program_1_1()
    {
        Frame fm= new Frame();
        Label lb = new Label ("Welcome to java graphics");
        lb.setBounds(10,10,100,50);
        fm.add(lb);
        fm.setVisible(true);

    }

    public static void main(String[] args) {

        program_1_1 pa = new program_1_1();

    }

}
