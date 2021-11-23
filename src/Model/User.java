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
public class User {
    private String Username;
    private String PW_User;
    private String Name;
    private String Email;
    private int Age;
    private Type tipePerson;

    public User(String Username, String PW_User, String Name, String Email, int Age, Type tipePerson) {
        this.Username = Username;
        this.PW_User = PW_User;
        this.Name = Name;
        this.Email = Email;
        this.Age = Age;
        this.tipePerson = tipePerson;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPW_User() {
        return PW_User;
    }

    public void setPW_User(String PW_User) {
        this.PW_User = PW_User;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public Type getTipePerson() {
        return tipePerson;
    }

    public void setTipePerson(Type tipePerson) {
        this.tipePerson = tipePerson;
    }

    @Override
    public String toString() {
        return "User{" + "Username=" + Username + ", PW_User=" + PW_User + ", Name=" + Name + ", Email=" + Email + ", Age=" + Age + ", tipePerson=" + tipePerson + '}';
    }

    

    public boolean getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
