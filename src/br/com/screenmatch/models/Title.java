package br.com.screenmatch.models;

public abstract class Title {
   private String name;
   private String genre;
   private int releaseYear;
   private boolean planIncluded;
   private double userScore;
   private int totalReviews;
   private int runtimeMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public double getUserScore() {
        return userScore;
    }

    public void setUserScore(double userScore) {
        this.userScore = userScore;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public double getAverageScore(){
        double average = this.userScore / this.totalReviews;
        return average;
    }

   public void showMovieInfo(){
        System.out.println(this.name);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Average user Score: " + getAverageScore());
        System.out.println("Total Reviews: " + this.totalReviews);
        System.out.println("Runtime: " + this.runtimeMinutes + "m");
    }

   public void rateMovie(double score){
        this.userScore += score;
        this.totalReviews++;
    }
}
