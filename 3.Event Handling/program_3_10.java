

// Program 3.10 : Handling mouse motion events.


import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="program_3_10" width=300 height=400> </applet>
 */
public class program_3_10  extends Applet implements MouseMotionListener {

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent m ){
        showStatus("Mouse Moved ");
        repaint();

    }

    public void mouseDragged(MouseEvent m ) {
        showStatus("Mouse Dragged");
        repaint();
    }


}
