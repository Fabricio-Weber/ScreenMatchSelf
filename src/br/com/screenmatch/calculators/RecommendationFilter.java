package br.com.screenmatch.calculators;

import br.com.screenmatch.models.Title;

public class RecommendationFilter {
    private String recommendation;

    public void filters(Classification classifiable){
        if(classifiable.getClassification() >= 4 ){
            System.out.println("This one is very popular right now!");
        } else if (classifiable.getClassification() >= 2){
            System.out.println("Very well rated!");
        }else{
            System.out.println("Put this one on your 'watch list'");
        }
    }
}
