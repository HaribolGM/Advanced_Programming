

// ----------------------Practical 3 ----------


// Code1 : Write java program to demonstrate Grid of 5*5

/*
import java.awt.*;
import java.awt.event.*;

public class practical_03 {
    public static void main(String[] args) {
        Frame frame = new Frame("5x5 Grid Example");
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("10");
        b11 = new Button("11");
        b12 = new Button("12");
        b13 = new Button("13");
        b14 = new Button("14");
        b15 = new Button("15");
        b16 = new Button("16");
        b17 = new Button("17");
        b18 = new Button("18");
        b19 = new Button("19");
        b20 = new Button("20");
        b21 = new Button("21");
        b22 = new Button("22");
        b23 = new Button("23");
        b24 = new Button("24");
        b25 = new Button("25");

        frame.add(b1); frame.add(b2); frame.add(b3); frame.add(b4); frame.add(b5);
        frame.add(b6); frame.add(b7); frame.add(b8); frame.add(b9); frame.add(b10);
        frame.add(b11); frame.add(b12); frame.add(b13); frame.add(b14); frame.add(b15);
        frame.add(b16); frame.add(b17); frame.add(b18); frame.add(b19); frame.add(b20);
        frame.add(b21); frame.add(b22); frame.add(b23); frame.add(b24); frame.add(b25);

        frame.setLayout(new GridLayout(5,5));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
*/





// Code2 : Write a program to display The Number on Button from 0 to 9.

/*
import java.awt.*;
import java.awt.event.*;

public class practical_03 {
    public static void main(String[] args) {
        Frame frame = new Frame("Numbers from 0 to 9");
        Button[] buttons = new Button[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
            frame.add(buttons[i]);
        }

        frame.setLayout(new GridLayout(2, 5));  // Using a 2x5 grid layout to arrange the buttons
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
*/



// Exercise outputs codes :  --- -------------




// Program 1 : Write a program to generate following output:

/*
import java.awt.*;
import java.awt.event.*;

public class practical_03 {

    public static void main(String[] args) {
        Frame frame = new Frame("Button Arrangement Example");

        // Setting the layout of frame to null for manual positioning and sizing
        frame.setLayout(null);

        // Creating buttons
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button button5 = new Button("Button5");

        // Setting the position and size of each button using setBounds(x, y, width, height)
        button1.setBounds(0, 30, 100, 30);     // x, y, width, height
        button3.setBounds(0, 70, 100, 30);
        button5.setBounds(0, 110, 100, 30);

        button2.setBounds(150, 30, 100, 30);    // 20px distance from the first column
        button4.setBounds(150, 70, 100, 30);

        // Adding the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setSize(260, 170);
        frame.setVisible(true);

        // Adding a window listener to close the application when the window is closed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}


*/



// Program 2 : Write a program to generate following output using Border layout



import java.awt.*;
public class practical_03 extends Frame{
    private Button btnNorth, btnSouth, btnCenter, btnEast, btnWest;
    public practical_03()
    {
        setLayout(new BorderLayout(3,1));
        btnNorth = new Button("NORTH");
        add(btnNorth, BorderLayout.NORTH);





    }
}














































