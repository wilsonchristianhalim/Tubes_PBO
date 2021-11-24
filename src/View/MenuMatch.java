/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Match;
import Model.Team;
import Model.User;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Vito
 */
public class MenuMatch {
    JFrame f ;
    JLabel title ;
    
            
    Controller c = new Controller();
    public MenuMatch(){
        f = new JFrame("Menu Metch");
        
        f.setSize(800,600);
        f.getContentPane().setBackground(new Color(255, 188, 15, 255));
    
        title = new JLabel("Match");
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setBounds(320,10,200,100);
        f.add(title);
        
        ArrayList<Team> teams = new ArrayList();
        teams = c.getAllTeam();
        
        String arrTim[] = new String[teams.size()];
        for (int i = 0; i < arrTim.length; i++) {
            arrTim[i] = teams.get(i).getNama_Team();
        }
        
        JComboBox cb = new JComboBox(arrTim);
        cb.setBounds(50, 220, 400, 50);
        Font newTextFieldFont7 = new Font(cb.getFont().getName(), cb.getFont().getStyle(), 20);
        cb.setFont(newTextFieldFont7);
        f.add(cb);
        
        JButton showHasil = new JButton("Hasil Match");
        showHasil.setBounds(270, 350, 250, 50);
        Font newTextFieldFont12 = new Font(showHasil.getFont().getName(), showHasil.getFont().getStyle(), 20);
        showHasil.setFont(newTextFieldFont12);
        f.add(showHasil);
        
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        showHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller c = new Controller();
                
                int idTeam = 0;
                if (cb.getSelectedItem().equals("Valorant")) {
                    idTeam = 101;
                }
                if (cb.getSelectedItem().equals("Mobile Legend")) {
                    idTeam = 102;
                }
                if (cb.getSelectedItem().equals("PUBG")) {
                    idTeam = 103;
                }
                
                ArrayList<Match> matchs = new ArrayList();
                matchs = c.getAllMatchByIdTeam(idTeam);
                
                new HasilMatch(matchs);
//                if (matchs.size() != 0) {
//                    JOptionPane.showMessageDialog(null, "Data Ditemukan");
//                    
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Gagal Ditemukan");
//                }
            }
        });
    }
}
