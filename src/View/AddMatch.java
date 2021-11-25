/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Match;
import Model.News;
import Model.Team;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vito
 */
public class AddMatch implements InterfaceScreen{
    JButton add, back;
    JLabel event , team, lawan, date, result;
    JTextField isiEvent, isiTeam, isiLawan, isiDate, isiResult;
    JComboBox cb;
    public AddMatch(){
        Controller c = new Controller();
        //Frame
        JFrame f = new JFrame("Add Match");
        f.setSize(800, 600);
//        
//        Isi Frame
        event=new JLabel("Event ");
        event.setBounds(50, 10, 200, 30);
        f.add(event);
        isiEvent = new JTextField();
        isiEvent.setBounds(260, 10, 300, 30);
        f.add(isiEvent);
        
        team = new JLabel("Team");
        team.setBounds(50, 50, 200, 30);
        f.add(team);
        
        ArrayList<Team> teams = new ArrayList();
        teams = c.getAllTeam();
        String arrTim[] = new String[teams.size()];
        
       
        for (int i = 0; i < arrTim.length; i++) {
            arrTim[i] = teams.get(i).getNama_Team();
        }
        
        cb = new JComboBox(arrTim);
        cb.setBounds(260, 50, 3000, 30);
        f.add(cb);
              
        lawan = new JLabel("Lawan");
        lawan.setBounds(50, 90, 200, 30);
        f.add(lawan);
        isiLawan = new JTextField("");
        isiLawan.setBounds(260, 90, 300, 30);
        f.add(isiLawan);
        
        date = new JLabel("Date");
        date.setBounds(50, 130, 300, 30);
        f.add(date);
        isiDate = new JTextField("");
        isiDate.setBounds(260, 130, 300, 30);
        f.add(isiDate);
        
        result = new JLabel("Result");
        result.setBounds(50, 170, 200, 30);
        f.add(result);
        isiResult = new JTextField("");
        isiResult.setBounds(260, 170, 300, 30);
        f.add(isiResult);
        
        back = new JButton("Back");
        back.setBounds(50, 230, 100, 30);
        f.add(back);
        
        add = new JButton("Add");
        add.setBounds(350, 230, 100, 30);
        f.add(add);
        
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuMatch();
            }
        });
        
        add.addActionListener(new ActionListener() {
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
                Match match = new Match();
                match.setEventMatch(isiEvent.getText());
                match.setLawan(isiLawan.getText());
                match.setDateMatch(isiDate.getText());
                match.setResult(isiResult.getText());
                
                Controller.AddNewMatch(match , idTeam);
                new MenuMatch();
            }
        });
        
        
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    
        
    }
}
