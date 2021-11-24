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
    
    public void ShowTitleNews(){
        MenuNews menunews = new MenuNews();
        //Frame
        JFrame news = new JFrame("Title News");
        news.setSize(500, 600);
        
        //Isi Frame
        for (int i = 0; i < Controller.getTitleNews().size(); i++) {
          titleNews.addItem(Controller.getTitleNews().get(i).getTitle_News());
        }
        titleNews = new JComboBox<>();
        titleNews.setBounds(50, 10, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menunews.MenuNews();;
            }
        });
        back.setBounds(50, 50, 100, 30);
        submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, Controller.SeeNews(titleNews.getName()));
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
