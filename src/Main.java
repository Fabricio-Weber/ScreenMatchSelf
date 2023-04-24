import br.com.alura.screenmatch.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1972);
        myMovie.setRuntimeMinutes(175);


        myMovie.rateMovie(10);
        myMovie.rateMovie(9.9);
        myMovie.rateMovie(9.8);

        myMovie.showMovieInfo();
    }
}
