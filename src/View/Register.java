/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.Controller;
import Model.User;
/**
 *
 * @author Wilson
 */
public class Register {
    private JLabel username, password, name, email, age;
    private JTextField insertUsername, insertName, insertEmail, insertAge;
    private JPasswordField insertPassword;
    private JButton register, back;
    
    public void Register(){
        FormLogin login = new FormLogin();
        //Frame
        JFrame reg = new JFrame("Register");
        reg.setSize(500, 600);
        
        //Isi Frame
        username = new JLabel("Username");
        username.setBounds(50, 10, 200, 30);
        insertUsername = new JTextField("");
        insertUsername.setBounds(260, 10, 200, 30);
        password = new JLabel("Password");
        password.setBounds(50, 50, 200, 30);
        insertPassword = new JPasswordField("");
        insertPassword.setBounds(260, 50, 200, 30);
        name = new JLabel("Name");
        name.setBounds(50, 90, 200, 30);
        insertName = new JTextField("");
        insertName.setBounds(260, 90, 200, 30);
        email = new JLabel("Email");
        email.setBounds(50, 130, 200, 30);
        insertEmail = new JTextField("");
        insertEmail.setBounds(260, 130, 200, 30);
        age = new JLabel("age");
        age.setBounds(50, 170, 200, 30);
        insertAge = new JTextField("");
        insertAge.setBounds(260, 170, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login.FormLogin();
            }
        });
        back.setBounds(50, 210, 100, 30);
        register = new JButton("Register");
        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.setUsername(insertUsername.getText());
                user.setPW_User(String.valueOf(insertPassword.getPassword()));
                user.setName(insertName.getText());
                user.setEmail(insertEmail.getText());
                user.setAge(Integer.parseInt(insertAge.getText()));
                Controller.Register(user);
                login.FormLogin();
            }
        });
        register.setBounds(350, 210, 100, 30);
        
        reg.add(username);
        reg.add(insertUsername);
        reg.add(password);
        reg.add(insertPassword);
        reg.add(name);
        reg.add(insertName);
        reg.add(email);
        reg.add(insertEmail);
        reg.add(age);
        reg.add(insertAge);
        reg.add(back);
        reg.add(register);
        reg.setLayout(null);
        reg.setVisible(true);
    }
}
