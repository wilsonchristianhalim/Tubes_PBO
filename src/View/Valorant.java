
package View;

import Controller.*;
import Model.Player;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Valorant{
    JFrame layoutValorant = new JFrame("Valorant");
    JLabel title;
    JPanel buttonPanel;
    JButton showProfile, back;
    
    public void Valorant(){
        menuDivisiGames divisi = new menuDivisiGames();
        Valorant valo = new Valorant();
        layoutValorant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutValorant.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        title = new JLabel("~ V A L O R A N T ~",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        
        showProfile = new JButton("Show Profile");
        showProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> player = Controller.valorant();
                String data[][] = new String[player.size()][4];
                for (int i = 0; i < player.size(); i++) {
                    data[i][0] = player.get(i).getUsername();
                    data[i][1] = player.get(i).getNama();
                    data[i][2] = String.valueOf(player.get(i).getUmur());
                    data[i][3] = player.get(i).getTanggalLahir();
                    
                }
                String column[] = {"Username", "Nama", "Umur", "Tanggal Lahir"};
                JTable jt = new JTable(data, column);
            }
        });
        showProfile.setBounds(600, 50, 200,70);
        showProfile.setFont(StyleSheet.buttonFont);
        
        
        
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                divisi.menuDivisiGames();
            }
        });
        back.setBounds(50, 90, 100, 30);
        
        layoutValorant.add(showProfile);
        layoutValorant.add(back);
        layoutValorant.setLayout(null);
        layoutValorant.setVisible(true);
    }
}
