package br.com.screenmatch.calculators;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Title;

public class TimeCalculator {
    int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void include(Title m){
        this.totalTime += m.getRuntimeMinutes();
    }
}
