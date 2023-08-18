//
//
//// Program 2.13: Program to demonstrate JScrollPane.
//
//
//
//
//import javax.swing.*;
//import java.awt.*;
//
//public class program_2_13 extends JApplet {
//
//
//public void init(){
//
//
//    setLayout(new BorderLayout());
//    JPanel jp = new JPanel();
//    jp.setLayout(new GridLayout(10,10));
//    int b = 0;
//    for(int i = 0 ; i < 10; i++){
//        jp.add(new JButton("Button" + b));
//        ++b;
//    }
//}
//
//int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
//int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
//JScrollPane jsp = new JScrollPane(jp,v,h);
//add(jsp, BorderLayout.CENTER);
//
//
//}
