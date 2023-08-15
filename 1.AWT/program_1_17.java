

// Program 1.17:  Program for CardLayout.




import java.awt.*;

public class program_1_17 extends Frame {
    CardLayout card = new CardLayout(20,20);
    program_1_17(){
        setTitle("CardLayout in Java Example");
        setSize(220,150);
        setVisible(true);
        setLayout(card);
        Button Btnfirst  = new Button ("First");
        Button BtnSecond = new Button ("Second");
        Button BtnThird  = new Button ("Third");
        add(Btnfirst,"Card1");
        add(BtnSecond, "Card2");
        add(BtnThird, "Card3");

    }



    public static void main(String[] args) {
         program_1_17 frame = new program_1_17();


    }
}
