/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vito
 */
public class MatchSetByAdmin {
    public MatchSetByAdmin() {
        JFrame f2 = new JFrame("Admin Menu");
        f2.setSize(800, 600);
        f2.setLayout(null);
        
        f2.setVisible(true);       
        
        
        JPanel sidemenu = new JPanel();
        sidemenu.setBorder(new EmptyBorder(20, 1, 10, 10));
        sidemenu.setBounds(0, 0, 200,1920);
        sidemenu.setBackground(new Color(20, 33, 89, 255));
        f2.add(sidemenu);

        JLabel appName = new JLabel("Admin");
        appName.setFont(new Font("Serif", Font.ROMAN_BASELINE, 50));
        appName.setForeground(Color.white);
        sidemenu.add(appName);
        
        JButton menu1 = new JButton("insert Data ");
        menu1.setBounds(300, 100, 300, 80);
        Font menu1Font = new Font("Serif", Font.ROMAN_BASELINE, 20);
        menu1.setFont(menu1Font);
        f2.add(menu1);
        
        JButton menu2 = new JButton("Hapus Data");
        menu2.setBounds(300, 200, 300, 80);
        Font menu2Font = new Font("Serif", Font.ROMAN_BASELINE, 20);
        menu2.setFont(menu2Font);
        f2.add(menu2);
        
        JButton menu3 = new JButton("Update Data");
        menu3.setBounds(300, 300, 300, 80);
        Font menu3Font = new Font("Serif", Font.ROMAN_BASELINE, 20);
        menu3.setFont(menu3Font);
        f2.add(menu3);
        
        menu1.addActionListener((ActionEvent e) -> {
            f2.dispose();
            new AddMatch();
        });
        
        menu2.addActionListener((ActionEvent e) -> {
            f2.dispose();
            new DeleteMatch();
        });
        menu3.addActionListener((ActionEvent e) -> {
//            new UpdateMatch();
            f2.dispose();
        });
        
    }
}
