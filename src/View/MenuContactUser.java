
package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MenuContactUser {
     private JButton showContact, back;
    
    public void MenuContactUser(){
        CompanyUser comp = new CompanyUser();
        //Frame
        JFrame contact = new JFrame("Contact Menu");
        contact.setSize(300, 600);
        
        //Isi Frame
        showContact = new JButton("Show Contact");
        showContact.setBounds(50, 10, 150, 30);
        showContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,Controller.SeeContact());
            }
        }); 
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comp.CompanyUser();
            }
        });
        back.setBounds(5, 130, 150, 30);
        contact.add(showContact);
        contact.add(back);
        contact.setLayout(null);
        contact.setVisible(true);
    }
}

