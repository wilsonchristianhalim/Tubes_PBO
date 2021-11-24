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
public class Comment extends Post {
    private String ID_Comment;
    private String Comment;
    private String Date;

    public Comment(String ID_Comment, String Comment, String Date, String ID_Post, String Post_Content, String Date_Post, String Username, String PW_User, String Name, String Email, int Age, int tipePerson) {
        super(ID_Post, Post_Content, Date_Post, Username, PW_User, Name, Email, Age, tipePerson);
        this.ID_Comment = ID_Comment;
        this.Comment = Comment;
        this.Date = Date;
    }

    public String getID_Comment() {
        return ID_Comment;
    }

    public void setID_Comment(String ID_Comment) {
        this.ID_Comment = ID_Comment;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Comment{" + "ID_Comment=" + ID_Comment + ", Comment=" + Comment + ", Date=" + Date + '}';
    }
    
}
