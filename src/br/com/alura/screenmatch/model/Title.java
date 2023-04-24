package br.com.alura.screenmatch.model;

public class Title {
   private String name;
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

   public void showMovieInfo(){
        System.out.println(this.name);
        System.out.println(this.releaseYear);
        System.out.println(this.userScore / this.totalReviews);
        System.out.println(this.totalReviews);
        System.out.println(this.runtimeMinutes);
    }

   public void rateMovie(double score){
        this.userScore += score;
        this.totalReviews++;
    }
}
