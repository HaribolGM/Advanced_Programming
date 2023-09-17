import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program_3_5  extends JFrame {
    public static void main(String[] args) {
        program_3_5 outer = new program_3_5();
        JButton button = new JButton("Don't Click me!!")    ;
        button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event){
            System.out.println("Oops!!");

        }

        });

        outer.add(button);
        outer.pack();
        outer.setVisible(true);

    }
}
