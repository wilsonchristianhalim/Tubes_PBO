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
public class Contact {
    private JButton showContact, addContact, deleteContact;
    
    public void Contact(){
        AddContact add = new AddContact();
        //Frame
        JFrame contact = new JFrame("Contact Menu");
        contact.setSize(300, 600);
        
        //Isi Frame
        showContact = new JButton("Show Contact");
        showContact.setBounds(50, 10, 150, 30);
        showContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
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
                //isi
            }
        });
        deleteContact.setBounds(50, 90, 150, 30);
        
        contact.add(showContact);
        contact.add(addContact);
        contact.add(deleteContact);
        contact.setLayout(null);
        contact.setVisible(true);
    }
}
