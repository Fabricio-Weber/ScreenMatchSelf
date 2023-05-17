package br.com.screenmatch.main;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Title;
import br.com.screenmatch.models.TitleOMDb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String search = "";

        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("exit")) {
            System.out.println("Type the name of a movie or exit to finish the application: ");
            search = scan.nextLine();

            if(search.equalsIgnoreCase("exit")){
                break;

            }

            String address = "http://www.omdbapi.com/?t=" + search + "&apikey=adb06c56";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


//         = gson.fromJson(json, Movie.class);
                TitleOMDb newTitleOMDb = gson.fromJson(json, TitleOMDb.class);

                Title newMovie = new Title(newTitleOMDb);
                System.out.println("Converted Title:");
                System.out.println(newTitleOMDb);

                titles.add(newMovie);

            } catch (NumberFormatException e) {
                System.out.println("\n" + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Argument has been passed on search");

            }

        }
        System.out.println(titles);



        FileWriter writer = new FileWriter("Titles.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Application Finished!");
    }
}
