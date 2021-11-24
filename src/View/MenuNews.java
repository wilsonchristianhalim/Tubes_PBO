/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.News;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Wilson
 */
public class MenuNews {

    private JButton showNews, addNews, back;
    public static Controller controller = new Controller();

    public void MenuNews() {
        ShowTitleNews show = new ShowTitleNews();
        MainMenu main = new MainMenu();
        AddNews add = new AddNews();
        //Frame
        JFrame news = new JFrame("News");
        news.setSize(300, 600);

        //isi Frame
        showNews = new JButton("Show News");
        showNews.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            show.ShowTitleNews();
            }
        });
        showNews.setBounds(50, 10, 150, 30);
        addNews = new JButton("Add News");
        addNews.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add.AddNews();
            }
        });
        addNews.setBounds(50, 50, 150, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.MainMenu();
            }
        });
        back.setBounds(50, 90, 150, 30);

        news.add(showNews);
        news.add(addNews);
        news.add(back);
        news.setLayout(null);
        news.setVisible(true);
    }
}
