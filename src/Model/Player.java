/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wilson
 */
public class Player extends Team{
    private String ID_Player;
    private String Username;
    private String Name;
    private int Age;
    private String TTL;

    public Player(String ID_Player, String Username, String Name, int Age, String TTL, String ID_Team, String Nama_Team, String Divisi) {
        super(ID_Team, Nama_Team, Divisi);
        this.ID_Player = ID_Player;
        this.Username = Username;
        this.Name = Name;
        this.Age = Age;
        this.TTL = TTL;
    }

    public String getID_Player() {
        return ID_Player;
    }

    public void setID_Player(String ID_Player) {
        this.ID_Player = ID_Player;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    @Override
    public String toString() {
        return "Player{" + "ID_Player=" + ID_Player + ", Username=" + Username + ", Name=" + Name + ", Age=" + Age + ", TTL=" + TTL + '}';
    }
    
}
