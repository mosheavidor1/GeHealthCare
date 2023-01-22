package Ge.Infra.UI.APIX;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetGE {
        public static void main(String[] args) throws Exception {

            GetGE getGE =new GetGE();


        }

        public GetGE() throws IOException, URISyntaxException, InterruptedException {
                 //Send the POST request and get the response
                HttpResponse<String> postResponse = PostGE.post();

                // Create a BookingId object from the POST response
               BookingId bookingId = new BookingId(postResponse);


                // Create the GET request with the bookingId from the POST response
                HttpRequest request = HttpRequest.newBuilder()
                        //.uri(URI.create("https://restful-booker.herokuapp.com/booking/"+EnumID.INSTANCE.getBookingId()))
                        .uri(URI.create("https://restful-booker.herokuapp.com/booking/11691"))
                        .GET()
                        .header("Accept", "application/json")
                        .build();

                // Send the GET request and get the response
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Print the status code and response body
                System.out.println("Status code: " + response.statusCode());
                System.out.println("Response body: " + response.body());
        }
}
