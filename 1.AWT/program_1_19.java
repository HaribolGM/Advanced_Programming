

// Program 1.19: Program to demonstrate menu bar.


import java.awt.*;

public class program_1_19 extends Frame
{

    public program_1_19()
    {


        MenuBar mBar = new MenuBar();
        setMenuBar(mBar); // add menu bar to frame
        Menu files = new Menu ("Colors");
        Menu exit = new Menu ("Exit");
        mBar.add(files);  // add menus to menu bar
        mBar.add(exit);
        setTitle("Menu Demo");
        setSize(400,400);
        setVisible(true);




    }

    public static void main(String[] args) {
        new program_1_19();
    }



}
