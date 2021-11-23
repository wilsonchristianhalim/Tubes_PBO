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
    private String id_Match;
    private String match_Name;
    private String date_Match;
    private String result;

    public Match(String id_Match, String match_Name, String date_Match, String result) {
        this.id_Match = id_Match;
        this.match_Name = match_Name;
        this.date_Match = date_Match;
        this.result = result;
    }

    public String getId_Match() {
        return id_Match;
    }

    public void setId_Match(String id_Match) {
        this.id_Match = id_Match;
    }

    public String getMatch_Name() {
        return match_Name;
    }

    public void setMatch_Name(String match_Name) {
        this.match_Name = match_Name;
    }

    public String getDate_Match() {
        return date_Match;
    }

    public void setDate_Match(String date_Match) {
        this.date_Match = date_Match;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Match{iD_Match=").append(id_Match);
        sb.append(", match_Name=").append(match_Name);
        sb.append(", date_Match=").append(date_Match);
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
