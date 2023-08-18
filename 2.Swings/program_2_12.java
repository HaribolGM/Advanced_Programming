//
//
//// Program 2.12: Program to demonstrate JTabbedPane.
//
///*
//<applet code = "program_2_12" width=400 height=100>
//</applet>
// */
//
//import javax.swing.*;
//import java.applet.Applet;
//import java.awt.*;
//
//public class program_2_12 extends Applet {
//
//    public void init()
//    {
//
//      JTabbedPane jpt = new JTabbedPane();
//      jtp.addTab("Language",new LangPanel());
//      jtp.addTab("Colors", new ColorsPanel());
//      jtp.addTab("Flavors",new FlavorsPanel());
//      add(jpt);
//
//
//
//
//    }
//}
//
//
//
//class LangPanel extends JPanel {
//    public LangPanel()
//
//    {
//        JButton b1 = new JButton("Marathi");
//        add(b1);
//        JButton b2 = new JButton("Hindi");
//        add(b2);
//        JButton b3 = new JButton("Bengali");
//        add(b3);
//        JButton b4 = new JButton("Tamil");
//        add(b4);
//    }
//}
//
//
//
//
//
//
//class ColorsPanel extends JPanel
//{
//    public ColorsPanel()
//    {
//        JCheckBox cb1 = new JCheckBox("Red");
//        add(cb1);
//        JCheckBox cb2 = new JCheckBox("Green");
//        add(cb2) ;
//        JCheckBox cb3 = new JCheckBox("Blue");
//        add(cb3) ;
//
//    }
//}
//
//
//class FlavorsPanel extends JPanel
//{
//    public FlavorsPanel()
//    {
//        JComboBox jcb = new JComboBox();
//        jcb.addItem("Vanilla");
//        jcb.addItem("Chocolate");
//        jcb.addItem("Strawberry");
//        add(jcb);
//
//    }
//}