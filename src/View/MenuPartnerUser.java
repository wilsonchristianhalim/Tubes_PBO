
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import Controller.*;
import javax.swing.JOptionPane;


public class MenuPartnerUser {
    private JButton showPartner, back;
    
    public void MenuPartnerUser(){
        CompanyUser company = new CompanyUser();

        //Frame
        JFrame menuPartner = new JFrame("Partner");
        menuPartner.setSize(300, 600);
        
        //Isi Frame
        showPartner = new JButton("Show Partner");
        showPartner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,Controller.SeePartner());
            }
        });
        showPartner.setBounds(50, 10, 150, 30);     
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                company.CompanyUser();
            }
        });
        back.setBounds(5, 130, 150, 30);
        
        menuPartner.add(showPartner);
        menuPartner.add(back);
        menuPartner.setLayout(null);
        menuPartner.setVisible(true);
    }
}


