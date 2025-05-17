import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

public class RatingTest {

    @Test
    public void testRatingValid() {
        Rating r = new Rating(1, vRating.patru, "Foarte bun", LocalDateTime.now().minusDays(1));
        assertTrue(r.valideazaRating());
    }

    @Test
    public void testRatingViitor() {
        Rating r = new Rating(2, vRating.cinci, "Excelent", LocalDateTime.now().plusDays(1));
        assertFalse(r.valideazaRating());
    }
}
