
package View;

import Controller.Controller;
import Model.Player;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddPlayer implements ActionListener{
    JFrame layoutAddPlayer = new JFrame("Add Player");
    JLabel title;
    JPanel buttonPanel;
    JButton add, cancel;
    
    public AddPlayer(){
        layoutAddPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutAddPlayer.setExtendedState(JFrame.MAXIMIZED_BOTH);
        layoutAddPlayer.getContentPane().setBackground(StyleSheet.backgroundColor);
        
        title = new JLabel("~ A d d  P l a y e r ~",JLabel.CENTER);
        title.setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(StyleSheet.titleFont);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        
        add = new JButton("Add Player");
        add.setBounds(600, 50, 200, 70);
        add.addActionListener(this);
        add.setFont(StyleSheet.buttonFont);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
