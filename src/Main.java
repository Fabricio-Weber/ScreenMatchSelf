import br.com.alura.screenmatch.model.Title;

public class Main {
    public static void main(String[] args) {
        Title myTitle = new Title();

        myTitle.setName("The Godfather");
        myTitle.setReleaseYear(1972);
        myTitle.setRuntimeMinutes(175);


        myTitle.rateMovie(10);
        myTitle.rateMovie(9.9);
        myTitle.rateMovie(9.8);

        myTitle.showMovieInfo();
    }
}
