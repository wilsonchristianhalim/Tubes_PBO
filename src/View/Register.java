/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;

/**
 *
 * @author Wilson
 */
public class Register {
    private JLabel name, username, age, email, password;
    private JTextField inputName, inputUsername, inputAge, inputEmail;
    private JPasswordField inputPassword;
    private JButton clickRegister;
    
    public void Register(){
        JFrame register = new JFrame("Register");
        register.setSize(500,800);
        
        name = new JLabel("Name");
        name.setBounds(10, 10, 100, 30);
        
    }
}
