import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketsTest {
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets mt = new MovieTickets();
        assertEquals(6200, mt.TotalMovieSales(new int[]{3000, 1500, 1700}));
        assertEquals(6300, mt.TotalMovieSales(new int[]{3500, 1200, 1600}));
    }
    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        MovieTickets mt = new MovieTickets();
        assertEquals("Oppenheimer", mt.TopMovie(new String[]{"Napoleon", "Oppenheimer"}, new int[]{6200, 6300}));
    }
}