package org.thetestingacademy.pojos.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.thetestingacademy.pojos.requests.CreateBookingRequest;

public class CreateBookingResponse {

    @SerializedName("bookingid")
    @Expose
    private int bookingid;

    @SerializedName("booking")
    @Expose
    private CreateBookingRequest bookingRequest;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public CreateBookingRequest getBookingRequest() {
        return bookingRequest;
    }

    public void setBookingRequest(CreateBookingRequest bookingRequest) {
        this.bookingRequest = bookingRequest;
    }


}
