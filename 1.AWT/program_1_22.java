import java.awt.*;

public class program_1_22 extends Frame


{

    program_1_22(String title)
    {
        super(title);

    }


}



class FileDialogDemo
{

    public static void main(String[] args) {

        Frame  f = new program_1_22("File Dialog demo");
        f.setVisible(true);
        f.setSize(100,100);
        FileDialog fd = new FileDialog(f, "File Dialog");
        fd.setVisible(true);
    }

}