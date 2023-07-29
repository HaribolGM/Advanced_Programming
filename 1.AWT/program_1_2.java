

// Program 1.2 : By extending Frame class.

import java.awt.*;

    public class program_1_2 extends Frame {

        program_1_2() {
            setLayout(null);
            setVisible(true);
            setSize(500, 500);
            setTitle("hello");
        }

        public void paint(Graphics g)

        {
            g.drawString("How are You?",100,50);
        }


        public static void main(String[] args) {

            program_1_2 pa = new program_1_2();

        }



}


