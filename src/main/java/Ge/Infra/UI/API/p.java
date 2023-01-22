package Ge.Infra.UI.API;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class p {
    public static void main(String[] args) throws Exception {


        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://restful-booker.herokuapp.com/booking");

// set headers
        httpPost.setHeader("Content-Type", "application/json");

        // create JSON object
        JSONObject json = new JSONObject();
        json.put("bookingid", 1);

        // create booking object
        JSONObject booking = new JSONObject();
        booking.put("firstname", "Moshe");
        booking.put("lastname", "Brown");
        booking.put("totalprice", 111);
        booking.put("depositpaid", true);

        // create bookingdates object
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout", "2019-01-01");

// add bookingdates to booking object
        booking.put("bookingdates", bookingDates);

// add additionalneeds to booking object
        booking.put("additionalneeds", "Breakfast");

// add booking to json object
        json.put("booking", booking);

        // set json entity
        StringEntity entity = new StringEntity(json.toString());
        httpPost.setEntity(entity);

        // send post request
        CloseableHttpResponse response = httpClient.execute(httpPost);

        System.out.println(response.getStatusLine().getStatusCode());


  httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://restful-booker.herokuapp.com/booking");

        CloseableHttpResponse getRespone = httpClient.execute(httpGet);
        System.out.println(getRespone.getEntity());

    }
}
