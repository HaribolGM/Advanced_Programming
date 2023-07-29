

// Program 1.4 : Program for Frame in Applet.
// Use need in initialize another interpreter for this code caz this use java applets which needs
// jdk 8.0 support you need configure as per that.


import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;


public class program_1_4 extends Applet {


    SampleFrame f ;
    public void init() {

        f = new SampleFrame("A Frame window");
        f.setSize(250, 250);
        f.setVisible(true);
    }



    public void start() {
        f.setVisible(true);

    }

    public void stop() {
        f.setVisible(false);

    }

    public void paint(Graphics g) {

        g.drawString("this is an applet window ", 10, 20);
    }

}


class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);

    }
    public void paint(Graphics g) {
        g.drawString("This is in frame window",10,40);

    }
}
