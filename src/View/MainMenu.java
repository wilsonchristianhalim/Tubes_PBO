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
private JButton divisi, match, news, company, forum;

    public void MainMenu(){
<<<<<<< HEAD
        menuDivisiGames menudivisi = new menuDivisiGames();
        MenuNews menunews = new MenuNews();
=======
        
>>>>>>> parent of 366d65b (benerin function)
        Company comp = new Company();
        JFrame main = new JFrame("Main Menu");
        main.setSize(300, 600);
        
        //Isi Frame
        divisi = new JButton("Menu Divisi Game");
        divisi.setBounds(50, 10, 100, 30);
        divisi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menudivisi.menuDivisiGames();
            }
        });
        match = new JButton("Match");
        match.setBounds(50, 50, 100, 30);
        match.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        news = new JButton("News");
        news.setBounds(50, 90, 100, 30);
        news.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
                menunews.MenuNews();
=======
                new MenuNews();
>>>>>>> parent of 366d65b (benerin function)
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
        
        main.add(divisi);
        main.add(match);
        main.add(news);
        main.add(company);
        main.add(forum);
        main.setLayout(null);
        main.setVisible(true);
    }
}
