import javax.swing.*;
public class MyFirstJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // frame.setSize(700,500);
        // frame.setLocation(200,50);
        frame.setBounds(50,100,500,500);
        frame.setTitle("My First Swing");
        ImageIcon icon = new ImageIcon("pic1.jpg");
        icon.setImage(icon.getImage());
    }
}
