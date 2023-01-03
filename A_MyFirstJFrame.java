import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class A_MyFirstJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setVisible(true);
        // To Close the Window
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        // To resize and position the window
        // frame.setSize(700,500);
        // frame.setLocation(200,50);
        frame.setBounds(50,100,1000,500);
        
        // To set Title of the Window
        frame.setTitle("My First Swing");

        // To set the Window Size
        frame.setSize(700,500);
        
         // To set the Window Icon
         ImageIcon icon = new ImageIcon("pic1.jpg");
         frame.setIconImage(icon.getImage());
 
        // To add content in the body of the window
        Container c=frame.getContentPane();  //Container is in AWT
        c.setBackground(Color.DARK_GRAY);   //To change the background color

        // To disable the resizing of the window
        frame.setResizable(false);
    }
}
