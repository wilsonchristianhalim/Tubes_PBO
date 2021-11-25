/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vito
 */
public class Match {
    private int idMatch;
    private String eventMatch;
    private String team;
    private String lawan;
    private String dateMatch;
    private String result;

    public Match() {
    }

    public Match(int idMatch, String eventMatch, String team, String lawan, String dateMatch, String result) {
        this.idMatch = idMatch;
        this.eventMatch = eventMatch;
        this.team = team;
        this.lawan = lawan;
        this.dateMatch = dateMatch;
        this.result = result;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public String getEventMatch() {
        return eventMatch;
    }

    public void setEventMatch(String eventMatch) {
        this.eventMatch = eventMatch;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLawan() {
        return lawan;
    }

    public void setLawan(String lawan) {
        this.lawan = lawan;
    }

    public String getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(String dateMatch) {
        this.dateMatch = dateMatch;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match{" + "idMatch=" + idMatch + ", eventMatch=" + eventMatch + ", team=" + team + ", lawan=" + lawan + ", dateMatch=" + dateMatch + ", result=" + result + '}';
    }

    
    
}
