

// Program 2.5: Program of demonstrate icons.

/*
<applet code="program_2_5" width=250 height=150>
</applet>
 */


import javax.swing.*;
import java.applet.Applet;


public class program_2_5 extends Applet {



    public void init() {
        ImageIcon icon =  new
                ImageIcon("bus.jpg");

        JLabel j1 = new JLabel("Car",icon, JLabel.CENTER);
        add(j1);

    }

}
