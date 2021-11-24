
package View;

import Controller.Controller;
import Model.PersonManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Model.Type.*;

public class FormLogin extends JFrame implements ActionListener{
    JFrame loginPage = new JFrame("Form Login");
    JLabel title,usernameLabel, passwordLabel;
    JTextField username;
    JPasswordField password;
    JPanel dataPanel;
    JButton cancelButton, loginButton, registerButton;
    
    public FormLogin(){
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loginPage.getContentPane().setBackground(StyleSheet.backgroundColor);

        title = new JLabel("L O G I N",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(StyleSheet.titleFont);
        
        dataPanel = new JPanel();
        dataPanel.setLayout(null);
        
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10,10,150,50);
        usernameLabel.setFont(StyleSheet.formFont);
        username = new JTextField();
        username.setBounds(180,10,320,50);
        username.setFont(StyleSheet.formFont);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,80,150,50);
        passwordLabel.setFont(StyleSheet.formFont);
        password = new JPasswordField();
        password.setBounds(180, 80, 320, 50);
        password.setFont(StyleSheet.formFont);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(30,170,150,70);
        cancelButton.setFont(StyleSheet.formFont);
        cancelButton.addActionListener(this);
        cancelButton.setBackground(StyleSheet.cancelButtonColor);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(320,170,150,70);
        loginButton.setFont(StyleSheet.formFont);
        loginButton.addActionListener(this);
        
        registerButton = new JButton("Click here to register new account");
        registerButton.setBounds(90,250,300,50);
        registerButton.setFont(StyleSheet.formFont);
        registerButton.setBorder(null);
        registerButton.setBackground(StyleSheet.backgroundColor);
        registerButton.addActionListener(this);
        
        dataPanel.add(usernameLabel);
        dataPanel.add(username);
        dataPanel.add(passwordLabel);
        dataPanel.add(password);
        dataPanel.add(cancelButton);
        dataPanel.add(loginButton);
        dataPanel.add(registerButton);
        dataPanel.setBounds(710, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,500,700);
        dataPanel.setBackground(StyleSheet.backgroundColor);
        
        loginPage.add(title);
        loginPage.add(dataPanel);
        loginPage.setLayout(null);
        loginPage.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "Cancel" :
                loginPage.dispose();
                new MainMenu();
                break;
            case "Login":
                String uname = username.getText();
                String pass = new String(password.getPassword());
                if (uname.equals("") && pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please insert username and password!", "Alert", JOptionPane.WARNING_MESSAGE);
                } else if (uname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please insert username!", "Alert", JOptionPane.WARNING_MESSAGE);
                } else if (pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please insert password!", "Alert", JOptionPane.WARNING_MESSAGE);
                } else if (Controller.cekPassword(uname, pass)) {
                    PersonManager.getInstance().setPerson(Controller.getUser(uname));
                    if (PersonManager.getInstance().getPerson().getTipePerson() == Type.ADMIN) {
                        loginPage.dispose();
                        new menuAdmin();
                    } else if (PersonManager.getInstance().getPerson().getTipePerson() == Type.USER) {
                        loginPage.dispose();
                        new MainMenu();
                    } else {
                        loginPage.dispose();
                        new MainMenu();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Insert username and password correctly!", "Alert", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case "Click here to register new account":
                loginPage.dispose();
                new Register();
                break;
    }
}}
