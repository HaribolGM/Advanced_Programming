import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
<applet code="program_3_7" width=250 height=150> </applet>
 */


public class program_3_7 extends Applet implements ItemListener {
Checkbox cb1 , cb2;
String msg = "";
public void init()
{
    cb1 = new Checkbox("Java", false);
    cb1.setBounds(100,200,50,50);
    add(cb1);
    cb2 = new Checkbox("C++",false);
    cb2.setBounds(100,300,50,50);
    add(cb2);
    cb1.addItemListener(this);
    cb2.addItemListener(this);

}
public void itemStateChanged(ItemEvent ae)
{
    if(cb1.getState() && cb2.getState())
        msg = cb1.getLabel() + "  " + cb2.getLabel();
    else if (cb1.getState()==false && cb2.getState()==false)
        msg= "";
    else if (cb2.getState())
        msg = cb2.getLabel();

    else if (cb1.getState())
        msg = cb1.getLabel();
    repaint();
}
public void paint (Graphics g)
{


    g.drawString("U have Selected "+ msg,100,200);
}
}
