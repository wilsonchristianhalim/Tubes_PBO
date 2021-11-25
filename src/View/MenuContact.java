/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.Controller;
/**
 *
 * @author Wilson
 */
public class MenuContact {
    private JButton showContact, addContact, deleteContact, back;
    
    public void MenuContact(){
        AddContact add = new AddContact();
        DeleteContact del = new DeleteContact();
        Company comp = new Company();
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
        addContact = new JButton("Add Contact");
        addContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add.AddContact();
            }
        });
        addContact.setBounds(50, 50, 150, 30);
        deleteContact = new JButton("Delete Contact");
        deleteContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                del.DeleteContact();
            }
        });
        deleteContact.setBounds(50, 90, 150, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comp.Company();
            }
        });
        back.setBounds(5, 130, 150, 30);
        
        contact.add(showContact);
        contact.add(addContact);
        contact.add(deleteContact);
        contact.add(back);
        contact.setLayout(null);
        contact.setVisible(true);
    }
}
