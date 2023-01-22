package Ge.Infra.UI.APIX;


import org.json.JSONObject;

import java.net.http.HttpResponse;

public class BookingId {
    private String bookingId;

    public BookingId(HttpResponse<String> response) {
        JSONObject jsonResponse = new JSONObject(response.body());
        int id = jsonResponse.getInt("bookingid");
        EnumID.INSTANCE.setBookingId(Integer.toString(id));


    }



        public String getBookingId() {
            return bookingId;
        }
    }


