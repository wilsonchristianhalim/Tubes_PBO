package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class menuUser {

    private JButton divisi, match, news, company, forum;

    public void menuUser() {

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

        main.add(divisi);
        main.add(match);
        main.add(news);
        main.add(company);
        main.add(forum);
        main.setLayout(null);
        main.setVisible(true);
    }
}
