package br.com.screenmatch.main;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Title;
import br.com.screenmatch.models.TitleOMDb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the name of a movie: ");
        var search = scan.nextLine();

        String address = "http://www.omdbapi.com/?t=" + search + "&apikey=adb06c56";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//         = gson.fromJson(json, Movie.class);
        TitleOMDb newTitleOMDb = gson.fromJson(json, TitleOMDb.class);
        System.out.println(newTitleOMDb.toString());

        Title newMovie = new Title(newTitleOMDb);
        System.out.println("Converted Title:");
        System.out.println(newTitleOMDb);
    }
}
