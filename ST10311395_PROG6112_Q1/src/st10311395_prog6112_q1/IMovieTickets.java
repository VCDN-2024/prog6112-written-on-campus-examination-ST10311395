
package st10311395_prog6112_q1;

public class IMovieTickets {
    //q1.2
    // Method to calculate total sales for tickets
    public double ticketSales(double[] sales) {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total;
    }
    // Method to calculate the total sales for each movie and return it as an array
    public double[] CalculateTotalSales_ReturnsTotalSales(double[][] salesArr) {
        double[] totalSalesArr = new double[salesArr.length];
        for (int i = 0; i < salesArr.length; i++) {
            totalSalesArr[i] = ticketSales(salesArr[i]);
        }
        return totalSalesArr;
    }
    
    
        // Method to determine the top-performing movie based on total sales
    public int topMovie(double[] totalSalesArr) {
        int topMovieIndex = 0;
        double maxSales = totalSalesArr[0];
        
        for (int i = 1; i < totalSalesArr.length; i++) {
            if (totalSalesArr[i] > maxSales) {
                maxSales = totalSalesArr[i];
                topMovieIndex = i;
            }
        }
        
        return topMovieIndex;
    }
}
