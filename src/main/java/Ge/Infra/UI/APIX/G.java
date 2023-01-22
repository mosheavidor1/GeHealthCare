package Ge.Infra.UI.APIX;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class G {
    public static void main(String[] args) throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://restful-booker.herokuapp.com/booking/4184");
        CloseableHttpResponse response = httpClient.execute(httpGet);

// Ensure the request was successful
        if (response.getStatusLine().getStatusCode() == 200) {
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Response Body: " + responseBody);
            // parse response as json
            JSONObject responseJson = new JSONObject(responseBody);
            // access key-value pairs
            System.out.println("firstname: " + responseJson.get("firstname"));
            System.out.println("lastname: " + responseJson.get("lastname"));
            System.out.println("totalprice: " + responseJson.get("totalprice"));
        } else {
            System.out.println("Error: " + response.getStatusLine().getStatusCode());
        }
        httpClient.close();

    }
}
