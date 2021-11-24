
package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MenuNewsUser {
     private JButton showNews, back;
    public static Controller controller = new Controller();

    public void MenuNewsUser() {
        ShowTitleNews show = new ShowTitleNews();
        menuUser main = new menuUser();
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
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.menuUser();
            }
        });
        back.setBounds(50, 90, 150, 30);

        news.add(showNews);
        news.add(back);
        news.setLayout(null);
        news.setVisible(true);
    }
}


