/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import Controller.*;
import Model.*;
import java.util.ArrayList;
/**
 *
 * @author Wilson
 */
public class ContactView extends JFrame {
    public ContactView(){
        int x = 50;
        int y = 10;
        ArrayList <Contact> listcontact = new ArrayList<>();
        JFrame view = new JFrame("Contact List");
        view.setSize(200, 200);
        for (int i = 0; i < listcontact.size(); i++) {
            JLabel contact = new JLaber(ContactController.printContact(i));
            contact.setBounds(x, y, 100, 30);
            x+= 30+10;
            view.add(contact);
        }
    }
}
