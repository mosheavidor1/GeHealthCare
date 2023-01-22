
package Ge.Infra.UI.API;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class PostGE {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        Type type = new TypeToken<HashMap<String, Object>>() {}.getType();
        HashMap<String, Object> jsonMap = gson.fromJson(JsonConstant.JSON_STRING, type);
        Booking booking = new Booking(jsonMap);
        booking.setFirstname("Moshe");
        booking.setLastname("Avidor");

        String json = gson.toJson(booking);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("https://restful-booker.herokuapp.com/booking");
        post.setHeader("Content-Type", "application/json");
        post.setEntity(new StringEntity(json));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());

         httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://restful-booker.herokuapp.com/booking");
        CloseableHttpResponse GetResponse = httpClient.execute(httpGet);



        String jsonString = EntityUtils.toString(GetResponse.getEntity());
        JSONObject j = new JSONObject(jsonString);


        String firstname = j.getString("firstname");
        System.out.println("firstname: " + firstname);


        httpClient.close();

    }
}
