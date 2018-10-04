package solution;

public class ReviewBuilder {

    private Review review;

    public ReviewBuilder (String id, String title){
        this.review = new Review(id,title);
    }

    public ReviewBuilder text (String text){
        review.setText(text);
        return this;
    }

    public ReviewBuilder rating (int rating){
        review.setRating(rating);
        return this;
    }

    public Review build (){
        return review;
    }

}
