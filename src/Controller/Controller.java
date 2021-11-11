package Controller;

import Model.*;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controller {

    static DataBaseHandler conn = new DataBaseHandler();

    public static ArrayList<News> SeeNews() {
        ArrayList<News> news = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM news";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                News news1 = new News();
                news1.setID_News(rs.getString("ID_News"));
                news1.setTitle_News(rs.getString("Title_News"));
                news1.setContent_News(rs.getString("Content_News"));
                news1.setDate_News(rs.getString("Date_News"));
                news.add(news1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (news);
    }

    public static boolean AddNews(News news1) {
        conn.connect();    
        String query = "INSERT INTO news (ID_News, Title_News, Content_News, Date_News)VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, news1.getID_News());
            stmt.setString(2, news1.getTitle_News());
            stmt.setString(3, news1.getContent_News());
            stmt.setString(4, news1.getDate_News());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean EditNews(News news1) {
        conn.connect();
        String query = "UPDATE news SET Title_News='" + news1.getTitle_News() + "', "
                + "Content_News='" + news1.getContent_News() + "', "
                + "Date_News='" + news1.getDate_News() + "' "
                + "WHERE ID_News='" + news1.getID_News() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean DeleteNews(String title) {
        conn.connect();
        String query = "DELETE FROM news WHERE Title_News='" + title + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
