package org.thetestingacademy.pojos.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateBookingRequest {


    @SerializedName("firstname")
    @Expose
    private String firstName;

    @SerializedName("lastname")
    @Expose
    private String lastName;

    @SerializedName("totalprice")
    @Expose
    private int totalPrice;

    @SerializedName("depositpaid")
    @Expose
    private boolean depositPaid;

    @SerializedName("additionalneeds")
    @Expose
    private String additionalNeeds;

    @SerializedName("bookingdates")
    @Expose
    private BookingDates bookingDates;

    //getters and setters
    public void setBookingDates(BookingDates bookingDates)
    {
        this.bookingDates = bookingDates;
    }

    public BookingDates getBookingDates()
    {
        return  this.bookingDates;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public String getAdditionalNeeds() {
        return additionalNeeds;
    }

    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }
}
