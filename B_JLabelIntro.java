import javax.swing.*;
import java.awt.*;

public class B_JLabelIntro {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(870,0,500,600);
        frame.setTitle("JLabel Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        // set font 
        Font Bold =new Font("Times New Roman", Font.BOLD, 20);
        Font Normal =new Font("Times New Roman", Font.PLAIN, 18);

        // set lable 
        JLabel Sign_Up = new JLabel("Sign Up");
        JLabel Id = new JLabel("Student ID");
        JLabel Name = new JLabel("Student Name");
        JLabel Add = new JLabel("Student Address");
        JLabel Mobile = new JLabel("Student Mobile");
        
        // set locatio in the Container 
        Sign_Up.setBounds(200,80,100,100);
        Id.setBounds(100,150,200,50);
        Name.setBounds(100,200,200,50);
        Add.setBounds(100,250,200,50);
        Mobile.setBounds(100,300,200,50);
        
        // Add Font
        Sign_Up.setFont(Bold);
        Id.setFont(Normal);
        Name.setFont(Normal);
        Add.setFont(Normal);
        Mobile.setFont(Normal);
        
        // Set Frame Icon
        ImageIcon icon = new ImageIcon("./signup.png");
        frame.setIconImage(icon.getImage());

        
        // To add image to the Container 
        ImageIcon signup =new ImageIcon("./signup.png");
        JLabel image = new JLabel(signup,JLabel.CENTER);
        image.setBounds(0,20,500,100);
        // Image at bottom part
        JLabel image1 = new JLabel("Sign UP",signup,JLabel.CENTER);
        image1.setBounds(0,450,500,signup.getIconHeight());



        // add lable to the Container 
        c.add(Sign_Up);
        c.add(Id);
        c.add(Name);
        c.add(Add);
        c.add(Mobile);
        c.add(image);
        c.add(image1);
        

        frame.setResizable(false);
    }
}
