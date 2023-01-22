package Ge.Infra.UI.APIX;

public enum EnumID {

        INSTANCE; // singleton instance

        private String bookingId;

        public void setBookingId(String bookingId) {
            this.bookingId = bookingId;
        }

        public String getBookingId() {
            return bookingId;
        }
    }


