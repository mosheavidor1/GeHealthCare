package Ge.Infra.UI.APIX;

import java.util.Date;

public class BookingDates {

        private Date checkin;
        private Date checkout;

        public BookingDates(){}

        public Date getCheckin() {
            return checkin;
        }

        public void setCheckin(Date checkin) {
            this.checkin = checkin;
        }

        public Date getCheckout() {
            return checkout;
        }

        public void setCheckout(Date checkout) {
            this.checkout = checkout;
        }
    }


