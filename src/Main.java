import br.com.screenmatch.calculators.RecommendationFilter;
import br.com.screenmatch.calculators.TimeCalculator;
import br.com.screenmatch.models.Episodes;
import br.com.screenmatch.models.Series;
import br.com.screenmatch.models.Movie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myTitle = new Movie("The Godfather", 1972);
        myTitle.setRuntimeMinutes(175);
        myTitle.rateMovie(10);
        myTitle.rateMovie(9.9);
        myTitle.rateMovie(9.8);

        myTitle.showMovieInfo();

        Movie otherMovie = new Movie("Apocalypse Now", 1979);
        otherMovie.setDirector("Francis Ford Coppola");
        otherMovie.setRuntimeMinutes(153);

        Series mySerie = new Series("Breaking Bad", 2008 );
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

        filter.filters(episode);

        Movie taxiDriver = new Movie("Taxi Driver", 1976);
        taxiDriver.setDirector("Martin Scorsese");
        taxiDriver.setGenre("Drama");
        taxiDriver.setRuntimeMinutes(114);
        taxiDriver.setUserScore(9);

        ArrayList<Movie> movieListArray = new ArrayList<>();
        movieListArray.add(taxiDriver);
        movieListArray.add(myTitle);
        movieListArray.add(otherMovie);

        System.out.println("List Size: " + movieListArray.size());
        System.out.println("Movie title: " + movieListArray.get(0).getName());
        for (int i =0; i< movieListArray.size();i++ ){
            System.out.println(movieListArray.get(i).toString());

        }
    }
}