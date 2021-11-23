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
public class DeletePartner {
    private JLabel partnerName;
    private JTextField isiNama;
    private JButton delete, back;
    
    public void DeletePartner(){
        MenuPartner partner = new MenuPartner();
        //Frame
        JFrame deletePartner = new JFrame("Delete Partner");
        deletePartner.setSize(500, 600);
        
        //Isi Frame
        partnerName = new JLabel("Partner Name");
        partnerName.setBounds(50, 10, 200, 30);
        isiNama = new JTextField("");
        isiNama.setBounds(260, 10, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                partner.MenuPartner();
            }
        });
        back.setBounds(50, 50, 100, 30);
        delete = new JButton("Delete");
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        delete.setBounds(350, 50, 100, 30);
        
        deletePartner.add(partnerName);
        deletePartner.add(isiNama);
        deletePartner.add(back);
        deletePartner.add(delete);
        deletePartner.setLayout(null);
        deletePartner.setVisible(true);
    }
}
