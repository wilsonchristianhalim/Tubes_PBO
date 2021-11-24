/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import Controller.Controller;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author Wilson
 */
public class ShowTitleNews {
    private JComboBox titleNews;
    private JButton submit, back;
    
    public void PrintNews(){
        MenuNews menunews = new MenuNews();
        //Frame
        JFrame news = new JFrame("Title News");
        news.setSize(500, 600);
        
        //Isi Frame
        ArrayList<News> titleList = Controller.getTitleNews();
        String[] title = new String[titleList.size()];
        for (int i = 0; i < titleList.size() ; i++) {
            title[i] = titleList.get(i).getTitle_News();
        }
        titleNews = new JComboBox<>(title);
        titleNews.setBounds(50, 10, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menunews.MenuNews();;
            }
        });
        back.setBounds(50, 50, 100, 30);
        submit = new JButton("Submit");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        submit.setBounds(260, 50, 100, 30);
        
        news.add(titleNews);
        news.add(back);
        news.add(submit);
        news.setLayout(null);
        news.setVisible(true);
    }
}
