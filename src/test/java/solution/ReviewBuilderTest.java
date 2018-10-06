package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReviewBuilderTest {

    @Test
    void testFull() {
        Review review = new ReviewBuilder("1", "Title test").text("text to try").rating(7).build();
        assertEquals("1", review.getId());
        assertEquals("Title test", review.getTitle());
        assertEquals("text to try", review.getText());
        assertEquals(7, review.getRating());
    }

}
