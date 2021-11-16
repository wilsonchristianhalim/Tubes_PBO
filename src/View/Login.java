/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Wilson
 */
public class Login {
    private JLabel username, password;
    private JTextField insertUsername;
    private JPasswordField insertPassword;
    private JButton clickLogin, clickRegister;
    
    public void Login(){
        MainMenu main = new MainMenu();
        Register regis = new Register();
        JLabel login = new JLabel("Login");
        login.setSize(500, 800);
        
        username = new JLabel("Username");
        username.setBounds(10, 10, 100, 30);
        insertUsername = new JTextField("");
        insertUsername.setBounds(120, 10, 100, 30);
        password = new JLabel("Password");
        password.setBounds(10, 50, 100, 30);
        insertPassword = new JPasswordField("");
        insertPassword.setBounds(120, 50, 100, 30);
        clickLogin = new JButton("Login");
        clickLogin.setBounds(10, 90, 60, 30);
        clickLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.MainMenu();
            }
        });
        clickRegister = new JButton("Register");
        clickRegister.setBounds(90, 90, 60, 30);
        clickLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regis.Register();
            }
        });
        
        login.add(username);
        login.add(insertUsername);
        login.add(password);
        login.add(insertPassword);
        login.add(clickLogin);
        login.add(clickRegister);
        login.setLayout(null);
        login.setVisible(true);
    }
}
