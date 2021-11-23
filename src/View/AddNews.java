package View;

import Controller.Controller;
import Model.News;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddNews {

    private JButton add, back;
    private JTextField isiID, isiTitle, isiContent, isiDate;

    public void AddNews() {
        MenuNews MenNews = new MenuNews();
        //Frame
        JFrame addcontact = new JFrame("Add News");
        addcontact.setSize(500, 130);
        //Isi Frame
        isiID = new JTextField("");
        isiTitle= new JTextField("");
        isiContent = new JTextField("");
        isiDate = new JTextField("");       
        add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                News news = new News();
                news.setID_News(isiID.getText());
                news.setTitle_News(isiTitle.getText());
                news.setContent_News(isiContent.getText());
                news.setDate_News(isiDate.getText());
                Controller.AddNews(news);
                MenNews.MenuNews();
            }
        });
    }
}
