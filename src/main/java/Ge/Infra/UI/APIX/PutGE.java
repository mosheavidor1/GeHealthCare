package Ge.Infra.UI.APIX;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PutGE {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

    updateBooking(1, "James", "Brown", 111, true, "2018-01-01", "2019-01-01", "Breakfast");


}


    public static void updateBooking(int id, String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) throws IOException, InterruptedException, URISyntaxException {
        JSONObject json = new JSONObject();
        json.put("firstname", firstname);
        json.put("lastname", lastname);
        json.put("totalprice", totalprice);
        json.put("depositpaid", depositpaid);
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", checkin);
        bookingDates.put("checkout", checkout);
        json.put("bookingdates", bookingDates);
        json.put("additionalneeds", additionalneeds);

        // Convert JSON object to String
        String jsonString = json.toString();

        // Create the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://restful-booker.herokuapp.com/booking/"+9726))
                .PUT(HttpRequest.BodyPublishers.ofString(jsonString))
                .header("Content-Type", "application/json")
                .header("Cookie", "token=fe2507ddd733baf")
                .build();

        // Send the request and get the response
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the status code and response body
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        GetGE getGE =new GetGE();

    }
}
