package br.com.screenmatch.main;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;
import br.com.screenmatch.models.Title;

import java.util.*;

public class MainWithArrays {
    public static void main(String[] args) {
        Movie myTitle = new Movie("The Godfather", 1972);
        myTitle.rateTitle(10);
        Movie otherMovie = new Movie("Apocalypse Now", 1979);
        otherMovie.rateTitle(9);
        Series mySerie = new Series("Breaking Bad", 2008 );
        mySerie.rateTitle(9);
        Movie taxiDriver = new Movie("Taxi Driver", 1976);
        taxiDriver.rateTitle(8);


        List<Title> movieListArray = new LinkedList<>();
        movieListArray.add(taxiDriver);
        movieListArray.add(myTitle);
        movieListArray.add(otherMovie);
        movieListArray.add(mySerie);

        for (Title item:movieListArray) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println("Ranking: " + movie.getClassification());
            }

        }

        ArrayList<String> artistSearch = new ArrayList<>();
        artistSearch.add("Bryan Cranston");
        artistSearch.add("Al Pacino");
        artistSearch.add("Robert De Niro");
        artistSearch.add("Marlon Brando");
        artistSearch.add("Ryan Gosling");
        artistSearch.add("Lea Seydoux");
        artistSearch.add("Uma Thurman");
        artistSearch.add("Margot Robbie");
        System.out.println(artistSearch);

        Collections.sort(artistSearch);
        System.out.println("After sorting:");
        System.out.println(artistSearch);

        Collections.sort(movieListArray);
        System.out.println(movieListArray);
        movieListArray.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(movieListArray);
    }
}
