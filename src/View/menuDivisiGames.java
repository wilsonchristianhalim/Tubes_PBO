
package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menuDivisiGames implements ActionListener{
    JFrame layoutDivisi = new JFrame("Menu Divisi Games");
    JLabel title;
    JPanel buttonPanel;
    JButton bValorant,bMobileLegend, bPubg, logOut;
    MainMenu main = new MainMenu();
    Valorant val = new Valorant();
    MobileLegend ml = new MobileLegend();
    Pubg pubg = new Pubg();
    
    public void menuDivisiGames(){

        layoutDivisi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutDivisi.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("~ M E N U  D I V I S I   ~",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        
        bValorant = new JButton("Valorant");
        bValorant.setBounds(100, 50, 200, 70);
        bValorant.addActionListener((ActionListener) this);
        bValorant.setFont(StyleSheet.buttonFont);
        
        bMobileLegend = new JButton("Mobile Legend");
        bMobileLegend.setBounds(400, 50, 200, 70);
        bMobileLegend.addActionListener((ActionListener) this);
        bMobileLegend.setFont(StyleSheet.buttonFont);
        
        bPubg = new JButton("PUBG");
        bPubg.setBounds(700, 50, 200, 70);
        bPubg.addActionListener((ActionListener) this);
        bPubg.setFont(StyleSheet.buttonFont);
        
        logOut = new JButton("Log Out");
        logOut.setBounds(1000, 50, 200,70);
        logOut.addActionListener((ActionListener) this);
        logOut.setFont(StyleSheet.buttonFont);
        
        buttonPanel.add(bValorant);
        buttonPanel.add(bMobileLegend);
        buttonPanel.add(bPubg);
        buttonPanel.add(logOut);
        buttonPanel.setBounds(0, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        buttonPanel.setBackground(StyleSheet.backgroundColor);
        
        layoutDivisi.add(title);
        layoutDivisi.add(buttonPanel);
        layoutDivisi.setLayout(null);
        layoutDivisi.setVisible(true);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "Valorant" :
                layoutDivisi.dispose();
                val.Valorant();
                break;
            case "Mobile Legend":
                layoutDivisi.dispose();
                ml.MobileLegend();
                break;
            case "PUBG":
                layoutDivisi.dispose();
                pubg.Pubg();
                break;
            case "Log Out":
                int jawab = JOptionPane.showOptionDialog(null, 
                    "Log Out Now?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
                if(jawab == JOptionPane.YES_OPTION){
                    layoutDivisi.dispose();
                    new MainMenu();
                }
                break;
        }
    }
}
