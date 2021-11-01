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
public class Match {
    private String ID_Match;
    private String Match_Name;
    private String Date_Match;
    private String Result;

    public Match(String ID_Match, String Match_Name, String Date_Match, String Result) {
        this.ID_Match = ID_Match;
        this.Match_Name = Match_Name;
        this.Date_Match = Date_Match;
        this.Result = Result;
    }

    public String getID_Match() {
        return ID_Match;
    }

    public void setID_Match(String ID_Match) {
        this.ID_Match = ID_Match;
    }

    public String getMatch_Name() {
        return Match_Name;
    }

    public void setMatch_Name(String Match_Name) {
        this.Match_Name = Match_Name;
    }

    public String getDate_Match() {
        return Date_Match;
    }

    public void setDate_Match(String Date_Match) {
        this.Date_Match = Date_Match;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    @Override
    public String toString() {
        return "Match{" + "ID_Match=" + ID_Match + ", Match_Name=" + Match_Name + ", Date_Match=" + Date_Match + ", Result=" + Result + '}';
    }
    
    
}
