/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Wilson
 */
public class ContactController {
    public ArrayList <Contact> showContact(){
        ArrayList <Contact> listcontact = new ArrayList<>();
        String query = "select*from contact";
        try{
            PreparedStatement st = DataBaseHandler.getConnection().prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String id_contact = rs.getString("ID_Contact");
                String contact_name = rs.getString("Contact_Name");
                Contact contact = new Contact(id_contact, contact_name);
                listcontact.add(contact);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return listcontact;
    }
    
}
