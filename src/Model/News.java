package Model;

public class News {

    private String ID_News;
    private String Title_News;
    private String Content_News;
    private String Date_News;

    public News() {

    }

    public News(String ID_News, String Title_News, String Content_News, String Date_News) {
        this.ID_News = ID_News;
        this.Title_News = Title_News;
        this.Content_News = Content_News;
        this.Date_News = Date_News;
    }

    public String getID_News() {
        return ID_News;
    }

    public void setID_News(String ID_News) {
        this.ID_News = ID_News;
    }

    public String getTitle_News() {
        return Title_News;
    }

    public void setTitle_News(String Title_News) {
        this.Title_News = Title_News;
    }

    public String getContent_News() {
        return Content_News;
    }

    public void setContent_News(String Content_News) {
        this.Content_News = Content_News;
    }

    public String getDate_News() {
        return Date_News;
    }

    public void setDate_News(String Date_News) {
        this.Date_News = Date_News;
    }

    @Override
    public String toString() {
        return "News{" + "ID_News=" + ID_News + ", Title_News=" + Title_News + ", Content_News=" + Content_News + ", Date_News=" + Date_News + '}';
    }

}
