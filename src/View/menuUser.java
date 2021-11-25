package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menuUser {

    private JButton divisi, match, news, company, forum, logout;

    public void menuUser() {

        FormLogin login = new FormLogin();
        MenuNewsUser newss = new MenuNewsUser();
        CompanyUser comp = new CompanyUser();
        MenuMatchUser matchh = new MenuMatchUser();
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
                matchh.MenuMatchUser();
            }
        });
        news = new JButton("News");
        news.setBounds(50, 90, 100, 30);
        news.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newss.MenuNewsUser();
            }
        });
        company = new JButton("Company");
        company.setBounds(50, 130, 100, 30);
        company.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comp.CompanyUser();
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
