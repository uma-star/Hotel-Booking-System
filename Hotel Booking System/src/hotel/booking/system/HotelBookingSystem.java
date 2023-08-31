package hotel.booking.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelBookingSystem extends JFrame implements ActionListener{
    
    HotelBookingSystem(){

        setBounds(100,100,1366,565);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ho.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0 ,1366 ,700);  //location x ,location y , length, breadth
        add(image);
        
        JLabel text = new JLabel("HOTEL BOOKING SYSTEM");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.RED);
        text.setFont(new Font("serif",Font.PLAIN,50));
        image.add(text);
        
        JButton next = new JButton("Next");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.addActionListener(this);
        text.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        setVisible(true);
        
        while(true)
        {
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new HotelBookingSystem();
    }
    
}
