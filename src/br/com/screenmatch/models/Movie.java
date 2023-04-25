package br.com.screenmatch.models;

import br.com.screenmatch.calculators.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getClassification(){
        return (int) getAverageScore()/2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
