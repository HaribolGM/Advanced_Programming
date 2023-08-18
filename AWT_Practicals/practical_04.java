
/*

//  Execute the following Program and write the output.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class practical_04 extends JFrame implements ActionListener {

    CardLayout card;
    JButton b1, b2, b3;
    Container c;
     practical_04()
     {
         c = getContentPane();
         card= new CardLayout(40,30);
         // create CardLayout object with 40 hor space and 30 ver space
         c.setLayout(card);
         b1= new JButton("Apple");
         b2 = new JButton("Boy");
         b3 = new JButton("Cat");
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         c.add("a",b1);c.add("b",b2);c.add("c",b3)  ;

     }

     public void actionPerformed(ActionEvent e)
     {
         card.next(c);

     }

    public static void main(String[] args) {

         practical_04 pa = new practical_04();
         pa.setSize(400,400);
         pa.setVisible(true);
         pa.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
*/



// Exercise

// Program 1:

import javax.swing.*;
import java.awt.*;

public class practical_04 {


        public static void main(String[] args) {
            JFrame frame = new JFrame("GridBagLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridBagLayout());

            GridBagConstraints constraints = new GridBagConstraints();

            String[] btnLabels = {"Button One", "Button Two", "Button Three", "Button Four", "Button Five"};
            for (int i = 0; i < btnLabels.length; i++) {
                JButton btn = new JButton(btnLabels[i]);
                if (i == 4) {
                    constraints.gridwidth = 2;
                    constraints.gridx = 0;
                } else {
                    constraints.gridwidth = 1;
                    constraints.gridx = i % 2;
                }
                constraints.gridy = i / 2;
                constraints.fill = (i == 4) ? GridBagConstraints.HORIZONTAL : GridBagConstraints.NONE;
                frame.add(btn, constraints);
            }

            frame.setSize(600, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }








// Program 2:
