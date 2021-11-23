/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Wilson
 */
public class News {
    private JButton showNews, addNews, back;
    
    public void News(){
        Company company = new Company();
        //Frame
        JFrame news = new JFrame("News");
        news.setSize(300, 600);
        
        //isi Frame
        showNews = new JButton("Show News");
        showNews.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        showNews.setBounds(50, 10, 150, 30);
        addNews = new JButton("Add News");
        addNews.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //isi
            }
        });
        addNews.setBounds(50, 50, 150, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                company.Company();
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
