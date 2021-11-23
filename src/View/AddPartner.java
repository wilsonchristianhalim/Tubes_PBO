/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
import Model.Partner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Wilson
 */
public class AddPartner {
    private JLabel idPartner, partnerName;
    private JTextField isiID, isiNama;
    private JButton add, back;
    
    public void AddPartner(){
        MenuPartner partner = new MenuPartner();
        //Frame
        JFrame addPartner = new JFrame("Add Partner");
        addPartner.setSize(500, 600);
        
        //Isi Frame
        idPartner = new JLabel("ID Partner");
        idPartner.setBounds(50, 10, 200, 30);
        isiID = new JTextField("");
        isiID.setBounds(260, 10, 200, 30);
        partnerName = new JLabel("Partner Name");
        partnerName.setBounds(50, 50, 200, 30);
        isiNama = new JTextField("");
        isiNama.setBounds(260, 50, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                partner.MenuPartner();
            }
        });
        back.setBounds(50, 90, 100, 30);
        add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Partner partners = new Partner();
                partners.setID_Partner(isiID.getText());
                partners.setPartner_Name(isiNama.getText());
                Controller.AddPartner(partners);
                partner.MenuPartner();
            }
        });
        add.setBounds(350, 90, 100, 30);
        
        addPartner.add(idPartner);
        addPartner.add(isiID);
        addPartner.add(partnerName);
        addPartner.add(isiNama);
        addPartner.add(add);
        addPartner.add(back);
        addPartner.setLayout(null);
        addPartner.setVisible(true);
    }
}
