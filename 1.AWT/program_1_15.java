

// program 1.15: Program to demonstrate BorderLayout


import java.awt.*;

public class program_1_15 extends Frame{

    private Button btnNorth, btnSouth, btnCenter, btnEast, btnWest;

    public program_1_15(){

        setLayout(new BorderLayout(3,3));
        btnNorth = new Button("NORTH");
        add(btnNorth, BorderLayout.NORTH);

        btnSouth = new Button("SOUTH");
        add(btnSouth, BorderLayout.SOUTH);

        btnCenter = new Button("CENTER");
        add(btnCenter, BorderLayout.CENTER);

        btnEast = new Button("EAST");
        add(btnEast, BorderLayout.EAST);

        btnWest = new Button("WEST");
        add(btnWest, BorderLayout.WEST);


        setTitle ("BorderLayout Demo");
        setSize(280,150);
        setVisible(true);





    }

    public static void main(String[] args) {

        new program_1_15();

    }
}
