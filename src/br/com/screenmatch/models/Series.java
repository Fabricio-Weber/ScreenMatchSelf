package br.com.screenmatch.models;

public class Series extends Title{
    private int episodes;
    private int seasons;
    private int minutesPerEpisode;
    private boolean stillRunning;

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }


    public boolean getIsStillRunning() {
        return stillRunning;
    }

    public void setStillRunning(boolean stillRunning) {
        this.stillRunning = stillRunning;
    }


    @Override
    public int getRuntimeMinutes() {
        return  seasons * episodes * minutesPerEpisode;
    }
}

