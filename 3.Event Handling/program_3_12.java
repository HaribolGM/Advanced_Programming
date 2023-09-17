

// Program 3.12 : Program for WindowsListener interface.


import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.*;

public class program_3_12 extends Frame implements WindowListener {

    program_3_12(){
        setTitle("Windows Listener");
        setBounds(100,200,200,200);
        setVisible(true);
        addWindowListener(this);
    }


    public void windowClosing(WindowEvent e) {
        System.out.println("Windows Closing");
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Open");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public static void main(String[] args) {
        program_3_12 frame = new program_3_12();
    }

}
