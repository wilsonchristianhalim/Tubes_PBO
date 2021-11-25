/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import java.util.ArrayList;
import Controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Wilson
 */
public class MainMenu {
private JButton divisi, match, news, company, forum, logout;

    public void MainMenu(){
        FormLogin login = new FormLogin();
        MenuNews newss = new MenuNews();
        Company comp = new Company();
        MenuMatch matchh = new MenuMatch();
        JFrame main = new JFrame("Main Menu");
        main.setSize(300, 600);
        
        //Isi Frame
        divisi = new JButton("Menu Divisi Game");
        divisi.setBounds(50, 10, 100, 30);
        divisi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        match = new JButton("Match");
        match.setBounds(50, 50, 100, 30);
        match.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                matchh.MenuMatch();
            }
        });
        news = new JButton("News");
        news.setBounds(50, 90, 100, 30);
        news.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newss.MenuNews();
            }
        });
        company = new JButton("Company");
        company.setBounds(50, 130, 100, 30);
        company.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comp.Company();
            }
        });
        forum = new JButton("Forum");
        forum.setBounds(50, 170, 100, 30);
        forum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        logout = new JButton("LogOut");
        logout.setBounds(50, 210, 100, 30);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int jawab = JOptionPane.showOptionDialog(null, "LogOut now?", "LogOut", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (jawab == JOptionPane.YES_OPTION) {
                    main.dispose();
                    login.FormLogin();
                }
            }
        });
        
        main.add(divisi);
        main.add(match);
        main.add(news);
        main.add(company);
        main.add(forum);
        main.add(logout);
        main.setLayout(null);
        main.setVisible(true);
    }
}
