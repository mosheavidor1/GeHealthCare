package Ge.Infra.UI.API;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostGE {


    public static void main(String[] args) throws Exception {

        JsonChange NewBooking = new JsonChange();
        NewBooking.JsonChange();

        Gson gson = new Gson();
        String jsonRequest = gson.toJson(NewBooking.JsonChange());
        System.out.println(NewBooking.JsonChange());

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://restful-booker.herokuapp.com/booking"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());

        try {


            JsonChange jsonChange = gson.fromJson(postResponse.body(), JsonChange.class);
            System.out.println(jsonChange.JsonChange());


        } catch (Exception e) {

        }
    }
}
