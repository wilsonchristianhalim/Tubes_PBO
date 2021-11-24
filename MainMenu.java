/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import java.util.ArrayList;
import Controller.*;

/**
 *
 * @author Wilson
 */
public class MainMenu {

    public static void menu() {
        int menu;
        int news;
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Main Menu"
                + "\n1. Divisi Game"
                + "\n2. Match"
                + "\n3. News"
                + "\n4. Company"
                + "\n5. Form"));
        news = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu News"
                + "\n1. Lihat News"
                + "\n2. Tambah News"
                + "\n3. Edit News"
                + "\n4. Delete News"
                + "\n5. Kembali ke Menu Utama"));
        switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                switch (news) {
                    case 1:
                        NewsView.LihatNews();
                        break;
                    case 2:
                        NewsView.TambahNews();
                        break;
                    case 3:
                        NewsView.EditNews();
                        break;
                    case 4:
                        NewsView.HapusNews();
                        break;
                    case 5:
                        menu();
                        break;
                }
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public static void main(String[] args) {
        new MenuMatch();

//        DataBaseHandler c = new DataBaseHandler();
//        
//        c.connect();
    }
}
