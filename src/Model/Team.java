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
public class Team extends DivisiGame{
    private String ID_Team;
    private String Nama_Team;

    public Team(String ID_Team, String Nama_Team, String Divisi) {
        super(Divisi);
        this.ID_Team = ID_Team;
        this.Nama_Team = Nama_Team;
    }

    public Team() {
    }

    public String getID_Team() {
        return ID_Team;
    }

    public void setID_Team(String ID_Team) {
        this.ID_Team = ID_Team;
    }

    public String getNama_Team() {
        return Nama_Team;
    }

    public void setNama_Team(String Nama_Team) {
        this.Nama_Team = Nama_Team;
    }

    @Override
    public String toString() {
        return "Team{" + "ID_Team=" + ID_Team + ", Nama_Team=" + Nama_Team + '}';
    }
    
    
}
