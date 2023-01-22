package Ge.Infra.UI.APIX;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DeleteGE {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        deleteBooking(9726);

    }


    public static void deleteBooking(int id) throws IOException, InterruptedException, URISyntaxException {
        JSONObject json = new JSONObject();


        // Convert JSON object to String
        String jsonString = json.toString();

        // Create the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://restful-booker.herokuapp.com/booking/"+14575))
                .PUT(HttpRequest.BodyPublishers.ofString(jsonString))
                .header("Content-Type", "application/json")
                .header("Cookie", "token=77faca7498b7a4c").DELETE()
                .build();

        // Send the request and get the response
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the status code and response body
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
      //  GetGE getGE =new GetGE();

    }
}


