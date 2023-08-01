

// Write a progarm to demonstrate that use of AWT Compoenents

// 1. Develop a program using Label to display message " Welcome to java"
// 2. Develop a program to select multiple languages known to user (e.g Marathi, Hindi,
// English, Sanskirt)
// 3. Write a program to create three Buttons with Caption OK, RESET and CANCEL.



//
////Solutions
//
//// 1. Develop a program using Label to display message " Welcome to java"
//
//import java.awt.*;
//
//public class practical_01 extends Frame {
//
//
//
//    practical_01(String s)
//    {
//
//        super(s);
//        setLayout(null);
//        setVisible(true);
//        setSize(500,300);
//        Label one  = new Label("Welcome To Java");
//
//
//        // set the position of controls
//
//        one.setBounds(50,50,100,100);
//
//        add(one);
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//practical_01 pa = new practical_01("Pratical 0.0.1");
//
//
//    }
//}






// 2. Develop a program to select multiple languages known to user (e.g Marathi, Hindi,
// English, Sanskirt)

//import java.awt.*;
//
//public class practical_01 extends Frame {
//
//
//    String msg = "";
//    List l ;
//
//    practical_01(String s)
//    {
//        setLayout(null);
//        setVisible(true);
//        setSize(300,300);
//        l = new List(5,true);
//        setTitle("Multiple Lanaguages Select");
//        l.add("Marathi");
//        l.add("Hindi");
//        l.add("English");
//        l.add("Sanskrit");
//        l.setBounds(100,100,100,100);
//        add(l);
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//        practical_01 pa = new practical_01("");
//
//
//    }
//}



// 3. Write a program to create three Buttons with Caption OK, RESET and CANCEL.


import java.awt.*;

public class practical_01 extends Frame {




    Button ok, cancel, reset;
    practical_01(String s) {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500, 200);
        ok = new Button("OK");
        reset = new Button("RESET");
        cancel = new Button("CANCEL");
        ok.setBounds(50, 50, 50, 50);
        reset.setBounds(150, 50, 100, 50);
        cancel.setBounds(300, 50, 100, 50);

        add(ok);
        add(reset);
        add(cancel);


    }
    public static void main(String[] args) {


        practical_01 pa = new practical_01("Buttons with Caption");


    }
}

