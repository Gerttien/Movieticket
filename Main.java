
    public class Main {
        public static void main(String[] args) {
            String[] movies = {"Napoleon", "Oppenheimer"};
            String[] months = {"JAN", "FEB", "MAR"};
            int[][] movieTicketSales = {
                    {3000, 1500, 1700},
                    {3500, 1200, 1600}
            };

            MovieTickets mt = new MovieTickets();

            System.out.println("MOVIE TICKET SALES REPORT - 2024");
            System.out.printf("%-18s", "");
            for (String m : months) {
                System.out.printf("%-10s", m);
            }
            System.out.println();
            System.out.println("--------------------------------------------------");

            int[] totalSales = new int[movies.length];
            for (int i = 0; i < movies.length; i++) {
                System.out.printf("%-18s", movies[i]);
                for (int j = 0; j < movieTicketSales[i].length; j++) {
                    System.out.printf("%-10d", movieTicketSales[i][j]);
                }
                System.out.println();
                totalSales[i] = mt.TotalMovieSales(movieTicketSales[i]);
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Total movie ticket sales for Napoleon " + totalSales[0]);
            System.out.println("Total movie ticket sales for Oppenheimer " + totalSales[1]);
            System.out.println();
            System.out.println("Top performing movie: " + mt.TopMovie(movies, totalSales));
        }
    }

