
package st10311395_prog6112_q1;


public class ST10311395_PROG6112_Q1 {

   
    public static void main(String[] args) {
       //q1.1
        String[] MovieName_Arr = {"Napoleon", "Oppenheimer"}; // array that stores MOVIE names
        String[] Month_Arr = {"JAN", "FEB", "MAR"}; // array that stores months

        double[][] Tickets_Arr = { // 2D array that stores the amounts each MOVIE made
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        
        IMovieTickets imovietickets = new IMovieTickets();
        
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("                          Jan" + 
                           "                          Feb" +
                           "                          Mar");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        
        
        // Print MOVIE names and the amount they made
        for (int i = 0; i < MovieName_Arr.length; i++) {
            System.out.print(MovieName_Arr[i] + "              ");
            for (int j = 0; j < Tickets_Arr[i].length; j++) {
                System.out.print(Tickets_Arr[i][j] + "                     ");
            }
            System.out.println();
        }
        
        //q1.2
         
        System.out.println(""); // skips a line
        for (int i = 0; i < Tickets_Arr.length; i++) { // finds the total sales made by agents
            double totalSales = imovietickets.ticketSales(Tickets_Arr[i]);
            System.out.println("Total movie ticket sales for " + (MovieName_Arr[i]) + " " + totalSales);
        }
        
        
        System.out.println("");
        int topPerformingMovie = imovietickets.topMovie(imovietickets.CalculateTotalSales_ReturnsTotalSales(Tickets_Arr));
        System.out.println("Top-performing movie: " + (MovieName_Arr[topPerformingMovie]));
        
        System.out.println("");
    }
    
}
