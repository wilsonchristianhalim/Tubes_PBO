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
public class MenuPartner {
    private JButton showPartner, addPartner, deletePartner, back;
    
    public void MenuPartner(){
        Company company = new Company();
        //Frame
        JFrame menuPartner = new JFrame("Partner");
        menuPartner.setSize(300, 600);
        
        //Isi Frame
        showPartner = new JButton("Show Partner");
        showPartner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        showPartner.setBounds(50, 10, 150, 30);
        addPartner = new JButton("Add Partner");
        addPartner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        addPartner.setBounds(50, 50, 150, 30);
        deletePartner = new JButton("Delete Partner");
        deletePartner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        deletePartner.setBounds(50, 90, 150, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                company.Company();
            }
        });
        back.setBounds(5, 130, 150, 30);
        
        menuPartner.add(showPartner);
        menuPartner.add(addPartner);
        menuPartner.add(deletePartner);
        menuPartner.add(back);
        menuPartner.setLayout(null);
        menuPartner.setVisible(true);
    }
}
