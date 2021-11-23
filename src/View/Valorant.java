
package View;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Valorant {
    JFrame layoutValorant = new JFrame("Valorant");
    JLabel title;
    JPanel buttonPanel;
    JButton showProfile, back;
    
    public void Valorant(){
        menuDivisiGames valo = new menuDivisiGames();
        layoutValorant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutValorant.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("~ V A L O R A N T ~",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        
        showProfile = new JButton("Valorant");
        showProfile.setBounds(600, 50, 200,70);
        showProfile.addActionListener((ActionListener) this);
        showProfile.setFont(StyleSheet.buttonFont);
        
        
    }
}
