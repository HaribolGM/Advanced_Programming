import javax.swing.*;

public class program_2_15 {
    JFrame f;
    program_2_15(){
        f = new JFrame();
        String rows [][] = {      {"100","Amit","6748483"},
                                  {"200","JK","5445565"},
                                  {"300","Darshan","88899456"}
                                  };

        String columns[] = {"ID","NAME","SALARY"};
        JTable jt = new JTable(rows,columns);
        jt.setBounds(30,40,200,300);
        JScrollPane  sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new program_2_15();
    }
}
