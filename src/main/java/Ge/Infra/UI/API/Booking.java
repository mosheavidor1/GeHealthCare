package Ge.Infra.UI.API;
import java.util.HashMap;
import java.util.Set;

public class Booking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private Set<BookingDates> bookingdates;
    private String additionalneeds;

    public Booking() {
    }

    public Booking(HashMap<String, Object> jsonMap) {
        this.firstname = (String) jsonMap.get("firstname");
        this.lastname = (String) jsonMap.get("lastname");
        this.depositpaid = (boolean) jsonMap.get("depositpaid");
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

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public Set<BookingDates> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Set<BookingDates> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

}