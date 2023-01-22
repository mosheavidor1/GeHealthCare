

package Ge.Infra.UI.APIX;

import java.util.HashMap;
import java.util.List;

public class Booking {
    private String firstname;
    private String lastname;
    private double totalprice;
    private boolean depositpaid;
    private List<BookingDates> bookingdates;
    private String additionalneeds;

    public Booking() {
    }

    public Booking(HashMap<String, Object> jsonMap) {
        this.firstname = (String) jsonMap.get("firstname");
        this.lastname = (String) jsonMap.get("lastname");
        this.totalprice = (double) jsonMap.get("totalprice");
        this.depositpaid = (boolean) jsonMap.get("depositpaid");
        this.bookingdates = (List<BookingDates>) jsonMap.get("bookingdates");
        this.additionalneeds = (String) jsonMap.get("additionalneeds");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public List<BookingDates> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(List<BookingDates> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}
