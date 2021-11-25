package View;

import Controller.Controller;
import Model.News;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddNews {

    private JButton add, back;
    private JLabel id, title, content, date;
    private JTextField isiID, isiTitle, isiContent, isiDate;

    public void AddNews() {
        MenuNews MenNews = new MenuNews();
        //Frame
        JFrame addnews = new JFrame("Add News");
        addnews.setSize(500, 600);
        
        //Isi Frame
//        id=new JLabel("ID News");
//        id.setBounds(50, 10, 200, 30);
//        isiID = new JTextField("");
//        isiID.setBounds(260, 10, 200, 30);
        title = new JLabel("Title");
        title.setBounds(50, 50, 200, 30);
        isiTitle= new JTextField("");
        isiTitle.setBounds(260, 50, 200, 30);
        content = new JLabel("Content");
        content.setBounds(50, 90, 200, 30);
        isiContent = new JTextField("");
        isiContent.setBounds(260, 90, 200, 90);
        date = new JLabel("Date");
        date.setBounds(50, 190, 200, 30);
        isiDate = new JTextField("");
        isiDate.setBounds(260, 190, 200, 30);
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenNews.MenuNews();
            }
        });
        back.setBounds(50, 230, 100, 30);
        add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                News news = new News();
                news.setTitle_News(isiTitle.getText());
                news.setContent_News(isiContent.getText());
                news.setDate_News(isiDate.getText());
                Controller.AddNews(news);
                MenNews.MenuNews();
            }
        });
        add.setBounds(350, 230, 100, 30);
        
        addnews.add(title);
        addnews.add(isiTitle);
        addnews.add(content);
        addnews.add(isiContent);
        addnews.add(date);
        addnews.add(isiDate);
        addnews.add(back);
        addnews.add(add);
        addnews.setLayout(null);
        addnews.setVisible(true);
    }
}
