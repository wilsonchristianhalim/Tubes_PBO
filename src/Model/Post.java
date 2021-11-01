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
public class Post extends User{
    private String ID_Post;
    private String Post_Content;
    private String Date_Post;

    public Post(String ID_Post, String Post_Content, String Date_Post, String Username, String PW_User, String Name, String Email, int Age) {
        super(Username, PW_User, Name, Email, Age);
        this.ID_Post = ID_Post;
        this.Post_Content = Post_Content;
        this.Date_Post = Date_Post;
    }

    public String getID_Post() {
        return ID_Post;
    }

    public void setID_Post(String ID_Post) {
        this.ID_Post = ID_Post;
    }

    public String getPost_Content() {
        return Post_Content;
    }

    public void setPost_Content(String Post_Content) {
        this.Post_Content = Post_Content;
    }

    public String getDate_Post() {
        return Date_Post;
    }

    public void setDate_Post(String Date_Post) {
        this.Date_Post = Date_Post;
    }

    @Override
    public String toString() {
        return "Post{" + "ID_Post=" + ID_Post + ", Post_Content=" + Post_Content + ", Date_Post=" + Date_Post + '}';
    }
    
}
