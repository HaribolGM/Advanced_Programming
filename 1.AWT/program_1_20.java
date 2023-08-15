

// Program 1.20: Program for menus.



import java.awt.*;

public class program_1_20 extends Frame {

public program_1_20(){



    MenuBar mBar = new MenuBar();
    setMenuBar(mBar);                           // add menu bar to frame
    Menu files = new Menu("Colors");
    Menu exit = new Menu ("Exist");
    mBar.add(files);                           // add menus to menu bar
    mBar.add(exit);
    MenuItem mi1 = new MenuItem("RED");
    files.add(mi1);
    files.add(new MenuItem("Green"));
    files.addSeparator();
    files.add(new MenuItem("BLUE"));
    exit.add(new MenuItem("Close"));
    setTitle("Menu Demo");
    setSize(400,400);
    setVisible(true);


}

    public static void main(String[] args) {

    new program_1_20();

    }
}
