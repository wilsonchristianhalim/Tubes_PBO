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

    public static ArrayList<Contact> SeeContact() {
        ArrayList<Contact> contact = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM contact";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Contact contacts = new Contact();
                contacts.setID_Contact(rs.getString("ID_Contact"));
                contacts.setContact_Name(rs.getString("Contact_Name"));
                contact.add(contacts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (contact);
    }

    public static boolean AddContact(Contact contacts) {
        conn.connect();
        String query = "INSERT INTO contact (ID_Contact, Contact_Name)VALUES (?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, contacts.getID_Contact());
            stmt.setString(2, contacts.getContact_Name());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean DeleteContact(String name) {
        conn.connect();
        String query = "DELETE FROM contact WHERE Contact_Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static ArrayList<Partner> SeePartner() {
        ArrayList<Partner> partner = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM partner";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Partner partners = new Partner();
                partners.setID_Partner(rs.getString("ID_Partner"));
                partners.setPartner_Name(rs.getString("Partner_Name"));
                partner.add(partners);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (partner);
    }

    public static boolean AddPartner(Partner partners) {
        conn.connect();
        String query = "INSERT INTO partner (ID_Partner, Partner_Name)VALUES (?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, partners.getID_Partner());
            stmt.setString(2, partners.getPartner_Name());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean DeletePartner(String name) {
        conn.connect();
        String query = "DELETE FROM partner WHERE Partner_Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    
    public ArrayList<Match> getAllMatch() {
        conn.connect();
        ArrayList<Match> matchs = new ArrayList<>();
        String query = "SELECT * FROM matchs ;";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Match match = new Match();
                match.setIdMatch(rs.getInt("id_match"));
                match.setEventMatch(rs.getString("event_match"));
                match.setTeam(rs.getString("team"));
                match.setLawan(rs.getString("lawan"));
                match.setDateMatch(rs.getString("date_match"));
                match.setResult(rs.getString("result"));
                matchs.add(match);
                
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (matchs);
    }

    public ArrayList<Match> getAllMatchByIdTeam(int idTeam) {
        conn.connect();
        ArrayList<Match> matchs = new ArrayList<>();
        
        String query = "SELECT * FROM `matchs` WHERE id_team = '" + idTeam + "';";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("TESS");
                Match match = new Match();
                match.setIdMatch(rs.getInt("id_match"));
                match.setEventMatch(rs.getString("event_match"));
                match.setTeam(rs.getString("team"));
                match.setLawan(rs.getString("lawan"));
                match.setDateMatch(rs.getString("date_match"));
                match.setResult(rs.getString("result"));
                matchs.add(match);
                
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (matchs);
    }
    
    public ArrayList<Team> getAllTeam() {
        conn.connect();
        ArrayList<Team> teams = new ArrayList<>();
        String query = "SELECT * FROM team " ;
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Team tim = new Team();
                tim.setID_Team(rs.getString("id_team"));
                tim.setNama_Team(rs.getString("id_team"));
                teams.add(tim);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (teams);
    }
}
