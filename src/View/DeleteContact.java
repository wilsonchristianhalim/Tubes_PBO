/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.*;
/**
 *
 * @author Wilson
 */
public class DeleteContact {
    JLabel contactName;
    JTextField isiNama;
    JButton delete, back;
    
    public void DeleteContact(){
        MenuContact cont = new MenuContact();
        //Frame
        JFrame deletecontact = new JFrame("Delete Contact");
        delete.setSize(500, 100);
        
        //Isi Frame
        contactName = new JLabel("Contact Name");
        contactName.setBounds(50, 10, 200, 30);
        isiNama = new JTextField("");
        isiNama.setBounds(260, 10, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont.MenuContact();
            }
        });
        back.setBounds(50, 50, 100, 30);
        delete = new JButton("Delete");
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Controller.DeleteContact(isiNama.getText());
            }
        });
        delete.setBounds(350, 50, 100, 30);
    }
}
