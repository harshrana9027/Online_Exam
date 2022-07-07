/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Online_Exam
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("ONLINE EXAM");
        JButton b=new JButton("Submit");
        
        JLabel l1=new JLabel("Q1.    Where  Is  The  Headquarter  Of   W.H.O ?");
        JLabel l2=new JLabel("Q2.    What   Was The  Capital  City  Of   Rome ?");
        
        JRadioButton b1=new JRadioButton("U.S.A");
        JRadioButton b2=new JRadioButton("Italy");
        JRadioButton b3=new JRadioButton("Geneva");
        JRadioButton b4=new JRadioButton("Africa");
        
        l1.setForeground(Color.red);
        l2.setForeground(Color.red);
        
         b1.setForeground(Color.black);
         b2.setForeground(Color.black);
         b3.setForeground(Color.black);
        b4.setForeground(Color.black);
        
        
        JRadioButton b5=new JRadioButton("Wasington D.C");
        JRadioButton b6=new JRadioButton("Italy");
        JRadioButton b7=new JRadioButton("Venezulla");
        JRadioButton b8=new JRadioButton("Tashkent");
        
        b5.setForeground(Color.black);
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        
        
        l1.setBounds(70,30,400,70);
        l2.setBounds(70,350,400,70);
        
        
        b1.setBounds(70,90,70,80);
        b2.setBounds(70,150,90,80);
        b3.setBounds(70,210,90,80);
        b4.setBounds(70,270,90,80);
        
        b5.setBounds(70,400,130,70);
        b6.setBounds(70,460,100,70);
        b7.setBounds(70,520,100,70);
        b8.setBounds(70,580,100,70);
        
        b.setBounds(100,700,160,50);
        
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   
                if(b3.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q1 . Correct answer : ");
                }
                
                if(b6.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q2 . Correct answer : ");
                }
                 if(b1.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q1 . Wrong answer : ");
                }
                  if(b2.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q1 . Wrong answer : ");
                }
                   if(b4.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q1 . Wrong answer : ");
                }
                
                
                
                
                
                if(b5.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q2 . Wrong answer : ");
                }
                
                if(b7.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q2 . Wrong answer : ");
                }
                
                if(b8.isSelected())
                {
                    JOptionPane.showMessageDialog(f," Q2 . Wrong answer : ");
                }
                
                if(b1.isSelected() && b5.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b1.isSelected() && b7.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                    
                    
                    l1.setBounds(40,110,500,100);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b1.isSelected() && b8.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b2.isSelected() && b5.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b2.isSelected() && b7.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b2.isSelected() && b8.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b4.isSelected() && b5.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b4.isSelected() && b7.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                if(b4.isSelected() && b8.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel(" SORRY YOU ARE NOT SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                
                 if(b3.isSelected() && b5.isSelected())
                {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE  SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                }
                 
                  if(b3.isSelected() && b6.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b3.isSelected() && b7.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                    // f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b3.isSelected() && b8.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b1.isSelected() && b6.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b2.isSelected() && b6.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b3.isSelected() && b6.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  if(b4.isSelected() && b6.isSelected())
                   {
                    JFrame f1=new JFrame("RESULT");
                    JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                    l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                    l1.setForeground(Color.red);
                          
                    f1.add(l1);
                    f1.setSize(500,900);
                    f1.setLayout(null);
                    f1.setVisible(true);
                    
                   }
                  
                  if(b1.isSelected())
                    {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                     }
                   if(b2.isSelected())
                    {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                     }
                    if(b3.isSelected())
                    {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                     }
                     if(b4.isSelected())
                     {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                      }
                     
                      if(b5.isSelected())
                      {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                       }
                      
                       if(b6.isSelected())
                      {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                       }
                        if(b7.isSelected())
                       {
                      JFrame f1=new JFrame("RESULT");
                      JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                       l1.setBounds(40,110,500,100);
                     //f.getContentPane().setBackground(Color.gray);
                      l1.setForeground(Color.red);
                          
                      f1.add(l1);
                      f1.setSize(500,900);
                      f1.setLayout(null);
                      f1.setVisible(true);
                      
                        }
                         if(b8.isSelected())
                         {
                           JFrame f1=new JFrame("RESULT");
                           JLabel l1=new JLabel("  YOU ARE NOT  SELECTED : ");
                    
                            l1.setBounds(40,110,500,100);
                            //f.getContentPane().setBackground(Color.gray);
                            l1.setForeground(Color.red);
                          
                            f1.add(l1);
                           f1.setSize(500,900);
                            f1.setLayout(null);
                            f1.setVisible(true);
                      
                           }
                
                
                
            }
            
        });
        
        f.add(l1);f.add(l2);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b);
        
        
        f.setSize(500,900);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}