
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CompanyUser {
    private JButton contact, partner, back;
    
    public void CompanyUser(){
        menuUser main = new menuUser();
        MenuContactUser cont = new MenuContactUser();
        MenuPartnerUser part = new MenuPartnerUser();
        //Frame
        JFrame company = new JFrame("Company");
        company.setSize(300, 600);
        
        //Isi Frame
        contact = new JButton("Contact");
        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont.MenuContactUser();
            }
        });
        contact.setBounds(50, 10, 100, 30);
        partner = new JButton("Partner");
        partner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               part.MenuPartnerUser();
            }
        });
        partner.setBounds(50, 50, 100, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.menuUser();
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


