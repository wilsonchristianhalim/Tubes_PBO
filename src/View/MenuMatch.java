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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Vito
 */
public class MenuMatch implements InterfaceScreen{
    JFrame f ;
    JLabel title ;
    JComboBox cb ;
    JButton showHasil , adminButton, back;
    JPanel panel1;
    Font font1 ;
            
    User user ;
    Controller c = new Controller();
    public void MenuMatch(){
        MainMenu main = new MainMenu();
        f = new JFrame("Menu Match");
        
        f.setSize(800,600);
        f.getContentPane().setBackground(new Color(255, 188, 15, 255));
        
        title = new JLabel("Match");
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setBounds(320,5,200,100);
        f.add(title);
        
        adminButton = new JButton("Edit Data Match");
        adminButton.setBounds(590, 20, 150, 50);
        font1 = new Font(adminButton.getFont().getName(), adminButton.getFont().getStyle(), 15);
        adminButton.setFont(font1);
        f.add(adminButton);
        
        ArrayList<Team> teams = new ArrayList();
        teams = c.getAllTeam();
        String arrTim[] = new String[teams.size()];
        
       
        for (int i = 0; i < arrTim.length; i++) {
            arrTim[i] = teams.get(i).getNama_Team();
        }
        
        cb = new JComboBox(arrTim);
        cb.setBounds(50, 100, 250, 50);
        cb.setFont(font1);
        f.add(cb);
        
        showHasil = new JButton("Hasil Match");
        showHasil.setBounds(490, 100, 250, 50);
        Font font2 = new Font(showHasil.getFont().getName(), showHasil.getFont().getStyle(), 20);
        showHasil.setFont(font2);
        f.add(showHasil);
        
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                main.MainMenu();
            }
        });
        back.setBounds(50, 20, 150, 50);
        f.add(back);
       
        panel1 = new JPanel();
        panel1.setBounds(50,190,690,400);
        panel1.setBackground(new Color(255, 188, 15, 255));
        
        ArrayList<Match> match = new ArrayList();
        match = c.getAllMatch();
        
        String data[][] = new String[match.size()][5];        
        for (int i = 0; i < match.size(); i++) {
            data[i][0] = match.get(i).getEventMatch();
            data[i][1] = match.get(i).getTeam();
            data[i][2] = match.get(i).getLawan();
            data[i][3] = match.get(i).getDateMatch();
            data[i][4] = match.get(i).getResult();        
        }

        String column[] = {"Nama Event", "Team" , "Lawan", "tanggal", "Hasil"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        panel1.add(sp);
        
        f.add(panel1);
        
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    
        showHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller c = new Controller();
                
                int idTeam = 0;
                if (cb.getSelectedItem().equals(VALORANT)) {
                    idTeam = 101;
                }
                if (cb.getSelectedItem().equals(MOBILE_LEGENDS)) {
                    idTeam = 102;
                }
                if (cb.getSelectedItem().equals(PUBG)) {
                    idTeam = 103;
                }else {
                    
                }
                ArrayList<Match> matchs = new ArrayList();
                matchs = c.getAllMatchByIdTeam(idTeam);
                
                if (matchs.size() != 0) {
                    new HasilMatch(matchs);

                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal Ditemukan");
                }
            }
        });
        
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MatchSetByAdmin();
            }
        });
        
    }
}
