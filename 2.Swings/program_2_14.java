import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class program_2_14 {

JTree tree;
JFrame f;
program_2_14(){


    f = new JFrame();
    f.setLayout(new BorderLayout());
    // create top node of tree
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
    top.add(a);
    DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
    top.add(b);

    // create subtree of "A"

    DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
    top.add(a1);
    DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
    top.add(a2);



    // create subtree of "B"

    DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
    top.add(b1);
    DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
    top.add(b2);
    DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
    top.add(b3);


    tree = new JTree(top);
    JScrollPane jsp = new JScrollPane(tree);
    f.add(jsp,BorderLayout.CENTER);
    f.setSize(500,500);
    f.setVisible(true);


}

    public static void main(String[] args) {
        program_2_14 j1 = new program_2_14();
    }
}

