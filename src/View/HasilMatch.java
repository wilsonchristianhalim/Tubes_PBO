/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Match;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Vito
 */
public class HasilMatch {
    JFrame f;
    
    public HasilMatch(ArrayList<Match> match) {
        f = new JFrame();
        String data[][] = new String[match.size()][5];        
        for (int i = 0; i < match.size(); i++) {
            System.out.println(data[i][0] = match.get(i).getEventMatch());
            data[i][1] = match.get(i).getTeam();
            data[i][2] = match.get(i).getLawan();
            data[i][3] = match.get(i).getDateMatch();
            data[i][4] = match.get(i).getResult();        
        }

        String column[] = {"Nama Event", "Team" , "Lawan", "tanggal", "Hasil"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 300, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setLocationRelativeTo(null);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
