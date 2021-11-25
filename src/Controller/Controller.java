package Controller;

import Model.*;
import static Model.Type.ADMIN;
import static Model.Type.USER;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

public class Controller {

    static DataBaseHandler conn = new DataBaseHandler();
    
    public static boolean cekPassword(String username, String password) {
        ArrayList<User> persons = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM person WHERE username='" + username + "'";
        boolean isMatch = false;
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                if(rs.getString("password").equals(getMd5(password))){
                    isMatch = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isMatch;
    }
    
    private static String getMd5(String input) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
        
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashtext = no.toString(16);
            while(hashtext.length() < 32){
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }          
    }

    public static boolean Register (User user){
        conn.connect();
        String query = "INSERT INTO user VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPW_User());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getEmail());
            stmt.setInt(5, user.getAge());
            stmt.setInt(6, 0);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Register");
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Register");
            e.printStackTrace();
            return (false);
        }
    }   
    
    public static ArrayList<News> SeeNews(String titleNews) {
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
            JOptionPane.showMessageDialog(null,"Berhasil Ditambahkan");
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Ditambahkan");
            e.printStackTrace();
            return (false);
        }
    }
    
    public static ArrayList<News> getTitleNews() {
        ArrayList<News> title = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM news";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                News news1 = new News();
                news1.setTitle_News(rs.getString("Title_News"));
                title.add(news1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (title);
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
            JOptionPane.showMessageDialog(null,"Berhasil Ditambahkan");
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Ditambahkan");
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean DeleteContact(String name) {
        conn.connect();
        String query = "DELETE FROM contact WHERE Contact_Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            int i = stmt.executeUpdate(query);  
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"Gagal Dihapus");          
            }else{
                JOptionPane.showMessageDialog(null,"Berhasil Dihapus");
            }
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Dihapus");
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
            JOptionPane.showMessageDialog(null,"Berhasil Ditambahkan");
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Ditambahkan");
            e.printStackTrace();
            return (false);
        }
    }

    public static boolean DeletePartner(String name) {
        conn.connect();
        String query = "DELETE FROM partner WHERE Partner_Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            int i = stmt.executeUpdate(query);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"Gagal Dihapus");          
            }else{
                JOptionPane.showMessageDialog(null,"Berhasil Dihapus");
            }
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Dihapus");
            e.printStackTrace();
            return (false);
        }
    }

    public static User getUser(String uname) {
        User person = null;
        conn.connect();
        String query = "SELECT * FROM User WHERE username='" + uname + "'";
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int tipePerson = rs.getInt("tipePerson");
                switch(tipePerson){
                    case 0:
                        person = new User();
                        person.setTipePerson(0);
                        break;
                    case 1:
                        person = new User();
                        person.setTipePerson(1);
                        break;
                    default:
                        person = new User();
                        break;
                }
                person.setUsername(rs.getString("username"));
                person.setPW_User(rs.getString("password"));
                person.setName(rs.getString("name"));
                person.setEmail(rs.getString("email"));
                person.setAge(rs.getInt("age"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return (person);
    }
<<<<<<< HEAD
=======
    
        public static boolean AddNewMatch(Match newMatch) {
        conn.connect();
        String query = "IINSERT INTO `matchs`( `event_match`, `id_team`, `lawan`, `date_match`, `result`) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, newMatch.getEventMatch());
            stmt.setString(2, newMatch.getTeam());
            stmt.setString(3, newMatch.getLawan());
            stmt.setString(4, newMatch.getDateMatch());
            stmt.setString(4, newMatch.getResult());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    public static boolean DeleteMatch(int id_match) {
        conn.connect();
        String query = "DELETE FROM matchs WHERE id_match='" + id_match + "'";
        
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    public static boolean updateMatch(Match newDataMatch) {
        conn.connect();
        String query = "UPDATE matchs SET event_match='" + newDataMatch.getEventMatch() + "', "
                + "id_team='" + newDataMatch.getTeam() + "', "
                + "lawan='" + newDataMatch.getLawan() + "' "
                + "date_match='" + newDataMatch.getDateMatch()+ "' "
                + "result='" + newDataMatch.getResult()+ "' "
                + "WHERE id_match='" + newDataMatch.getIdMatch()+ "'";
        
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    public static ArrayList<Match> getAllMatch() { 
        conn.connect();
        ArrayList<Match> matchs = new ArrayList<>();
        String query = "SELECT * FROM `matchs`";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query); 
            while (rs.next()) {
                Match match = new Match();
                match.setIdMatch(rs.getInt("id_match"));
                match.setEventMatch(rs.getString("event_match"));
                match.setTeam(rs.getString("id_team"));
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
    
    public static ArrayList<Match> getAllMatchByIdTeam(int idTeam) {
        conn.connect();
        ArrayList<Match> matchs = new ArrayList<>();
        String query = "SELECT * FROM `matchs` WHERE id_team = '" + idTeam + "';";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query); 
            while (rs.next()) {
                Match match = new Match();
                match.setIdMatch(rs.getInt("id_match"));
                match.setEventMatch(rs.getString("event_match"));
                match.setTeam(rs.getString("id_team"));
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
    
    public static ArrayList<Team> getAllTeam() {
        conn.connect();
        ArrayList<Team> teams = new ArrayList<>();
        String query = "SELECT * FROM team " ;
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Team tim = new Team();
                tim.setID_Team(rs.getString("id_team"));
                tim.setNama_Team(rs.getString("Nama_Team"));
                teams.add(tim);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (teams);
    }
>>>>>>> parent of 366d65b (benerin function)
}
