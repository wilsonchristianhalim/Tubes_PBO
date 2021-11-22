/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Wilson
 */
public class Company {
    private JButton contact, partner, back;
    
    public void Company(){
        MainMenu main = new MainMenu();
        Contact cont = new Contact();
        //Frame
        JFrame company = new JFrame("Company");
        company.setSize(300, 600);
        
        //Isi Frame
        contact = new JButton("Contact");
        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont.Contact();
            }
        });
        contact.setBounds(50, 10, 100, 30);
        partner = new JButton("Partner");
        partner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        partner.setBounds(50, 50, 100, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.MainMenu();
            }
        });
        back.setBounds(50, 90, 100, 30);
        
        company.add(contact);
        company.add(partner);
        company.add(back);
        company.setLayout(null);
        company.setVisible(true);
    }
}
