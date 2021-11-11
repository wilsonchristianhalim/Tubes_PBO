package View;

import Controller.Controller;
import Model.News;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewsView {

    static Controller controller = new Controller();

    public static void LihatNews() {
        ArrayList<News> news = controller.SeeNews();
        for (News news1 : news) {
            JOptionPane.showMessageDialog(null, news1.toString());
        }
    }

    public static void TambahNews() {
        ArrayList<News> news = new ArrayList<>();
        News news1 = new News();
        news1.setID_News(JOptionPane.showInputDialog("Input ID :"));
        news1.setTitle_News(JOptionPane.showInputDialog("Input Title :")); 
        news1.setContent_News(JOptionPane.showInputDialog("Input Content :"));
        news1.setDate_News(JOptionPane.showInputDialog("Input Date :"));
        news.add(news1);       
        controller.AddNews(news1);
    }
    
    public static void EditNews(){
        ArrayList<News> news = new ArrayList<>();
        News news1 = new News();
        news1.setID_News(JOptionPane.showInputDialog("Input ID News Yang Ingin Diedit :"));
        news1.setTitle_News(JOptionPane.showInputDialog("Input Title Baru :")); 
        news1.setContent_News(JOptionPane.showInputDialog("Input Content Baru :"));
        news1.setDate_News(JOptionPane.showInputDialog("Input Date Baru :"));
        news.add(news1);
        controller.EditNews(news1);
    }
    
    public static void HapusNews(){
        String title = JOptionPane.showInputDialog("Input Title News Yang Ingin Dihapus :");
        controller.DeleteNews(title);
    }
}
