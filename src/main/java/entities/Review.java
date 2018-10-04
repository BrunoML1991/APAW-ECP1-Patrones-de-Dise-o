package entities;

import java.time.LocalDateTime;

public class Review {

    private String id;
    private String title;
    private String text;
    private int rating;
    private LocalDateTime date;
    public static final int LIMIT_RATING = 10;

    public Review (String id,String title){
        this.id = id;
        this.title = title;
        this.setDate();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", date=" + date +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setRating(int rating) {
        assert 0 >= rating && rating <= this.LIMIT_RATING;
        this.rating = rating;
    }

    public void setDate() {
        this.date = LocalDateTime.now();
    }
}
