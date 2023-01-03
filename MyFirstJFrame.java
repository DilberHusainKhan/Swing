import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class MyFirstJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // frame.setSize(700,500);
        // frame.setLocation(200,50);
        frame.setBounds(50,100,1000,500);
        frame.setTitle("My First Swing");
        ImageIcon icon = new ImageIcon("pic1.jpg");
        frame.setIconImage(icon.getImage());
        Container c=frame.getContentPane();
        c.setBackground(Color.DARK_GRAY);
        frame.setResizable(false);
    }
}
