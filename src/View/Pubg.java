package View;

import Controller.Controller;
import Model.Player;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Pubg {

    JFrame layoutPUBG = new JFrame("PUBG");
    JLabel title;
    JPanel buttonPanel;
    JButton showProfile, back;

    public void Pubg() {

        menuDivisiGames divisi = new menuDivisiGames();
        layoutPUBG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutPUBG.setExtendedState(JFrame.MAXIMIZED_BOTH);

        title = new JLabel("~ P U B G ~", JLabel.CENTER);
        title.setBounds(0, 0, (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 5);

        buttonPanel = new JPanel();
        buttonPanel.setBounds(50, 190, 690, 400);

        showProfile = new JButton("Show Profile");
        showProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> player = Controller.PUBG();
                String data[][] = new String[player.size()][4];
                for (int i = 0; i < player.size(); i++) {
                    data[i][0] = player.get(i).getUsername();
                    data[i][1] = player.get(i).getNama();
                    data[i][2] = String.valueOf(player.get(i).getUmur());
                    data[i][3] = player.get(i).getTanggalLahir();
                }
                String column[] = {"Username", "Nama", "Umur", "Tanggal Lahir"};
                JTable jt = new JTable(data, column);
                buttonPanel.add(jt);
                layoutPUBG.add(buttonPanel);
                layoutPUBG.setVisible(true);
                layoutPUBG.setLayout(null);
            }
        });
        showProfile.setBounds(600, 50, 200, 70);
        showProfile.setFont(StyleSheet.buttonFont);

        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                divisi.menuDivisiGames();
            }
        });
        back.setBounds(50, 90, 100, 30);

        layoutPUBG.add(showProfile);
        layoutPUBG.add(back);
        layoutPUBG.setLayout(null);
        layoutPUBG.setVisible(true);
    }
}
