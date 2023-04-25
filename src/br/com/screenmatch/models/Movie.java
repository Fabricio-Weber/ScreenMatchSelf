package br.com.screenmatch.models;

import br.com.screenmatch.calculators.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getClassification(){
        return (int) getAverageScore()/2;
    }
}
