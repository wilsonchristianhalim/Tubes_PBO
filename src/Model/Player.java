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
    private int ID_Player;
    private String Username;
    private String Nama;
    private int Umur;
    private String TanggalLahir;

    public Player(int ID_Player, String Username, String Nama, int Umur, String TanggalLahir, String ID_Team, String Nama_Team, String Divisi) {
        super(ID_Team, Nama_Team, Divisi);
        this.ID_Player = ID_Player;
        this.Username = Username;
        this.Nama = Nama;
        this.Umur = Umur;
        this.TanggalLahir = TanggalLahir;
    }

    public Player() {
    }

    public int getID_Player() {
        return ID_Player;
    }

    public void setID_Player(int ID_Player) {
        this.ID_Player = ID_Player;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    @Override
    public String toString() {
        return "Player{" + "ID_Player=" + ID_Player + ", Username=" + Username + ", Nama=" + Nama + ", Umur=" + Umur + ", TanggalLahir=" + TanggalLahir + '}';
    }
    
    
    
}
