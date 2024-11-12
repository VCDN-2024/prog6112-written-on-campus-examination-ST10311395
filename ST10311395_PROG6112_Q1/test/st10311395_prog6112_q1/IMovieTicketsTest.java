package st10311395_prog6112_q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMovieTicketsTest {

    private final IMovieTickets movieTickets = new IMovieTickets();

    @Test
    public void testTicketSales() {
        // Arrange
        double[] sales = {3000, 1500, 1700}; // Example sales data for a movie
        double expectedTotal = 6200; // Expected sum of ticket sales

        // Act
        double actualTotal = movieTickets.ticketSales(sales);

        // Assert
        assertEquals(expectedTotal, actualTotal, "Total ticket sales should be calculated correctly");
    }

    @Test
    public void testCalculateTotalSales_ReturnsTotalSales() {
        // Arrange
        double[][] salesArr = {
            {3000, 1500, 1700}, // Total should be 6200
            {3500, 1200, 1600}  // Total should be 6300
        };
        double[] expectedTotals = {6200, 6300}; // Expected totals for each movie

        // Act
        double[] actualTotals = movieTickets.CalculateTotalSales_ReturnsTotalSales(salesArr);

        // Assert
        assertArrayEquals(expectedTotals, actualTotals, "Total sales across all movies should be calculated correctly");
    }

    @Test
    public void testTopMovie() {
        // Arrange
        double[] totalSalesArr = {6200, 6300}; // Example total sales for each movie
        int expectedTopMovieIndex = 1; // Second movie has higher sales

        // Act
        int actualTopMovieIndex = movieTickets.topMovie(totalSalesArr);

        // Assert
        assertEquals(expectedTopMovieIndex, actualTopMovieIndex, "Top-performing movie index should be identified correctly");
    }
}
