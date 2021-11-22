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
public class AddContact {
    private JLabel idContact, contactName;
    private JTextField isiID, isiNama;
    private JButton add, back;
    
    public void AddContact(){
        Contact contact = new Contact();
        //Frame
        JFrame addcontact = new JFrame("Add Contact");
        addcontact.setSize(500, 130);
        
        //Isi Frame
        idContact = new JLabel("ID Contact");
        idContact.setBounds(50, 10, 200, 30);
        isiID = new JTextField("");
        isiID.setBounds(260, 10, 200, 30);
        contactName = new JLabel("Contact Name");
        contactName.setBounds(50, 50, 200, 30);
        isiNama = new JTextField("");
        isiNama.setBounds(260, 50, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contact.Contact();
            }
        });
        back.setBounds(50, 90, 100, 30);
        add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        add.setBounds(350, 90, 100, 30);
        
        addcontact.add(idContact);
        addcontact.add(isiID);
        addcontact.add(contactName);
        addcontact.add(isiNama);
        addcontact.add(back);
        addcontact.add(add);
        addcontact.setLayout(null);
        addcontact.setVisible(true);
    }
}
