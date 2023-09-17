

// Program 3.8 : Handling key events.


import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.*;

/*
<applet code="program_3_8" width=250 height=150> </applet>
 */
public class program_3_8 extends Applet implements KeyListener {

    String msg = "";

    public void init() {
        addKeyListener(this);
    }

    public void keyReleased(KeyEvent k) {
        showStatus("KeyReleased");
        repaint();
    }

    public void keyTyped(KeyEvent k) {
        msg += k.getKeyCode();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 10);

    }

    public void keyPressed(KeyEvent k) {
        int key = k.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1:
                msg += "F1";
                break;

            case KeyEvent.VK_F2:
                msg += "F2";
                break;

            case KeyEvent.VK_F3:
                msg += "F3";
                break;

            case KeyEvent.VK_F4:
                msg += "F4";
                break;

            case KeyEvent.VK_RIGHT:
                msg += "RIGHT";
                break;

            case KeyEvent.VK_LEFT:
                msg += "LEFT";
                break;
            case KeyEvent.VK_UP:
                msg += "UP";
                break;

            case KeyEvent.VK_DOWN:
                msg += "DOWN";
                break;


        }
    }
}



