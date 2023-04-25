import br.com.screenmatch.calculators.RecommendationFilter;
import br.com.screenmatch.calculators.TimeCalculator;
import br.com.screenmatch.models.Episodes;
import br.com.screenmatch.models.Series;
import br.com.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myTitle = new Movie();

        myTitle.setName("The Godfather");
        myTitle.setReleaseYear(1972);
        myTitle.setRuntimeMinutes(175);

        myTitle.rateMovie(10);
        myTitle.rateMovie(9.9);
        myTitle.rateMovie(9.8);

        myTitle.showMovieInfo();

        Movie otherMovie = new Movie();
        otherMovie.setName("Apocalypse Now");
        otherMovie.setDirector("Francis Ford Coppola");
        otherMovie.setReleaseYear(1979);
        otherMovie.setRuntimeMinutes(153);

        Series mySerie = new Series();

        mySerie.setName("Breaking Bad");
        mySerie.setSeasons(5);
        mySerie.setEpisodes(42);
        mySerie.setMinutesPerEpisode(55);

        System.out.println(mySerie.getRuntimeMinutes() + " Minutes | " + mySerie.getRuntimeMinutes()/60 + " Hours");

        TimeCalculator calc = new TimeCalculator();
        calc.include(myTitle);
        calc.include(otherMovie);
        calc.include(mySerie);
        System.out.println(calc.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(myTitle);

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setName("pilot");
        episode.setSerie(mySerie);
        episode.setTotalViews(1500);
    }
}