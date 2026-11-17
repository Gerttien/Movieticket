public class MovieTickets implements IMovieTickets {

    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            total += movieTicketSales[i];
        }
        return total;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
}